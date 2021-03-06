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

package com.google.api.services.content.model;

/**
 * Model definition for OrderLineItemReturnInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderLineItemReturnInfo extends com.google.api.client.json.GenericJson {

  /**
   * How many days later the item can be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer daysToReturn;

  /**
   * Whether the item is returnable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isReturnable;

  /**
   * URL of the item return policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyUrl;

  /**
   * How many days later the item can be returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDaysToReturn() {
    return daysToReturn;
  }

  /**
   * How many days later the item can be returned.
   * @param daysToReturn daysToReturn or {@code null} for none
   */
  public OrderLineItemReturnInfo setDaysToReturn(java.lang.Integer daysToReturn) {
    this.daysToReturn = daysToReturn;
    return this;
  }

  /**
   * Whether the item is returnable.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsReturnable() {
    return isReturnable;
  }

  /**
   * Whether the item is returnable.
   * @param isReturnable isReturnable or {@code null} for none
   */
  public OrderLineItemReturnInfo setIsReturnable(java.lang.Boolean isReturnable) {
    this.isReturnable = isReturnable;
    return this;
  }

  /**
   * URL of the item return policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyUrl() {
    return policyUrl;
  }

  /**
   * URL of the item return policy.
   * @param policyUrl policyUrl or {@code null} for none
   */
  public OrderLineItemReturnInfo setPolicyUrl(java.lang.String policyUrl) {
    this.policyUrl = policyUrl;
    return this;
  }

  @Override
  public OrderLineItemReturnInfo set(String fieldName, Object value) {
    return (OrderLineItemReturnInfo) super.set(fieldName, value);
  }

  @Override
  public OrderLineItemReturnInfo clone() {
    return (OrderLineItemReturnInfo) super.clone();
  }

}
