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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class OnboardingTaskChange {
    /**
     * 变更后任务状态
     * <p> 示例值：in_progress
     */
    @SerializedName("after_status")
    private String afterStatus;
    /**
     * 任务标识
     * <p> 示例值：2
     */
    @SerializedName("task_code")
    private String taskCode;

    // builder 开始
    public OnboardingTaskChange() {
    }

    public OnboardingTaskChange(Builder builder) {
        /**
         * 变更后任务状态
         * <p> 示例值：in_progress
         */
        this.afterStatus = builder.afterStatus;
        /**
         * 任务标识
         * <p> 示例值：2
         */
        this.taskCode = builder.taskCode;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAfterStatus() {
        return this.afterStatus;
    }

    public void setAfterStatus(String afterStatus) {
        this.afterStatus = afterStatus;
    }

    public String getTaskCode() {
        return this.taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public static class Builder {
        /**
         * 变更后任务状态
         * <p> 示例值：in_progress
         */
        private String afterStatus;
        /**
         * 任务标识
         * <p> 示例值：2
         */
        private String taskCode;

        /**
         * 变更后任务状态
         * <p> 示例值：in_progress
         *
         * @param afterStatus
         * @return
         */
        public Builder afterStatus(String afterStatus) {
            this.afterStatus = afterStatus;
            return this;
        }

        /**
         * 变更后任务状态
         * <p> 示例值：in_progress
         *
         * @param afterStatus {@link com.lark.oapi.service.corehr.v2.enums.OnboardingTaskChangeAfterStatusEnum}
         * @return
         */
        public Builder afterStatus(com.lark.oapi.service.corehr.v2.enums.OnboardingTaskChangeAfterStatusEnum afterStatus) {
            this.afterStatus = afterStatus.getValue();
            return this;
        }


        /**
         * 任务标识
         * <p> 示例值：2
         *
         * @param taskCode
         * @return
         */
        public Builder taskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }


        public OnboardingTaskChange build() {
            return new OnboardingTaskChange(this);
        }
    }
}
