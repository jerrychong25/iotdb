/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iotdb.db.mpp.plan.node;

import org.apache.iotdb.db.mpp.common.TreeNode;

/**
 * @author xingtanzjr The base class of query executable operators, which is used to compose logical
 *     query plan. TODO: consider how to restrict the children type for each type of ExecOperator
 *     TODO: consider to fix the Template type as TsBlock
 */
public abstract class PlanNode<T> extends TreeNode<PlanNode<T>> {
  private PlanNodeId id;

  public PlanNode(PlanNodeId id) {
    this.id = id;
  }
}