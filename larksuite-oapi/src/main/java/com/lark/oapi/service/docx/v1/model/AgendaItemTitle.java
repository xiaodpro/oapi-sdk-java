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

package com.lark.oapi.service.docx.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
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

public class AgendaItemTitle {
    /**
     * 文本元素
     * <p> 示例值：
     */
    @SerializedName("elements")
    private AgendaTitleElement[] elements;
    /**
     * 对齐方式
     * <p> 示例值：1
     */
    @SerializedName("align")
    private Integer align;

    // builder 开始
    public AgendaItemTitle() {
    }

    public AgendaItemTitle(Builder builder) {
        /**
         * 文本元素
         * <p> 示例值：
         */
        this.elements = builder.elements;
        /**
         * 对齐方式
         * <p> 示例值：1
         */
        this.align = builder.align;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public AgendaTitleElement[] getElements() {
        return this.elements;
    }

    public void setElements(AgendaTitleElement[] elements) {
        this.elements = elements;
    }

    public Integer getAlign() {
        return this.align;
    }

    public void setAlign(Integer align) {
        this.align = align;
    }

    public static class Builder {
        /**
         * 文本元素
         * <p> 示例值：
         */
        private AgendaTitleElement[] elements;
        /**
         * 对齐方式
         * <p> 示例值：1
         */
        private Integer align;

        /**
         * 文本元素
         * <p> 示例值：
         *
         * @param elements
         * @return
         */
        public Builder elements(AgendaTitleElement[] elements) {
            this.elements = elements;
            return this;
        }


        /**
         * 对齐方式
         * <p> 示例值：1
         *
         * @param align
         * @return
         */
        public Builder align(Integer align) {
            this.align = align;
            return this;
        }

        /**
         * 对齐方式
         * <p> 示例值：1
         *
         * @param align {@link com.lark.oapi.service.docx.v1.enums.AgendaItemTitleAlignEnum}
         * @return
         */
        public Builder align(com.lark.oapi.service.docx.v1.enums.AgendaItemTitleAlignEnum align) {
            this.align = align.getValue();
            return this;
        }


        public AgendaItemTitle build() {
            return new AgendaItemTitle(this);
        }
    }
}
