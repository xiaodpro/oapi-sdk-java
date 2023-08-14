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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class CopyFileReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 被复制的文件token
     * <p> 示例值：doccngpahSdXrFPIBD4XdIabcef
     */
    @Path
    @SerializedName("file_token")
    private String fileToken;
    @Body
    private CopyFileReqBody body;

    // builder 开始
    public CopyFileReq() {
    }

    public CopyFileReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 被复制的文件token
         * <p> 示例值：doccngpahSdXrFPIBD4XdIabcef
         */
        this.fileToken = builder.fileToken;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public CopyFileReqBody getCopyFileReqBody() {
        return this.body;
    }

    public void setCopyFileReqBody(CopyFileReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String fileToken; // 被复制的文件token
        private CopyFileReqBody body;

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.drive.v1.enums.CopyFileUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.drive.v1.enums.CopyFileUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 被复制的文件token
         * <p> 示例值：doccngpahSdXrFPIBD4XdIabcef
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public CopyFileReqBody getCopyFileReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder copyFileReqBody(CopyFileReqBody body) {
            this.body = body;
            return this;
        }

        public CopyFileReq build() {
            return new CopyFileReq(this);
        }
    }
}
