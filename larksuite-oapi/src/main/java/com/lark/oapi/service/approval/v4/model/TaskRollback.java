// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class TaskRollback {
    /**
     * 用户ID
     * <p> 示例值：893g4c45
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 回退的任务ID
     * <p> 示例值：7026591166355210260
     */
    @SerializedName("task_id")
    private String taskId;
    /**
     * 退回原因
     * <p> 示例值：申请事项填写不具体，请重新填写
     */
    @SerializedName("reason")
    private String reason;
    /**
     * 扩展字段
     * <p> 示例值：暂不填写
     */
    @SerializedName("extra")
    private String extra;
    /**
     * 退回节点对应的标识
     * <p> 示例值：APPROVAL_27997_285502
     */
    @SerializedName("task_def_key")
    private String taskDefKey;

    // builder 开始
    public TaskRollback() {
    }

    public TaskRollback(Builder builder) {
        /**
         * 用户ID
         * <p> 示例值：893g4c45
         */
        this.userId = builder.userId;
        /**
         * 回退的任务ID
         * <p> 示例值：7026591166355210260
         */
        this.taskId = builder.taskId;
        /**
         * 退回原因
         * <p> 示例值：申请事项填写不具体，请重新填写
         */
        this.reason = builder.reason;
        /**
         * 扩展字段
         * <p> 示例值：暂不填写
         */
        this.extra = builder.extra;
        /**
         * 退回节点对应的标识
         * <p> 示例值：APPROVAL_27997_285502
         */
        this.taskDefKey = builder.taskDefKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getTaskDefKey() {
        return this.taskDefKey;
    }

    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    public static class Builder {
        /**
         * 用户ID
         * <p> 示例值：893g4c45
         */
        private String userId;
        /**
         * 回退的任务ID
         * <p> 示例值：7026591166355210260
         */
        private String taskId;
        /**
         * 退回原因
         * <p> 示例值：申请事项填写不具体，请重新填写
         */
        private String reason;
        /**
         * 扩展字段
         * <p> 示例值：暂不填写
         */
        private String extra;
        /**
         * 退回节点对应的标识
         * <p> 示例值：APPROVAL_27997_285502
         */
        private String taskDefKey;

        /**
         * 用户ID
         * <p> 示例值：893g4c45
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 回退的任务ID
         * <p> 示例值：7026591166355210260
         *
         * @param taskId
         * @return
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }


        /**
         * 退回原因
         * <p> 示例值：申请事项填写不具体，请重新填写
         *
         * @param reason
         * @return
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }


        /**
         * 扩展字段
         * <p> 示例值：暂不填写
         *
         * @param extra
         * @return
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }


        /**
         * 退回节点对应的标识
         * <p> 示例值：APPROVAL_27997_285502
         *
         * @param taskDefKey
         * @return
         */
        public Builder taskDefKey(String taskDefKey) {
            this.taskDefKey = taskDefKey;
            return this;
        }


        public TaskRollback build() {
            return new TaskRollback(this);
        }
    }
}
