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

package com.google.api.services.clouddebugger.v2.model;

/**
 * Response for listing debuggees.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Debugger API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListDebuggeesResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of debuggees accessible to the calling user. The fields `debuggee.id` and `description`
   * are guaranteed to be set. The `description` field is a human readable field provided by agents
   * and can be displayed to users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Debuggee> debuggees;

  /**
   * List of debuggees accessible to the calling user. The fields `debuggee.id` and `description`
   * are guaranteed to be set. The `description` field is a human readable field provided by agents
   * and can be displayed to users.
   * @return value or {@code null} for none
   */
  public java.util.List<Debuggee> getDebuggees() {
    return debuggees;
  }

  /**
   * List of debuggees accessible to the calling user. The fields `debuggee.id` and `description`
   * are guaranteed to be set. The `description` field is a human readable field provided by agents
   * and can be displayed to users.
   * @param debuggees debuggees or {@code null} for none
   */
  public ListDebuggeesResponse setDebuggees(java.util.List<Debuggee> debuggees) {
    this.debuggees = debuggees;
    return this;
  }

  @Override
  public ListDebuggeesResponse set(String fieldName, Object value) {
    return (ListDebuggeesResponse) super.set(fieldName, value);
  }

  @Override
  public ListDebuggeesResponse clone() {
    return (ListDebuggeesResponse) super.clone();
  }

}