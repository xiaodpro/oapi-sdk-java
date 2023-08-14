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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class SchemaUserIdsOption {
    /**
     * 用户身份类型
     * <p> 示例值：user_id
     */
    @SerializedName("id_type")
    private String idType;

    // builder 开始
    public SchemaUserIdsOption() {
    }

    public SchemaUserIdsOption(Builder builder) {
        /**
         * 用户身份类型
         * <p> 示例值：user_id
         */
        this.idType = builder.idType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIdType() {
        return this.idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public static class Builder {
        /**
         * 用户身份类型
         * <p> 示例值：user_id
         */
        private String idType;

        /**
         * 用户身份类型
         * <p> 示例值：user_id
         *
         * @param idType
         * @return
         */
        public Builder idType(String idType) {
            this.idType = idType;
            return this;
        }

        /**
         * 用户身份类型
         * <p> 示例值：user_id
         *
         * @param idType {@link com.lark.oapi.service.search.v2.enums.SchemaUserIdsOptionUserIDsTypeEnum}
         * @return
         */
        public Builder idType(com.lark.oapi.service.search.v2.enums.SchemaUserIdsOptionUserIDsTypeEnum idType) {
            this.idType = idType.getValue();
            return this;
        }


        public SchemaUserIdsOption build() {
            return new SchemaUserIdsOption(this);
        }
    }
}
