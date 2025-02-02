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

package com.lark.oapi.service.calendar.v4;

import com.lark.oapi.core.Config;
import com.lark.oapi.service.calendar.v4.resource.*;

public class V4 {
    private final Calendar calendar; // 日历管理
    private final CalendarAcl calendarAcl; // 日历访问控制
    private final CalendarEvent calendarEvent; // 日程
    private final CalendarEventAttendee calendarEventAttendee; // 日程参与人
    private final CalendarEventAttendeeChatMember calendarEventAttendeeChatMember; // 日程参与人群成员
    private final CalendarEventMeetingChat calendarEventMeetingChat; // calendar.event.meeting_chat
    private final CalendarEventMeetingMinute calendarEventMeetingMinute; // calendar.event.meeting_minute
    private final ExchangeBinding exchangeBinding; // Exchange绑定
    private final Freebusy freebusy; // freebusy
    private final Setting setting; // 日历设置
    private final TimeoffEvent timeoffEvent; // 请假

    public V4(Config config) {
        this.calendar = new Calendar(config);
        this.calendarAcl = new CalendarAcl(config);
        this.calendarEvent = new CalendarEvent(config);
        this.calendarEventAttendee = new CalendarEventAttendee(config);
        this.calendarEventAttendeeChatMember = new CalendarEventAttendeeChatMember(config);
        this.calendarEventMeetingChat = new CalendarEventMeetingChat(config);
        this.calendarEventMeetingMinute = new CalendarEventMeetingMinute(config);
        this.exchangeBinding = new ExchangeBinding(config);
        this.freebusy = new Freebusy(config);
        this.setting = new Setting(config);
        this.timeoffEvent = new TimeoffEvent(config);
    }

    public Calendar calendar() {
        return calendar;
    }

    public CalendarAcl calendarAcl() {
        return calendarAcl;
    }

    public CalendarEvent calendarEvent() {
        return calendarEvent;
    }

    public CalendarEventAttendee calendarEventAttendee() {
        return calendarEventAttendee;
    }

    public CalendarEventAttendeeChatMember calendarEventAttendeeChatMember() {
        return calendarEventAttendeeChatMember;
    }

    public CalendarEventMeetingChat calendarEventMeetingChat() {
        return calendarEventMeetingChat;
    }

    public CalendarEventMeetingMinute calendarEventMeetingMinute() {
        return calendarEventMeetingMinute;
    }

    public ExchangeBinding exchangeBinding() {
        return exchangeBinding;
    }

    public Freebusy freebusy() {
        return freebusy;
    }

    public Setting setting() {
        return setting;
    }

    public TimeoffEvent timeoffEvent() {
        return timeoffEvent;
    }
}