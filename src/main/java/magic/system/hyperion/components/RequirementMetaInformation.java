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

/**
 * Meta information of one requirement.
 *
 * @author Thomas Lehmann
 */
public class RequirementMetaInformation {
    /**
     * Related milestone (version) when the requirements has been implemented.
     */
    private final String strMilestone;

    /**
     * Any context.
     */
    private final String strContext;

    /**
     * initialize meta information of a requirement.
     *
     * @param strInitMilestone Related milestone (version) when
     *                         the requirements has been implemented.
     * @param strInitContext   Any context.
     * @since 1.0.0
     */
    public RequirementMetaInformation(final String strInitMilestone, final String strInitContext) {
        this.strMilestone = strInitMilestone;
        this.strContext = strInitContext;
    }

    /**
     * Get related milestone (version) when the requirements has been implemented.
     *
     * @return related milestone (version) when the requirements has been implemented.
     * @since 1.0.0
     */
    public String getMilestone() {
        return strMilestone;
    }

    /**
     * Get context of requirement.
     *
     * @return context of requirement.
     * @since 1.0.0
     */
    public String getContext() {
        return strContext;
    }
}
