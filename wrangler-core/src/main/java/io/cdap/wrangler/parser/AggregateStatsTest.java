package io.cdap.wrangler.directive;

import io.cdap.wrangler.api.Row;
import io.cdap.wrangler.api.parser.ByteSize;
import io.cdap.wrangler.api.parser.TimeDuration;
import io.cdap.wrangler.TestingRig;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AggregateStatsTest {
    @Test
    public void testAggregateStats() throws Exception {
        // Input rows
        List<Row> rows = new ArrayList<>();
        rows.add(new Row("data_transfer_size", "10KB").add("response_time", "3s"));
        rows.add(new Row("data_transfer_size", "20KB").add("response_time", "2s"));
        rows.add(new Row("data_transfer_size", "30KB").add("response_time", "1s"));

        // Recipe
        String[] recipe = new String[]{
                "aggregate-stats :data_transfer_size :response_time :total_size_mb :total_time_sec"
        };

        // Execute recipe
        List<Row> results = TestingRig.execute(recipe, rows);

        // Validate results
        Assert.assertEquals(1, results.size());
        Row result = results.get(0);

        // Total size in MB (10 + 20 + 30 KB = 60 KB = 0.05859375 MB)
        Assert.assertEquals(0.05859375, (double) result.getValue("total_size_mb"), 0.0001);

        // Total time in seconds (3 + 2 + 1 = 6 seconds)
        Assert.assertEquals(6.0, (double) result.getValue("total_time_sec"), 0.0001);
    }
}