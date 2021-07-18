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

import java.util.ArrayList;
import java.util.List;

/**
 * Model of one requirement.
 *
 * @author Thomas Lehmann
 */
public class Requirement {
    /**
     * Unique id of the requirement.
     */
    private final long lId;

    /**
     * Title of the requirement.
     */
    private final String strTitle;

    /**
     * Meta information of one requirement.
     */
    private final RequirementMetaInformation metaInformation;

    /**
     * The markdown text describing the requirement with more details.
     */
    private final String strDescription;

    /**
     * Constraints related to the feature the requirement is for.
     */
    private final List<String> constraints;

    /**
     * Criticalities and risks related to feature the requirement is for.
     */
    private final List<String> criticalitiesAndRisks;

    /**
     * Initialize requirement.
     *
     * @param lInitId                   unique id of the requirement.
     * @param strInitTitle              readable/understandable requirement title.
     * @param initMetaInformation       meta information of the requirement.
     * @param strInitDescription        The markdown text describing the requirement
     *                                  with more details.
     * @param initConstraints           Constraints related to the feature the requirement is for.
     * @param initCriticalitiesAndRisks Criticalities and risks related to feature
     *                                  the requirement is for.
     */
    public Requirement(final long lInitId, final String strInitTitle,
                final RequirementMetaInformation initMetaInformation,
                final String strInitDescription, final List<String> initConstraints,
                final List<String> initCriticalitiesAndRisks) {
        this.lId = lInitId;
        this.strTitle = strInitTitle;
        this.metaInformation = initMetaInformation;
        this.strDescription = strInitDescription;
        this.constraints = new ArrayList<>(initConstraints);
        this.criticalitiesAndRisks = initCriticalitiesAndRisks;
    }

    /**
     * Get unique id of the requirement.
     *
     * @return unique id of the requirement.
     * @since 1.0.0
     */
    public long getId() {
        return lId;
    }

    /**
     * Get title of requirement.
     *
     * @return title of requirement.
     * @since 1.0.0
     */
    public String getTitle() {
        return strTitle;
    }

    /**
     * Get meta information of requirement.
     *
     * @return meta information of requirement.
     * @since 1.0.0
     */
    public RequirementMetaInformation getMetaInformation() {
        return metaInformation;
    }

    /**
     * Get description of requirement.
     *
     * @return description of requirement.
     * @since 1.0.0
     */
    public String getDescription() {
        return strDescription;
    }

    /**
     * Get constraints of implementation basing of given requirement.
     *
     * @return list of constraints.
     * @since 1.0.0
     */
    public List<String> getConstraints() {
        return constraints;
    }

    /**
     * Get criticalities and risks.
     *
     * @return list of criticalities and risks.
     * @since 1.0.0
     */
    public List<String> getCriticalitiesAndRisks() {
        return criticalitiesAndRisks;
    }
}
