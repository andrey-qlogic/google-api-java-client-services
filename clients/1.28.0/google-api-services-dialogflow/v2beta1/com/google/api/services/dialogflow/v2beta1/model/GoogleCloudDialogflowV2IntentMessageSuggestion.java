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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The suggestion chip message that the user can tap to quickly post a reply to the conversation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageSuggestion extends com.google.api.client.json.GenericJson {

  /**
   * Required. The text shown the in the suggestion chip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Required. The text shown the in the suggestion chip.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. The text shown the in the suggestion chip.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageSuggestion setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageSuggestion set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageSuggestion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageSuggestion clone() {
    return (GoogleCloudDialogflowV2IntentMessageSuggestion) super.clone();
  }

}