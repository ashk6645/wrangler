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
 * Represents a byte size token (e.g., "10KB", "1.5MB").
 */
public final class ByteSize implements Token {
    /** Number of bytes in a kilobyte. */
    private static final int KILOBYTE = 1024;

    /** Number of bytes in a megabyte. */
    private static final int MEGABYTE = 1024 * 1024;

    /** Number of bytes in a gigabyte. */
    private static final int GIGABYTE = 1024 * 1024 * 1024;

    /** The byte size value as a string. */
    private final String value;

    /**
     * Constructs a ByteSize object with the given value.
     *
     * @param val the byte size value as a string.
     */
    public ByteSize(final String val) {
        this.value = val;
    }

    /**
     * Converts the byte size value to bytes.
     *
     * @return the size in bytes.
     * @throws IllegalArgumentException if the unit is invalid.
     */
    public long getBytes() {
        if (value.endsWith("KB")) {
            return Long.parseLong(value.replace("KB", "")) * KILOBYTE;
        } else if (value.endsWith("MB")) {
            return Long.parseLong(value.replace("MB", "")) * MEGABYTE;
        } else if (value.endsWith("GB")) {
            return Long.parseLong(value.replace("GB", "")) * GIGABYTE;
        } else {
            throw new IllegalArgumentException("Invalid byte size unit: "
                    + value);
        }
    }

    @Override
    public Object value() {
        return getBytes();
    }

    @Override
    public TokenType type() {
        return TokenType.BYTE_SIZE;
    }

    @Override
    public JsonElement toJson() {
        JsonObject json = new JsonObject();
        json.addProperty("value", this.value);
        json.addProperty("bytes", getBytes());
        return json;
    }
}
