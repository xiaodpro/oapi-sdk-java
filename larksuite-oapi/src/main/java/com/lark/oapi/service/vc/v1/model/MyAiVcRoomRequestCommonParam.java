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

package com.lark.oapi.service.vc.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.vc.v1.enums.*;
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

public class MyAiVcRoomRequestCommonParam {
    /**
     * 语言类型
     * <p> 示例值：zh-CN
     */
    @SerializedName("language")
    private String language;
    /**
     * 时区偏移,单位分钟,480表示东八区
     * <p> 示例值：480
     */
    @SerializedName("utc_offset")
    private String utcOffset;
    /**
     * 会议室 ID
     * <p> 示例值：12345678
     */
    @SerializedName("room_id")
    private String roomId;
    /**
     * 客户端版本
     * <p> 示例值：0.0.0-alpha.0
     */
    @SerializedName("client_version")
    private String clientVersion;
    /**
     * open api response 历史
     * <p> 示例值：
     */
    @SerializedName("openapi_history")
    private MyAiRoomOpenapiResponse openapiHistory;

    // builder 开始
    public MyAiVcRoomRequestCommonParam() {
    }

    public MyAiVcRoomRequestCommonParam(Builder builder) {
        /**
         * 语言类型
         * <p> 示例值：zh-CN
         */
        this.language = builder.language;
        /**
         * 时区偏移,单位分钟,480表示东八区
         * <p> 示例值：480
         */
        this.utcOffset = builder.utcOffset;
        /**
         * 会议室 ID
         * <p> 示例值：12345678
         */
        this.roomId = builder.roomId;
        /**
         * 客户端版本
         * <p> 示例值：0.0.0-alpha.0
         */
        this.clientVersion = builder.clientVersion;
        /**
         * open api response 历史
         * <p> 示例值：
         */
        this.openapiHistory = builder.openapiHistory;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUtcOffset() {
        return this.utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public MyAiRoomOpenapiResponse getOpenapiHistory() {
        return this.openapiHistory;
    }

    public void setOpenapiHistory(MyAiRoomOpenapiResponse openapiHistory) {
        this.openapiHistory = openapiHistory;
    }

    public static class Builder {
        /**
         * 语言类型
         * <p> 示例值：zh-CN
         */
        private String language;
        /**
         * 时区偏移,单位分钟,480表示东八区
         * <p> 示例值：480
         */
        private String utcOffset;
        /**
         * 会议室 ID
         * <p> 示例值：12345678
         */
        private String roomId;
        /**
         * 客户端版本
         * <p> 示例值：0.0.0-alpha.0
         */
        private String clientVersion;
        /**
         * open api response 历史
         * <p> 示例值：
         */
        private MyAiRoomOpenapiResponse openapiHistory;

        /**
         * 语言类型
         * <p> 示例值：zh-CN
         *
         * @param language
         * @return
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }


        /**
         * 时区偏移,单位分钟,480表示东八区
         * <p> 示例值：480
         *
         * @param utcOffset
         * @return
         */
        public Builder utcOffset(String utcOffset) {
            this.utcOffset = utcOffset;
            return this;
        }


        /**
         * 会议室 ID
         * <p> 示例值：12345678
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }


        /**
         * 客户端版本
         * <p> 示例值：0.0.0-alpha.0
         *
         * @param clientVersion
         * @return
         */
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }


        /**
         * open api response 历史
         * <p> 示例值：
         *
         * @param openapiHistory
         * @return
         */
        public Builder openapiHistory(MyAiRoomOpenapiResponse openapiHistory) {
            this.openapiHistory = openapiHistory;
            return this;
        }


        public MyAiVcRoomRequestCommonParam build() {
            return new MyAiVcRoomRequestCommonParam(this);
        }
    }
}
