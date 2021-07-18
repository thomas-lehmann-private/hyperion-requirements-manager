/*
 * The MIT License
 *
 * Copyright 2021 Thomas Lehmann.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package magic.system.hyperion.components;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing of {@link Requirement}.
 *
 * @author Thomas Lehmann
 */
@DisplayName("Testing of Requirement")
public class RequirementTest {
    /**
     * Test requirement title.
     */
    private static final String TEST_REQ_TITLE = "Easy to use command line interface";

    /**
     * Test requirement milestone.
     */
    private static final String TEST_REQ_META_MILESTONE = "1.0.0";

    /**
     * Test requirement context.
     */
    private static final String TEST_REQ_META_CONTEXT = "cli";

    /**
     * Test requirement description.
     */
    private static final String TEST_REQ_DESCRIPTION
            = "As a developer creating a requirement should be easy";

    /**
     * Test requirement constraints.
     */
    private static final List<String> TEST_REQ_CONSTRAINTS = List.of("No contrains");

    /**
     * Test requirement criticalities and risks.
     */
    private static final List<String> TEST_REQ_CRITICALITIES_AND_RISKS
            = List.of("No criticalities or risks");

    @Test
    public void testDefault() {
        final var requirement = new Requirement(1, TEST_REQ_TITLE,
                new RequirementMetaInformation(TEST_REQ_META_MILESTONE, TEST_REQ_META_CONTEXT),
                TEST_REQ_DESCRIPTION, TEST_REQ_CONSTRAINTS, TEST_REQ_CRITICALITIES_AND_RISKS);

        assertEquals(TEST_REQ_TITLE, requirement.getTitle());
        assertEquals(TEST_REQ_DESCRIPTION, requirement.getDescription());
        assertEquals(TEST_REQ_META_MILESTONE, requirement.getMetaInformation().getMilestone());
        assertEquals(TEST_REQ_META_CONTEXT, requirement.getMetaInformation().getContext());
        assertEquals(TEST_REQ_CONSTRAINTS, requirement.getConstraints());
        assertEquals(TEST_REQ_CRITICALITIES_AND_RISKS, requirement.getCriticalitiesAndRisks());
    }
}
