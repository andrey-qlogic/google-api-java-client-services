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

package com.google.dataproc.model;

/**
 * A configurable parameter that replaces one or more fields in the template. Parameterizable
 * fields: - Labels - File uris - Job properties - Job arguments - Script variables - Main class (in
 * HadoopJob and SparkJob) - Zone (in ClusterSelector)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TemplateParameter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Brief description of the parameter. Must not exceed 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at
   * most one parameter's list of field paths.A field path is similar in syntax to a
   * google.protobuf.FieldMask. For example, a field path that references the zone field of a
   * workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also,
   * field paths can reference fields using the following syntax: Values in maps can be referenced
   * by key. Examples labels'key' placement.clusterSelector.clusterLabels'key'
   * placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobsstep-
   * id.labels'key' Jobs in the jobs list can be referenced by step-id. Examples: jobsstep-
   * id.hadoopJob.mainJarFileUri jobsstep-id.hiveJob.queryFileUri jobsstep-
   * id.pySparkJob.mainPythonFileUri jobsstep-id.hadoopJob.jarFileUris0 jobsstep-
   * id.hadoopJob.archiveUris0 jobsstep-id.hadoopJob.fileUris0 jobsstep-
   * id.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index.
   * Example: jobsstep-id.sparkJob.args0 Other examples: jobsstep-id.hadoopJob.properties'key'
   * jobsstep-id.hadoopJob.args0 jobsstep-id.hiveJob.scriptVariables'key' jobsstep-
   * id.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to
   * parameterize maps and repeated fields in their entirety since only individual map values and
   * individual items in repeated fields can be referenced. For example, the following field paths
   * are invalid: placement.clusterSelector.clusterLabels jobsstep-id.sparkJob.args
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fields;

  /**
   * Required. Parameter name. The parameter name is used as the key, and paired with the parameter
   * value, which are passed to the template when the template is instantiated. The name must
   * contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with
   * a number. The maximum length is 40 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Validation rules to be applied to this parameter's value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParameterValidation validation;

  /**
   * Optional. Brief description of the parameter. Must not exceed 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Brief description of the parameter. Must not exceed 1024 characters.
   * @param description description or {@code null} for none
   */
  public TemplateParameter setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at
   * most one parameter's list of field paths.A field path is similar in syntax to a
   * google.protobuf.FieldMask. For example, a field path that references the zone field of a
   * workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also,
   * field paths can reference fields using the following syntax: Values in maps can be referenced
   * by key. Examples labels'key' placement.clusterSelector.clusterLabels'key'
   * placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobsstep-
   * id.labels'key' Jobs in the jobs list can be referenced by step-id. Examples: jobsstep-
   * id.hadoopJob.mainJarFileUri jobsstep-id.hiveJob.queryFileUri jobsstep-
   * id.pySparkJob.mainPythonFileUri jobsstep-id.hadoopJob.jarFileUris0 jobsstep-
   * id.hadoopJob.archiveUris0 jobsstep-id.hadoopJob.fileUris0 jobsstep-
   * id.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index.
   * Example: jobsstep-id.sparkJob.args0 Other examples: jobsstep-id.hadoopJob.properties'key'
   * jobsstep-id.hadoopJob.args0 jobsstep-id.hiveJob.scriptVariables'key' jobsstep-
   * id.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to
   * parameterize maps and repeated fields in their entirety since only individual map values and
   * individual items in repeated fields can be referenced. For example, the following field paths
   * are invalid: placement.clusterSelector.clusterLabels jobsstep-id.sparkJob.args
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFields() {
    return fields;
  }

  /**
   * Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at
   * most one parameter's list of field paths.A field path is similar in syntax to a
   * google.protobuf.FieldMask. For example, a field path that references the zone field of a
   * workflow template's cluster selector would be specified as placement.clusterSelector.zone.Also,
   * field paths can reference fields using the following syntax: Values in maps can be referenced
   * by key. Examples labels'key' placement.clusterSelector.clusterLabels'key'
   * placement.managedCluster.labels'key' placement.clusterSelector.clusterLabels'key' jobsstep-
   * id.labels'key' Jobs in the jobs list can be referenced by step-id. Examples: jobsstep-
   * id.hadoopJob.mainJarFileUri jobsstep-id.hiveJob.queryFileUri jobsstep-
   * id.pySparkJob.mainPythonFileUri jobsstep-id.hadoopJob.jarFileUris0 jobsstep-
   * id.hadoopJob.archiveUris0 jobsstep-id.hadoopJob.fileUris0 jobsstep-
   * id.pySparkJob.pythonFileUris0 Items in repeated fields can be referenced by a zero-based index.
   * Example: jobsstep-id.sparkJob.args0 Other examples: jobsstep-id.hadoopJob.properties'key'
   * jobsstep-id.hadoopJob.args0 jobsstep-id.hiveJob.scriptVariables'key' jobsstep-
   * id.hadoopJob.mainJarFileUri placement.clusterSelector.zoneIt may not be possible to
   * parameterize maps and repeated fields in their entirety since only individual map values and
   * individual items in repeated fields can be referenced. For example, the following field paths
   * are invalid: placement.clusterSelector.clusterLabels jobsstep-id.sparkJob.args
   * @param fields fields or {@code null} for none
   */
  public TemplateParameter setFields(java.util.List<java.lang.String> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Required. Parameter name. The parameter name is used as the key, and paired with the parameter
   * value, which are passed to the template when the template is instantiated. The name must
   * contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with
   * a number. The maximum length is 40 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Parameter name. The parameter name is used as the key, and paired with the parameter
   * value, which are passed to the template when the template is instantiated. The name must
   * contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with
   * a number. The maximum length is 40 characters.
   * @param name name or {@code null} for none
   */
  public TemplateParameter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Validation rules to be applied to this parameter's value.
   * @return value or {@code null} for none
   */
  public ParameterValidation getValidation() {
    return validation;
  }

  /**
   * Optional. Validation rules to be applied to this parameter's value.
   * @param validation validation or {@code null} for none
   */
  public TemplateParameter setValidation(ParameterValidation validation) {
    this.validation = validation;
    return this;
  }

  @Override
  public TemplateParameter set(String fieldName, Object value) {
    return (TemplateParameter) super.set(fieldName, value);
  }

  @Override
  public TemplateParameter clone() {
    return (TemplateParameter) super.clone();
  }

}