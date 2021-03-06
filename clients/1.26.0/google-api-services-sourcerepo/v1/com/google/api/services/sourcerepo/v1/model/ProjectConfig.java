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

package com.google.api.services.sourcerepo.v1.model;

/**
 * Cloud Source Repositories configuration of a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Source Repositories API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectConfig extends com.google.api.client.json.GenericJson {

  /**
   * Reject a Git push that contains a private key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enablePrivateKeyCheck;

  /**
   * The name of the project. Values are of the form `projects/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the
   * topic names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, PubsubConfig> pubsubConfigs;

  /**
   * Reject a Git push that contains a private key.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnablePrivateKeyCheck() {
    return enablePrivateKeyCheck;
  }

  /**
   * Reject a Git push that contains a private key.
   * @param enablePrivateKeyCheck enablePrivateKeyCheck or {@code null} for none
   */
  public ProjectConfig setEnablePrivateKeyCheck(java.lang.Boolean enablePrivateKeyCheck) {
    this.enablePrivateKeyCheck = enablePrivateKeyCheck;
    return this;
  }

  /**
   * The name of the project. Values are of the form `projects/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the project. Values are of the form `projects/`.
   * @param name name or {@code null} for none
   */
  public ProjectConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the
   * topic names.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, PubsubConfig> getPubsubConfigs() {
    return pubsubConfigs;
  }

  /**
   * How this project publishes a change in the repositories through Cloud Pub/Sub. Keyed by the
   * topic names.
   * @param pubsubConfigs pubsubConfigs or {@code null} for none
   */
  public ProjectConfig setPubsubConfigs(java.util.Map<String, PubsubConfig> pubsubConfigs) {
    this.pubsubConfigs = pubsubConfigs;
    return this;
  }

  @Override
  public ProjectConfig set(String fieldName, Object value) {
    return (ProjectConfig) super.set(fieldName, value);
  }

  @Override
  public ProjectConfig clone() {
    return (ProjectConfig) super.clone();
  }

}
