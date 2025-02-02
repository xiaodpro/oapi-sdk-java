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

package com.lark.oapi.service.aily.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.aily.v1.enums.*;
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

public class AilyMention {
    /**
     * 实体 ID
     * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
     */
    @SerializedName("entity_id")
    private String entityId;
    /**
     * 身份提供者
     * <p> 示例值：FEISHU
     */
    @SerializedName("identity_provider")
    private String identityProvider;
    /**
     * 被@实体在消息体中的占位符
     * <p> 示例值：@_user_1
     */
    @SerializedName("key")
    private String key;
    /**
     * 被@实体的名称
     * <p> 示例值：张三
     */
    @SerializedName("name")
    private String name;
    /**
     * Aily 账号体系下的 ID
     * <p> 示例值：1794840334557292
     */
    @SerializedName("aily_id")
    private String ailyId;

    // builder 开始
    public AilyMention() {
    }

    public AilyMention(Builder builder) {
        /**
         * 实体 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        this.entityId = builder.entityId;
        /**
         * 身份提供者
         * <p> 示例值：FEISHU
         */
        this.identityProvider = builder.identityProvider;
        /**
         * 被@实体在消息体中的占位符
         * <p> 示例值：@_user_1
         */
        this.key = builder.key;
        /**
         * 被@实体的名称
         * <p> 示例值：张三
         */
        this.name = builder.name;
        /**
         * Aily 账号体系下的 ID
         * <p> 示例值：1794840334557292
         */
        this.ailyId = builder.ailyId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getIdentityProvider() {
        return this.identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAilyId() {
        return this.ailyId;
    }

    public void setAilyId(String ailyId) {
        this.ailyId = ailyId;
    }

    public static class Builder {
        /**
         * 实体 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        private String entityId;
        /**
         * 身份提供者
         * <p> 示例值：FEISHU
         */
        private String identityProvider;
        /**
         * 被@实体在消息体中的占位符
         * <p> 示例值：@_user_1
         */
        private String key;
        /**
         * 被@实体的名称
         * <p> 示例值：张三
         */
        private String name;
        /**
         * Aily 账号体系下的 ID
         * <p> 示例值：1794840334557292
         */
        private String ailyId;

        /**
         * 实体 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         *
         * @param entityId
         * @return
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }


        /**
         * 身份提供者
         * <p> 示例值：FEISHU
         *
         * @param identityProvider
         * @return
         */
        public Builder identityProvider(String identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }


        /**
         * 被@实体在消息体中的占位符
         * <p> 示例值：@_user_1
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 被@实体的名称
         * <p> 示例值：张三
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * Aily 账号体系下的 ID
         * <p> 示例值：1794840334557292
         *
         * @param ailyId
         * @return
         */
        public Builder ailyId(String ailyId) {
            this.ailyId = ailyId;
            return this;
        }


        public AilyMention build() {
            return new AilyMention(this);
        }
    }
}
