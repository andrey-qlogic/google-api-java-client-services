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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * Represents creative restrictions associated to Programmatic Guaranteed/ Preferred Deal in DFP.
 * This doesn't apply to Private Auction and AdX Preferred Deals.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeRestrictions extends com.google.api.client.json.GenericJson {

  /**
   * The format of the environment that the creatives will be displayed in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creativeFormat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CreativeSpecification> creativeSpecifications;

  static {
    // hack to force ProGuard to consider CreativeSpecification used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CreativeSpecification.class);
  }

  /**
   * Skippable video ads allow viewers to skip ads after 5 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skippableAdType;

  /**
   * The format of the environment that the creatives will be displayed in.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreativeFormat() {
    return creativeFormat;
  }

  /**
   * The format of the environment that the creatives will be displayed in.
   * @param creativeFormat creativeFormat or {@code null} for none
   */
  public CreativeRestrictions setCreativeFormat(java.lang.String creativeFormat) {
    this.creativeFormat = creativeFormat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<CreativeSpecification> getCreativeSpecifications() {
    return creativeSpecifications;
  }

  /**
   * @param creativeSpecifications creativeSpecifications or {@code null} for none
   */
  public CreativeRestrictions setCreativeSpecifications(java.util.List<CreativeSpecification> creativeSpecifications) {
    this.creativeSpecifications = creativeSpecifications;
    return this;
  }

  /**
   * Skippable video ads allow viewers to skip ads after 5 seconds.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkippableAdType() {
    return skippableAdType;
  }

  /**
   * Skippable video ads allow viewers to skip ads after 5 seconds.
   * @param skippableAdType skippableAdType or {@code null} for none
   */
  public CreativeRestrictions setSkippableAdType(java.lang.String skippableAdType) {
    this.skippableAdType = skippableAdType;
    return this;
  }

  @Override
  public CreativeRestrictions set(String fieldName, Object value) {
    return (CreativeRestrictions) super.set(fieldName, value);
  }

  @Override
  public CreativeRestrictions clone() {
    return (CreativeRestrictions) super.clone();
  }

}