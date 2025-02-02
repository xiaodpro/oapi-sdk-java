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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
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

public class SocialPlanCondition {
    /**
     * 适用范围左值
     * <p> 示例值：1
     */
    @SerializedName("left_type")
    private Integer leftType;
    /**
     * 适用范围操作
     * <p> 示例值：1
     */
    @SerializedName("operator")
    private Integer operator;
    /**
     * 适用范围右值
     * <p> 示例值：
     */
    @SerializedName("right_values")
    private String[] rightValues;

    // builder 开始
    public SocialPlanCondition() {
    }

    public SocialPlanCondition(Builder builder) {
        /**
         * 适用范围左值
         * <p> 示例值：1
         */
        this.leftType = builder.leftType;
        /**
         * 适用范围操作
         * <p> 示例值：1
         */
        this.operator = builder.operator;
        /**
         * 适用范围右值
         * <p> 示例值：
         */
        this.rightValues = builder.rightValues;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getLeftType() {
        return this.leftType;
    }

    public void setLeftType(Integer leftType) {
        this.leftType = leftType;
    }

    public Integer getOperator() {
        return this.operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String[] getRightValues() {
        return this.rightValues;
    }

    public void setRightValues(String[] rightValues) {
        this.rightValues = rightValues;
    }

    public static class Builder {
        /**
         * 适用范围左值
         * <p> 示例值：1
         */
        private Integer leftType;
        /**
         * 适用范围操作
         * <p> 示例值：1
         */
        private Integer operator;
        /**
         * 适用范围右值
         * <p> 示例值：
         */
        private String[] rightValues;

        /**
         * 适用范围左值
         * <p> 示例值：1
         *
         * @param leftType
         * @return
         */
        public Builder leftType(Integer leftType) {
            this.leftType = leftType;
            return this;
        }

        /**
         * 适用范围左值
         * <p> 示例值：1
         *
         * @param leftType {@link com.lark.oapi.service.compensation.v1.enums.SocialPlanConditionLeftTypeEnum}
         * @return
         */
        public Builder leftType(com.lark.oapi.service.compensation.v1.enums.SocialPlanConditionLeftTypeEnum leftType) {
            this.leftType = leftType.getValue();
            return this;
        }


        /**
         * 适用范围操作
         * <p> 示例值：1
         *
         * @param operator
         * @return
         */
        public Builder operator(Integer operator) {
            this.operator = operator;
            return this;
        }

        /**
         * 适用范围操作
         * <p> 示例值：1
         *
         * @param operator {@link com.lark.oapi.service.compensation.v1.enums.SocialPlanConditionScopeOperatorEnum}
         * @return
         */
        public Builder operator(com.lark.oapi.service.compensation.v1.enums.SocialPlanConditionScopeOperatorEnum operator) {
            this.operator = operator.getValue();
            return this;
        }


        /**
         * 适用范围右值
         * <p> 示例值：
         *
         * @param rightValues
         * @return
         */
        public Builder rightValues(String[] rightValues) {
            this.rightValues = rightValues;
            return this;
        }


        public SocialPlanCondition build() {
            return new SocialPlanCondition(this);
        }
    }
}
