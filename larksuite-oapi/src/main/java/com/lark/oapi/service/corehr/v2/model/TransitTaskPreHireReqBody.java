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

public class TransitTaskPreHireReqBody {
    /**
     * 系统预置的职位信息和个人信息任务的task_id分别为1和2，自定义任务的task_id是一串UUID
     * <p> 示例值：1
     */
    @SerializedName("task_id")
    private String taskId;

    // builder 开始
    public TransitTaskPreHireReqBody() {
    }

    public TransitTaskPreHireReqBody(Builder builder) {
        /**
         * 系统预置的职位信息和个人信息任务的task_id分别为1和2，自定义任务的task_id是一串UUID
         * <p> 示例值：1
         */
        this.taskId = builder.taskId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public static class Builder {
        /**
         * 系统预置的职位信息和个人信息任务的task_id分别为1和2，自定义任务的task_id是一串UUID
         * <p> 示例值：1
         */
        private String taskId;

        /**
         * 系统预置的职位信息和个人信息任务的task_id分别为1和2，自定义任务的task_id是一串UUID
         * <p> 示例值：1
         *
         * @param taskId
         * @return
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }


        public TransitTaskPreHireReqBody build() {
            return new TransitTaskPreHireReqBody(this);
        }
    }
}
