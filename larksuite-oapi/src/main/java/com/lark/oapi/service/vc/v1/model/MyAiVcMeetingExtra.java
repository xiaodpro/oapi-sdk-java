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

import com.google.gson.annotations.SerializedName;

public class MyAiVcMeetingExtra {
    /**
     * 会议id
     * <p> 示例值：6909384684539478036
     */
    @SerializedName("vc_meeting_id")
    private String vcMeetingId;
    /**
     * 客户端语言
     * <p> 示例值：zh_cn
     */
    @SerializedName("vc_locale")
    private String vcLocale;

    // builder 开始
    public MyAiVcMeetingExtra() {
    }

    public MyAiVcMeetingExtra(Builder builder) {
        /**
         * 会议id
         * <p> 示例值：6909384684539478036
         */
        this.vcMeetingId = builder.vcMeetingId;
        /**
         * 客户端语言
         * <p> 示例值：zh_cn
         */
        this.vcLocale = builder.vcLocale;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getVcMeetingId() {
        return this.vcMeetingId;
    }

    public void setVcMeetingId(String vcMeetingId) {
        this.vcMeetingId = vcMeetingId;
    }

    public String getVcLocale() {
        return this.vcLocale;
    }

    public void setVcLocale(String vcLocale) {
        this.vcLocale = vcLocale;
    }

    public static class Builder {
        /**
         * 会议id
         * <p> 示例值：6909384684539478036
         */
        private String vcMeetingId;
        /**
         * 客户端语言
         * <p> 示例值：zh_cn
         */
        private String vcLocale;

        /**
         * 会议id
         * <p> 示例值：6909384684539478036
         *
         * @param vcMeetingId
         * @return
         */
        public Builder vcMeetingId(String vcMeetingId) {
            this.vcMeetingId = vcMeetingId;
            return this;
        }


        /**
         * 客户端语言
         * <p> 示例值：zh_cn
         *
         * @param vcLocale
         * @return
         */
        public Builder vcLocale(String vcLocale) {
            this.vcLocale = vcLocale;
            return this;
        }


        public MyAiVcMeetingExtra build() {
            return new MyAiVcMeetingExtra(this);
        }
    }
}
