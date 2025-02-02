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

public class SubjectiveCheck {
    /**
     * 关键点
     * <p> 示例值：
     */
    @SerializedName("key_points")
    private KeyPoint[] keyPoints;
    /**
     * 用户输入prompt
     * <p> 示例值：
     */
    @SerializedName("user_input_prompts")
    private String[] userInputPrompts;

    // builder 开始
    public SubjectiveCheck() {
    }

    public SubjectiveCheck(Builder builder) {
        /**
         * 关键点
         * <p> 示例值：
         */
        this.keyPoints = builder.keyPoints;
        /**
         * 用户输入prompt
         * <p> 示例值：
         */
        this.userInputPrompts = builder.userInputPrompts;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public KeyPoint[] getKeyPoints() {
        return this.keyPoints;
    }

    public void setKeyPoints(KeyPoint[] keyPoints) {
        this.keyPoints = keyPoints;
    }

    public String[] getUserInputPrompts() {
        return this.userInputPrompts;
    }

    public void setUserInputPrompts(String[] userInputPrompts) {
        this.userInputPrompts = userInputPrompts;
    }

    public static class Builder {
        /**
         * 关键点
         * <p> 示例值：
         */
        private KeyPoint[] keyPoints;
        /**
         * 用户输入prompt
         * <p> 示例值：
         */
        private String[] userInputPrompts;

        /**
         * 关键点
         * <p> 示例值：
         *
         * @param keyPoints
         * @return
         */
        public Builder keyPoints(KeyPoint[] keyPoints) {
            this.keyPoints = keyPoints;
            return this;
        }


        /**
         * 用户输入prompt
         * <p> 示例值：
         *
         * @param userInputPrompts
         * @return
         */
        public Builder userInputPrompts(String[] userInputPrompts) {
            this.userInputPrompts = userInputPrompts;
            return this;
        }


        public SubjectiveCheck build() {
            return new SubjectiveCheck(this);
        }
    }
}
