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
 * Model definition for InvoiceSummary.
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
public final class InvoiceSummary extends com.google.api.client.json.GenericJson {

  /**
   * Summary of the total amounts of the additional charges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InvoiceSummaryAdditionalChargeSummary> additionalChargeSummaries;

  /**
   * [required] Customer balance on this invoice. A negative amount means the customer is paying, a
   * positive one means the customer is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   *
   * Furthermore the absolute value of this amount is expected to be equal to the sum of product
   * amount and additional charges, minus promotions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount customerBalance;

  /**
   * [required] Google balance on this invoice. A negative amount means Google is paying, a positive
   * one means Google is receiving money. Note: the sum of merchant_balance, customer_balance and
   * google_balance must always be zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount googleBalance;

  /**
   * [required] Merchant balance on this invoice. A negative amount means the merchant is paying, a
   * positive one means the merchant is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount merchantBalance;

  /**
   * [required] Total price for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount productTotal;

  /**
   * Summary for each promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Promotion> promotionSummaries;

  /**
   * Summary of the total amounts of the additional charges.
   * @return value or {@code null} for none
   */
  public java.util.List<InvoiceSummaryAdditionalChargeSummary> getAdditionalChargeSummaries() {
    return additionalChargeSummaries;
  }

  /**
   * Summary of the total amounts of the additional charges.
   * @param additionalChargeSummaries additionalChargeSummaries or {@code null} for none
   */
  public InvoiceSummary setAdditionalChargeSummaries(java.util.List<InvoiceSummaryAdditionalChargeSummary> additionalChargeSummaries) {
    this.additionalChargeSummaries = additionalChargeSummaries;
    return this;
  }

  /**
   * [required] Customer balance on this invoice. A negative amount means the customer is paying, a
   * positive one means the customer is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   *
   * Furthermore the absolute value of this amount is expected to be equal to the sum of product
   * amount and additional charges, minus promotions.
   * @return value or {@code null} for none
   */
  public Amount getCustomerBalance() {
    return customerBalance;
  }

  /**
   * [required] Customer balance on this invoice. A negative amount means the customer is paying, a
   * positive one means the customer is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   *
   * Furthermore the absolute value of this amount is expected to be equal to the sum of product
   * amount and additional charges, minus promotions.
   * @param customerBalance customerBalance or {@code null} for none
   */
  public InvoiceSummary setCustomerBalance(Amount customerBalance) {
    this.customerBalance = customerBalance;
    return this;
  }

  /**
   * [required] Google balance on this invoice. A negative amount means Google is paying, a positive
   * one means Google is receiving money. Note: the sum of merchant_balance, customer_balance and
   * google_balance must always be zero.
   * @return value or {@code null} for none
   */
  public Amount getGoogleBalance() {
    return googleBalance;
  }

  /**
   * [required] Google balance on this invoice. A negative amount means Google is paying, a positive
   * one means Google is receiving money. Note: the sum of merchant_balance, customer_balance and
   * google_balance must always be zero.
   * @param googleBalance googleBalance or {@code null} for none
   */
  public InvoiceSummary setGoogleBalance(Amount googleBalance) {
    this.googleBalance = googleBalance;
    return this;
  }

  /**
   * [required] Merchant balance on this invoice. A negative amount means the merchant is paying, a
   * positive one means the merchant is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   * @return value or {@code null} for none
   */
  public Amount getMerchantBalance() {
    return merchantBalance;
  }

  /**
   * [required] Merchant balance on this invoice. A negative amount means the merchant is paying, a
   * positive one means the merchant is receiving money. Note: the sum of merchant_balance,
   * customer_balance and google_balance must always be zero.
   * @param merchantBalance merchantBalance or {@code null} for none
   */
  public InvoiceSummary setMerchantBalance(Amount merchantBalance) {
    this.merchantBalance = merchantBalance;
    return this;
  }

  /**
   * [required] Total price for the product.
   * @return value or {@code null} for none
   */
  public Amount getProductTotal() {
    return productTotal;
  }

  /**
   * [required] Total price for the product.
   * @param productTotal productTotal or {@code null} for none
   */
  public InvoiceSummary setProductTotal(Amount productTotal) {
    this.productTotal = productTotal;
    return this;
  }

  /**
   * Summary for each promotion.
   * @return value or {@code null} for none
   */
  public java.util.List<Promotion> getPromotionSummaries() {
    return promotionSummaries;
  }

  /**
   * Summary for each promotion.
   * @param promotionSummaries promotionSummaries or {@code null} for none
   */
  public InvoiceSummary setPromotionSummaries(java.util.List<Promotion> promotionSummaries) {
    this.promotionSummaries = promotionSummaries;
    return this;
  }

  @Override
  public InvoiceSummary set(String fieldName, Object value) {
    return (InvoiceSummary) super.set(fieldName, value);
  }

  @Override
  public InvoiceSummary clone() {
    return (InvoiceSummary) super.clone();
  }

}
