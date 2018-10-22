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

package com.google.api.services.dlp.v2.model;

/**
 * Message for a unique key indicating a record that contains a finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2RecordKey extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryKey bigQueryKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DatastoreKey datastoreKey;

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryKey getBigQueryKey() {
    return bigQueryKey;
  }

  /**
   * @param bigQueryKey bigQueryKey or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordKey setBigQueryKey(GooglePrivacyDlpV2BigQueryKey bigQueryKey) {
    this.bigQueryKey = bigQueryKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DatastoreKey getDatastoreKey() {
    return datastoreKey;
  }

  /**
   * @param datastoreKey datastoreKey or {@code null} for none
   */
  public GooglePrivacyDlpV2RecordKey setDatastoreKey(GooglePrivacyDlpV2DatastoreKey datastoreKey) {
    this.datastoreKey = datastoreKey;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2RecordKey set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2RecordKey) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2RecordKey clone() {
    return (GooglePrivacyDlpV2RecordKey) super.clone();
  }

}