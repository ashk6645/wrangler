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
 * Test class for TimeDuration.
 */
public class TimeDurationTest {

    @Test
    public void testValidTimeDurations() {
        TimeDuration timeDuration1 = new TimeDuration("150ms");
        Assert.assertEquals(150L, timeDuration1.getMilliseconds());

        TimeDuration timeDuration2 = new TimeDuration("2.5s");
        Assert.assertEquals(2500L, timeDuration2.getMilliseconds());

        TimeDuration timeDuration3 = new TimeDuration("1h");
        Assert.assertEquals(3600000L, timeDuration3.getMilliseconds());
    }

    @Test
    public void testInvalidTimeDurations() {
        try {
            new TimeDuration("100XYZ").getMilliseconds();
            Assert.fail("Expected IllegalArgumentException for invalid unit");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid time duration unit"));
        }

        try {
            new TimeDuration("ABCms").getMilliseconds();
            Assert.fail("Expected IllegalArgumentException for invalid number");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Invalid time duration value"));
        }
    }
}
