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

package com.google.api.services.healthcare.v1alpha.model;

/**
 * Specifies the location(s) to which data should be exported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OutputConfig extends com.google.api.client.json.GenericJson {

  /**
   * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor` and
   * `roles/bigquery.jobUser`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryDestination bigQueryDestination;

  /**
   * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note that writing a file to
   * the same destination multiple times will result in the previous version of the file being
   * overwritten.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsDestination gcsDestination;

  /**
   * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor` and
   * `roles/bigquery.jobUser`.
   * @return value or {@code null} for none
   */
  public BigQueryDestination getBigQueryDestination() {
    return bigQueryDestination;
  }

  /**
   * BigQueryDestination requires two IAM roles: `roles/bigquery.dataEditor` and
   * `roles/bigquery.jobUser`.
   * @param bigQueryDestination bigQueryDestination or {@code null} for none
   */
  public OutputConfig setBigQueryDestination(BigQueryDestination bigQueryDestination) {
    this.bigQueryDestination = bigQueryDestination;
    return this;
  }

  /**
   * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note that writing a file to
   * the same destination multiple times will result in the previous version of the file being
   * overwritten.
   * @return value or {@code null} for none
   */
  public GcsDestination getGcsDestination() {
    return gcsDestination;
  }

  /**
   * GcsDestination requires `roles/storage.objectAdmin` Cloud IAM role. Note that writing a file to
   * the same destination multiple times will result in the previous version of the file being
   * overwritten.
   * @param gcsDestination gcsDestination or {@code null} for none
   */
  public OutputConfig setGcsDestination(GcsDestination gcsDestination) {
    this.gcsDestination = gcsDestination;
    return this;
  }

  @Override
  public OutputConfig set(String fieldName, Object value) {
    return (OutputConfig) super.set(fieldName, value);
  }

  @Override
  public OutputConfig clone() {
    return (OutputConfig) super.clone();
  }

}
