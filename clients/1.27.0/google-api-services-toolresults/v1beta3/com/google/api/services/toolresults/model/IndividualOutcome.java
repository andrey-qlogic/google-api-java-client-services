/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.toolresults.model;

/**
 * Step Id and outcome of each individual step that was run as a group with other steps with the
 * same configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndividualOutcome extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outcomeSummary;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOutcomeSummary() {
    return outcomeSummary;
  }

  /**
   * @param outcomeSummary outcomeSummary or {@code null} for none
   */
  public IndividualOutcome setOutcomeSummary(java.lang.String outcomeSummary) {
    this.outcomeSummary = outcomeSummary;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStepId() {
    return stepId;
  }

  /**
   * @param stepId stepId or {@code null} for none
   */
  public IndividualOutcome setStepId(java.lang.String stepId) {
    this.stepId = stepId;
    return this;
  }

  @Override
  public IndividualOutcome set(String fieldName, Object value) {
    return (IndividualOutcome) super.set(fieldName, value);
  }

  @Override
  public IndividualOutcome clone() {
    return (IndividualOutcome) super.clone();
  }

}
