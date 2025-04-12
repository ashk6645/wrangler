package io.cdap.wrangler.directive;

import io.cdap.wrangler.api.Row;
import io.cdap.wrangler.api.annotations.PublicDirective;
import io.cdap.wrangler.api.parser.ColumnName;
import io.cdap.wrangler.api.parser.UsageDefinition;
import io.cdap.wrangler.api.parser.Text;
import io.cdap.wrangler.api.parser.TokenGroup;
import io.cdap.wrangler.api.Directive;
import io.cdap.wrangler.api.ExecutorContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Directive for aggregating byte sizes and time durations.
 */
@PublicDirective
public class AggregateStats implements Directive {
    private String byteSourceColumn;
    private String timeSourceColumn;
    private String sizeTargetColumn;
    private String timeTargetColumn;
    private String sizeUnit = "MB"; // Default output unit for size
    private String timeUnit = "seconds"; // Default output unit for time
    private double sizeTotal = 0;
    private double timeTotal = 0;

    @Override
    public UsageDefinition define() {
        return UsageDefinition.builder("aggregate-stats")
                .define("byteSourceColumn", ColumnName.class, "Source column for byte sizes")
                .define("timeSourceColumn", ColumnName.class, "Source column for time durations")
                .define("sizeTargetColumn", ColumnName.class, "Target column for total size")
                .define("timeTargetColumn", ColumnName.class, "Target column for total time")
                .defineOptional("sizeUnit", Text.class, "Output unit for size (e.g., MB, GB)")
                .defineOptional("timeUnit", Text.class, "Output unit for time (e.g., seconds, minutes)")
                .build();
    }

    @Override
    public void initialize(TokenGroup args) {
        byteSourceColumn = ((ColumnName) args.getValue("byteSourceColumn")).value();
        timeSourceColumn = ((ColumnName) args.getValue("timeSourceColumn")).value();
        sizeTargetColumn = ((ColumnName) args.getValue("sizeTargetColumn")).value();
        timeTargetColumn = ((ColumnName) args.getValue("timeTargetColumn")).value();

        if (args.has("sizeUnit")) {
            sizeUnit = ((Text) args.getValue("sizeUnit")).value();
        }
        if (args.has("timeUnit")) {
            timeUnit = ((Text) args.getValue("timeUnit")).value();
        }
    }

    @Override
    public List<Row> execute(List<Row> rows, ExecutorContext executorContext) throws Exception {
        sizeTotal = 0;
        timeTotal = 0;

        for (Row row : rows) {
            // Retrieve values from the source columns
            Object byteSizeValue = row.getValue(byteSourceColumn);
            Object timeDurationValue = row.getValue(timeSourceColumn);

            double byteSize = byteSizeValue != null ? ByteSize.parse(byteSizeValue.toString()).getBytes() : 0;
            double timeDuration = timeDurationValue != null ? TimeDuration.parse(timeDurationValue.toString()).getNanoseconds() : 0;

            sizeTotal += byteSize;
            timeTotal += timeDuration;
        }

        // Convert totals to target units
        double convertedSize = convertSize(sizeTotal, sizeUnit);
        double convertedTime = convertTime(timeTotal, timeUnit);

        // Create a new row with aggregated values
        Row result = new Row();
        result.add(sizeTargetColumn, convertedSize);
        result.add(timeTargetColumn, convertedTime);

        return List.of(result);
    }

    private double convertSize(double sizeInBytes, String unit) {
        switch (unit.toUpperCase()) {
            case "GB":
                return sizeInBytes / (1024 * 1024 * 1024);
            case "MB":
                return sizeInBytes / (1024 * 1024);
            case "KB":
                return sizeInBytes / 1024;
            default:
                return sizeInBytes;
        }
    }

    private double convertTime(double timeInNanoseconds, String unit) {
        switch (unit.toLowerCase()) {
            case "minutes":
                return timeInNanoseconds / (60_000_000_000.0);
            case "seconds":
                return timeInNanoseconds / 1_000_000_000.0;
            case "milliseconds":
                return timeInNanoseconds / 1_000_000.0;
            default:
                return timeInNanoseconds;
        }
    }

    @Override
    public void destroy() {
        // No cleanup required
    }
}