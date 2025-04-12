/*
 * Copyright © 2025 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 */

package io.cdap.wrangler.api.parser;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for ByteSize.
 */
public class ByteSizeTest {

    @Test
    public void testValidByteSizes() {
        ByteSize byteSize1 = new ByteSize("10KB");
        Assert.assertEquals(10240L, byteSize1.getBytes());

        ByteSize byteSize2 = new ByteSize("1.5MB");
        Assert.assertEquals(1572864L, byteSize2.getBytes());

        ByteSize byteSize3 = new ByteSize("2GB");
        Assert.assertEquals(2147483648L, byteSize3.getBytes());
    }

    @Test
    public void testInvalidByteSizes() {
        try {
            new ByteSize("10XYZ").getBytes();
            Assert.fail("Expected IllegalArgumentException for invalid unit");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid byte size unit"));
        }

        try {
            new ByteSize("ABCMB").getBytes();
            Assert.fail("Expected IllegalArgumentException for invalid number");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid byte size value"));
        }
    }
}
