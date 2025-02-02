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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListTripartiteAgreementReq {
    /**
     * 分页大小
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 投递 ID，必填投递 id 与三方协议 ID 其中之一
     * <p> 示例值：6930815272790114324
     */
    @Query
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 三方协议 ID，必填投递 id 与三方协议 ID 其中之一
     * <p> 示例值：6930815272790114325
     */
    @Query
    @SerializedName("tripartite_agreement_id")
    private String tripartiteAgreementId;

    // builder 开始
    public ListTripartiteAgreementReq() {
    }

    public ListTripartiteAgreementReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
        /**
         * 投递 ID，必填投递 id 与三方协议 ID 其中之一
         * <p> 示例值：6930815272790114324
         */
        this.applicationId = builder.applicationId;
        /**
         * 三方协议 ID，必填投递 id 与三方协议 ID 其中之一
         * <p> 示例值：6930815272790114325
         */
        this.tripartiteAgreementId = builder.tripartiteAgreementId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getTripartiteAgreementId() {
        return this.tripartiteAgreementId;
    }

    public void setTripartiteAgreementId(String tripartiteAgreementId) {
        this.tripartiteAgreementId = tripartiteAgreementId;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String applicationId; // 投递 ID，必填投递 id 与三方协议 ID 其中之一
        private String tripartiteAgreementId; // 三方协议 ID，必填投递 id 与三方协议 ID 其中之一


        /**
         * 分页大小
         * <p> 示例值：
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        /**
         * 投递 ID，必填投递 id 与三方协议 ID 其中之一
         * <p> 示例值：6930815272790114324
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 三方协议 ID，必填投递 id 与三方协议 ID 其中之一
         * <p> 示例值：6930815272790114325
         *
         * @param tripartiteAgreementId
         * @return
         */
        public Builder tripartiteAgreementId(String tripartiteAgreementId) {
            this.tripartiteAgreementId = tripartiteAgreementId;
            return this;
        }

        public ListTripartiteAgreementReq build() {
            return new ListTripartiteAgreementReq(this);
        }
    }
}
