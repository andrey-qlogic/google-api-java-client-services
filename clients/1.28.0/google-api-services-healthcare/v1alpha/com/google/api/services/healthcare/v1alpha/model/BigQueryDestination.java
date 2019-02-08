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
 * The BigQuery table to which the output should be written.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BigQueryDestination extends com.google.api.client.json.GenericJson {

  /**
   * Required. The BigQuery dataset to which the DICOM store should be exported. If this dataset
   * does not exist, the export call returns an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the DICOM store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean overwriteTable;

  /**
   * Required. The BigQuery table to which the DICOM store should be written. If this table does not
   * exist, a new table with the given name will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String table;

  /**
   * Required. The BigQuery dataset to which the DICOM store should be exported. If this dataset
   * does not exist, the export call returns an error.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * Required. The BigQuery dataset to which the DICOM store should be exported. If this dataset
   * does not exist, the export call returns an error.
   * @param dataset dataset or {@code null} for none
   */
  public BigQueryDestination setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the DICOM store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOverwriteTable() {
    return overwriteTable;
  }

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the DICOM store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * @param overwriteTable overwriteTable or {@code null} for none
   */
  public BigQueryDestination setOverwriteTable(java.lang.Boolean overwriteTable) {
    this.overwriteTable = overwriteTable;
    return this;
  }

  /**
   * Required. The BigQuery table to which the DICOM store should be written. If this table does not
   * exist, a new table with the given name will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getTable() {
    return table;
  }

  /**
   * Required. The BigQuery table to which the DICOM store should be written. If this table does not
   * exist, a new table with the given name will be created.
   * @param table table or {@code null} for none
   */
  public BigQueryDestination setTable(java.lang.String table) {
    this.table = table;
    return this;
  }

  @Override
  public BigQueryDestination set(String fieldName, Object value) {
    return (BigQueryDestination) super.set(fieldName, value);
  }

  @Override
  public BigQueryDestination clone() {
    return (BigQueryDestination) super.clone();
  }

}
