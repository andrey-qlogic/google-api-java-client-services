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

package com.google.api.services.testing.model;

/**
 * Locations where the results of running the test are stored.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResultStorage extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudStorage googleCloudStorage;

  /**
   * The tool results execution that results are written to. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ToolResultsExecution toolResultsExecution;

  /**
   * The tool results history that contains the tool results execution that results are written to.
   *
   * Optional, if not provided the service will choose an appropriate value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ToolResultsHistory toolResultsHistory;

  /**
   * Required.
   * @return value or {@code null} for none
   */
  public GoogleCloudStorage getGoogleCloudStorage() {
    return googleCloudStorage;
  }

  /**
   * Required.
   * @param googleCloudStorage googleCloudStorage or {@code null} for none
   */
  public ResultStorage setGoogleCloudStorage(GoogleCloudStorage googleCloudStorage) {
    this.googleCloudStorage = googleCloudStorage;
    return this;
  }

  /**
   * The tool results execution that results are written to. @OutputOnly
   * @return value or {@code null} for none
   */
  public ToolResultsExecution getToolResultsExecution() {
    return toolResultsExecution;
  }

  /**
   * The tool results execution that results are written to. @OutputOnly
   * @param toolResultsExecution toolResultsExecution or {@code null} for none
   */
  public ResultStorage setToolResultsExecution(ToolResultsExecution toolResultsExecution) {
    this.toolResultsExecution = toolResultsExecution;
    return this;
  }

  /**
   * The tool results history that contains the tool results execution that results are written to.
   *
   * Optional, if not provided the service will choose an appropriate value.
   * @return value or {@code null} for none
   */
  public ToolResultsHistory getToolResultsHistory() {
    return toolResultsHistory;
  }

  /**
   * The tool results history that contains the tool results execution that results are written to.
   *
   * Optional, if not provided the service will choose an appropriate value.
   * @param toolResultsHistory toolResultsHistory or {@code null} for none
   */
  public ResultStorage setToolResultsHistory(ToolResultsHistory toolResultsHistory) {
    this.toolResultsHistory = toolResultsHistory;
    return this;
  }

  @Override
  public ResultStorage set(String fieldName, Object value) {
    return (ResultStorage) super.set(fieldName, value);
  }

  @Override
  public ResultStorage clone() {
    return (ResultStorage) super.clone();
  }

}