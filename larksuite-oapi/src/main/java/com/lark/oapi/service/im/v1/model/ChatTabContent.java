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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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

public class ChatTabContent {
    /**
     * URL类型
     * <p> 示例值：https://www.feishu.cn
     */
    @SerializedName("url")
    private String url;
    /**
     * Doc链接
     * <p> 示例值：https://bytedance.feishu.cn/wiki/wikcnPIcqWjJQwkwDzrB9t40123xz
     */
    @SerializedName("doc")
    private String doc;
    /**
     * 会议纪要
     * <p> 示例值：https://bytedance.feishu.cn/docs/doccnvIXbV22i6hSD3utar4123dx
     */
    @SerializedName("meeting_minute")
    private String meetingMinute;
    /**
     * 任务
     * <p> 示例值：https://bytedance.feishu.cn/client/todo/task_list?guid=fa03fb6d-344b-47d9-83e3-049e3b3da931
     */
    @SerializedName("task")
    private String task;

    // builder 开始
    public ChatTabContent() {
    }

    public ChatTabContent(Builder builder) {
        /**
         * URL类型
         * <p> 示例值：https://www.feishu.cn
         */
        this.url = builder.url;
        /**
         * Doc链接
         * <p> 示例值：https://bytedance.feishu.cn/wiki/wikcnPIcqWjJQwkwDzrB9t40123xz
         */
        this.doc = builder.doc;
        /**
         * 会议纪要
         * <p> 示例值：https://bytedance.feishu.cn/docs/doccnvIXbV22i6hSD3utar4123dx
         */
        this.meetingMinute = builder.meetingMinute;
        /**
         * 任务
         * <p> 示例值：https://bytedance.feishu.cn/client/todo/task_list?guid=fa03fb6d-344b-47d9-83e3-049e3b3da931
         */
        this.task = builder.task;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDoc() {
        return this.doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getMeetingMinute() {
        return this.meetingMinute;
    }

    public void setMeetingMinute(String meetingMinute) {
        this.meetingMinute = meetingMinute;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public static class Builder {
        /**
         * URL类型
         * <p> 示例值：https://www.feishu.cn
         */
        private String url;
        /**
         * Doc链接
         * <p> 示例值：https://bytedance.feishu.cn/wiki/wikcnPIcqWjJQwkwDzrB9t40123xz
         */
        private String doc;
        /**
         * 会议纪要
         * <p> 示例值：https://bytedance.feishu.cn/docs/doccnvIXbV22i6hSD3utar4123dx
         */
        private String meetingMinute;
        /**
         * 任务
         * <p> 示例值：https://bytedance.feishu.cn/client/todo/task_list?guid=fa03fb6d-344b-47d9-83e3-049e3b3da931
         */
        private String task;

        /**
         * URL类型
         * <p> 示例值：https://www.feishu.cn
         *
         * @param url
         * @return
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }


        /**
         * Doc链接
         * <p> 示例值：https://bytedance.feishu.cn/wiki/wikcnPIcqWjJQwkwDzrB9t40123xz
         *
         * @param doc
         * @return
         */
        public Builder doc(String doc) {
            this.doc = doc;
            return this;
        }


        /**
         * 会议纪要
         * <p> 示例值：https://bytedance.feishu.cn/docs/doccnvIXbV22i6hSD3utar4123dx
         *
         * @param meetingMinute
         * @return
         */
        public Builder meetingMinute(String meetingMinute) {
            this.meetingMinute = meetingMinute;
            return this;
        }


        /**
         * 任务
         * <p> 示例值：https://bytedance.feishu.cn/client/todo/task_list?guid=fa03fb6d-344b-47d9-83e3-049e3b3da931
         *
         * @param task
         * @return
         */
        public Builder task(String task) {
            this.task = task;
            return this;
        }


        public ChatTabContent build() {
            return new ChatTabContent(this);
        }
    }
}
