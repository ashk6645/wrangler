/*
 * Copyright © 2025 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.cdap.wrangler.api.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Represents a time duration token (e.g., "150ms", "2.5s").
 */
public final class TimeDuration implements Token {
    /** Number of milliseconds in a second. */
    private static final int MILLISECONDS_IN_SECOND = 1000;

    /** Number of milliseconds in an hour. */
    private static final int MILLISECONDS_IN_HOUR = 3600000;

    /** The time duration value as a string. */
    private final String value;

    /**
     * Constructs a TimeDuration object with the given value.
     *
     * @param val the time duration value as a string.
     */
    public TimeDuration(final String val) {
        this.value = val;
    }

    /**
     * Converts the time duration value to milliseconds.
     *
     * @return the duration in milliseconds.
     * @throws IllegalArgumentException if the unit is invalid.
     */
    public long getMilliseconds() {
        if (value.endsWith("ms")) {
            return Long.parseLong(value.replace("ms", ""));
        } else if (value.endsWith("s")) {
            return (long) (Double.parseDouble(value.replace("s", ""))
                    * MILLISECONDS_IN_SECOND);
        } else if (value.endsWith("h")) {
            return Long.parseLong(value.replace("h", ""))
                    * MILLISECONDS_IN_HOUR;
        } else {
            throw new IllegalArgumentException("Invalid time duration unit: "
                    + value);
        }
    }

    @Override
    public Object value() {
        return getMilliseconds();
    }

    @Override
    public TokenType type() {
        return TokenType.TIME_DURATION;
    }

    @Override
    public JsonElement toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("value", value);
        json.addProperty("milliseconds", getMilliseconds());
        return json;
    }
}
