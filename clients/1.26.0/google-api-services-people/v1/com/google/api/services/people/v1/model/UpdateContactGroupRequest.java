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

package com.google.api.services.people.v1.model;

/**
 * A request to update an existing user contact group. All updated fields will be replaced.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateContactGroupRequest extends com.google.api.client.json.GenericJson {

  /**
   * The contact group to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContactGroup contactGroup;

  /**
   * The contact group to update.
   * @return value or {@code null} for none
   */
  public ContactGroup getContactGroup() {
    return contactGroup;
  }

  /**
   * The contact group to update.
   * @param contactGroup contactGroup or {@code null} for none
   */
  public UpdateContactGroupRequest setContactGroup(ContactGroup contactGroup) {
    this.contactGroup = contactGroup;
    return this;
  }

  @Override
  public UpdateContactGroupRequest set(String fieldName, Object value) {
    return (UpdateContactGroupRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateContactGroupRequest clone() {
    return (UpdateContactGroupRequest) super.clone();
  }

}
