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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * The request used for UpdateWorkerPool.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest extends com.google.api.client.json.GenericJson {

  /**
   * The update mask applies to worker_pool. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If an
   * empty update_mask is provided, only the non-default valued field in the worker pool field will
   * be updated. Note that in order to update a field to the default value (zero, false, empty
   * string) an explicit update_mask must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * Specifies the worker pool to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool workerPool;

  /**
   * The update mask applies to worker_pool. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If an
   * empty update_mask is provided, only the non-default valued field in the worker pool field will
   * be updated. Note that in order to update a field to the default value (zero, false, empty
   * string) an explicit update_mask must be provided.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * The update mask applies to worker_pool. For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If an
   * empty update_mask is provided, only the non-default valued field in the worker pool field will
   * be updated. Note that in order to update a field to the default value (zero, false, empty
   * string) an explicit update_mask must be provided.
   * @param updateMask updateMask or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  /**
   * Specifies the worker pool to update.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool getWorkerPool() {
    return workerPool;
  }

  /**
   * Specifies the worker pool to update.
   * @param workerPool workerPool or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest setWorkerPool(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool workerPool) {
    this.workerPool = workerPool;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest) super.clone();
  }

}
