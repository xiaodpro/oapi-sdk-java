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

public class DataAssetTag {
    /**
     * 数据知识分类名称
     * <p> 示例值：spring_5862e4fea8__c__asset_tag_aadg2b5ql4gbs
     */
    @SerializedName("data_asset_tag_id")
    private String dataAssetTagId;
    /**
     * 数据知识分类ID
     * <p> 示例值：电影
     */
    @SerializedName("name")
    private String name;

    // builder 开始
    public DataAssetTag() {
    }

    public DataAssetTag(Builder builder) {
        /**
         * 数据知识分类名称
         * <p> 示例值：spring_5862e4fea8__c__asset_tag_aadg2b5ql4gbs
         */
        this.dataAssetTagId = builder.dataAssetTagId;
        /**
         * 数据知识分类ID
         * <p> 示例值：电影
         */
        this.name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDataAssetTagId() {
        return this.dataAssetTagId;
    }

    public void setDataAssetTagId(String dataAssetTagId) {
        this.dataAssetTagId = dataAssetTagId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        /**
         * 数据知识分类名称
         * <p> 示例值：spring_5862e4fea8__c__asset_tag_aadg2b5ql4gbs
         */
        private String dataAssetTagId;
        /**
         * 数据知识分类ID
         * <p> 示例值：电影
         */
        private String name;

        /**
         * 数据知识分类名称
         * <p> 示例值：spring_5862e4fea8__c__asset_tag_aadg2b5ql4gbs
         *
         * @param dataAssetTagId
         * @return
         */
        public Builder dataAssetTagId(String dataAssetTagId) {
            this.dataAssetTagId = dataAssetTagId;
            return this;
        }


        /**
         * 数据知识分类ID
         * <p> 示例值：电影
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public DataAssetTag build() {
            return new DataAssetTag(this);
        }
    }
}
