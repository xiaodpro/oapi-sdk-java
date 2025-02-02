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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class OfferJobInfo {
    /**
     * Offer 职位 ID
     * <p> 示例值：7080891505426925854
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * Offer 职位名称
     * <p> 示例值：xx
     */
    @SerializedName("job_name")
    private String jobName;

    // builder 开始
    public OfferJobInfo() {
    }

    public OfferJobInfo(Builder builder) {
        /**
         * Offer 职位 ID
         * <p> 示例值：7080891505426925854
         */
        this.jobId = builder.jobId;
        /**
         * Offer 职位名称
         * <p> 示例值：xx
         */
        this.jobName = builder.jobName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return this.jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public static class Builder {
        /**
         * Offer 职位 ID
         * <p> 示例值：7080891505426925854
         */
        private String jobId;
        /**
         * Offer 职位名称
         * <p> 示例值：xx
         */
        private String jobName;

        /**
         * Offer 职位 ID
         * <p> 示例值：7080891505426925854
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * Offer 职位名称
         * <p> 示例值：xx
         *
         * @param jobName
         * @return
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }


        public OfferJobInfo build() {
            return new OfferJobInfo(this);
        }
    }
}
