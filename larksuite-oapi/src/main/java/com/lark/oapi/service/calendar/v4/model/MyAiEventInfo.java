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

package com.lark.oapi.service.calendar.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.calendar.v4.enums.*;
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

public class MyAiEventInfo {
    /**
     * 日程的uid_originTime
     * <p> 示例值：11dd1004-7cfb-4ad2-89a0-aa3c82f34dda_0
     */
    @SerializedName("event_id")
    private String eventId;
    /**
     * 日程主题
     * <p> 示例值：日程主题
     */
    @SerializedName("summary")
    private String summary;
    /**
     * 日程开始时间，日期+时间格式
     * <p> 示例值：2023-01-01T00:00
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 日程结束时间，日期+时间格式
     * <p> 示例值：2023-01-01T01:00
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 日程开始时间时区
     * <p> 示例值：Asia/Shanghai
     */
    @SerializedName("start_timezone")
    private String startTimezone;
    /**
     * 日程的重复性规则
     * <p> 示例值：FREQ=DAILY;INTERVAL=1
     */
    @SerializedName("recurrence_rule")
    private String recurrenceRule;
    /**
     * 日程参与人open ID
     * <p> 示例值：ou_xxx;ou_yyy
     */
    @SerializedName("participant_ids")
    private String participantIds;
    /**
     * 需要预定的会议室ID列表
     * <p> 示例值：omm_xxx;omm_yyy
     */
    @SerializedName("meeting_room_ids")
    private String meetingRoomIds;

    // builder 开始
    public MyAiEventInfo() {
    }

    public MyAiEventInfo(Builder builder) {
        /**
         * 日程的uid_originTime
         * <p> 示例值：11dd1004-7cfb-4ad2-89a0-aa3c82f34dda_0
         */
        this.eventId = builder.eventId;
        /**
         * 日程主题
         * <p> 示例值：日程主题
         */
        this.summary = builder.summary;
        /**
         * 日程开始时间，日期+时间格式
         * <p> 示例值：2023-01-01T00:00
         */
        this.startTime = builder.startTime;
        /**
         * 日程结束时间，日期+时间格式
         * <p> 示例值：2023-01-01T01:00
         */
        this.endTime = builder.endTime;
        /**
         * 日程开始时间时区
         * <p> 示例值：Asia/Shanghai
         */
        this.startTimezone = builder.startTimezone;
        /**
         * 日程的重复性规则
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         */
        this.recurrenceRule = builder.recurrenceRule;
        /**
         * 日程参与人open ID
         * <p> 示例值：ou_xxx;ou_yyy
         */
        this.participantIds = builder.participantIds;
        /**
         * 需要预定的会议室ID列表
         * <p> 示例值：omm_xxx;omm_yyy
         */
        this.meetingRoomIds = builder.meetingRoomIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTimezone() {
        return this.startTimezone;
    }

    public void setStartTimezone(String startTimezone) {
        this.startTimezone = startTimezone;
    }

    public String getRecurrenceRule() {
        return this.recurrenceRule;
    }

    public void setRecurrenceRule(String recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }

    public String getParticipantIds() {
        return this.participantIds;
    }

    public void setParticipantIds(String participantIds) {
        this.participantIds = participantIds;
    }

    public String getMeetingRoomIds() {
        return this.meetingRoomIds;
    }

    public void setMeetingRoomIds(String meetingRoomIds) {
        this.meetingRoomIds = meetingRoomIds;
    }

    public static class Builder {
        /**
         * 日程的uid_originTime
         * <p> 示例值：11dd1004-7cfb-4ad2-89a0-aa3c82f34dda_0
         */
        private String eventId;
        /**
         * 日程主题
         * <p> 示例值：日程主题
         */
        private String summary;
        /**
         * 日程开始时间，日期+时间格式
         * <p> 示例值：2023-01-01T00:00
         */
        private String startTime;
        /**
         * 日程结束时间，日期+时间格式
         * <p> 示例值：2023-01-01T01:00
         */
        private String endTime;
        /**
         * 日程开始时间时区
         * <p> 示例值：Asia/Shanghai
         */
        private String startTimezone;
        /**
         * 日程的重复性规则
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         */
        private String recurrenceRule;
        /**
         * 日程参与人open ID
         * <p> 示例值：ou_xxx;ou_yyy
         */
        private String participantIds;
        /**
         * 需要预定的会议室ID列表
         * <p> 示例值：omm_xxx;omm_yyy
         */
        private String meetingRoomIds;

        /**
         * 日程的uid_originTime
         * <p> 示例值：11dd1004-7cfb-4ad2-89a0-aa3c82f34dda_0
         *
         * @param eventId
         * @return
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }


        /**
         * 日程主题
         * <p> 示例值：日程主题
         *
         * @param summary
         * @return
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }


        /**
         * 日程开始时间，日期+时间格式
         * <p> 示例值：2023-01-01T00:00
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 日程结束时间，日期+时间格式
         * <p> 示例值：2023-01-01T01:00
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 日程开始时间时区
         * <p> 示例值：Asia/Shanghai
         *
         * @param startTimezone
         * @return
         */
        public Builder startTimezone(String startTimezone) {
            this.startTimezone = startTimezone;
            return this;
        }


        /**
         * 日程的重复性规则
         * <p> 示例值：FREQ=DAILY;INTERVAL=1
         *
         * @param recurrenceRule
         * @return
         */
        public Builder recurrenceRule(String recurrenceRule) {
            this.recurrenceRule = recurrenceRule;
            return this;
        }


        /**
         * 日程参与人open ID
         * <p> 示例值：ou_xxx;ou_yyy
         *
         * @param participantIds
         * @return
         */
        public Builder participantIds(String participantIds) {
            this.participantIds = participantIds;
            return this;
        }


        /**
         * 需要预定的会议室ID列表
         * <p> 示例值：omm_xxx;omm_yyy
         *
         * @param meetingRoomIds
         * @return
         */
        public Builder meetingRoomIds(String meetingRoomIds) {
            this.meetingRoomIds = meetingRoomIds;
            return this;
        }


        public MyAiEventInfo build() {
            return new MyAiEventInfo(this);
        }
    }
}
