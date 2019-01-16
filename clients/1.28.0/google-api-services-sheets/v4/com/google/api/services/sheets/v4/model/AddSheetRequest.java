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

package com.google.api.services.sheets.v4.model;

/**
 * Adds a new sheet. When a sheet is added at a given index, all subsequent sheets' indexes are
 * incremented. To add an object sheet, use AddChartRequest instead and specify
 * EmbeddedObjectPosition.sheetId or EmbeddedObjectPosition.newSheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AddSheetRequest extends com.google.api.client.json.GenericJson {

  /**
   * The properties the new sheet should have. All properties are optional. The sheetId field is
   * optional; if one is not set, an id will be randomly generated. (It is an error to specify the
   * ID of a sheet that already exists.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SheetProperties properties;

  /**
   * The properties the new sheet should have. All properties are optional. The sheetId field is
   * optional; if one is not set, an id will be randomly generated. (It is an error to specify the
   * ID of a sheet that already exists.)
   * @return value or {@code null} for none
   */
  public SheetProperties getProperties() {
    return properties;
  }

  /**
   * The properties the new sheet should have. All properties are optional. The sheetId field is
   * optional; if one is not set, an id will be randomly generated. (It is an error to specify the
   * ID of a sheet that already exists.)
   * @param properties properties or {@code null} for none
   */
  public AddSheetRequest setProperties(SheetProperties properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public AddSheetRequest set(String fieldName, Object value) {
    return (AddSheetRequest) super.set(fieldName, value);
  }

  @Override
  public AddSheetRequest clone() {
    return (AddSheetRequest) super.clone();
  }

}