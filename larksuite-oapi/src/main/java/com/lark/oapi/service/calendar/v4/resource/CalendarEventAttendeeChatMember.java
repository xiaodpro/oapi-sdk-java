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

package com.lark.oapi.service.calendar.v4.resource;

import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.request.RequestOptions;

import java.io.ByteArrayOutputStream;

import com.lark.oapi.service.calendar.v4.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CalendarEventAttendeeChatMember {
    private static final Logger log = LoggerFactory.getLogger(CalendarEventAttendeeChatMember.class);
    private final Config config;

    public CalendarEventAttendeeChatMember(Config config) {
        this.config = config;
    }


    /**
     * 获取日程参与群成员列表，获取日程的群参与人的群成员列表。
     * <p> - 当前身份必须有权限查看日程的参与人列表。;;- 当前身份必须在群聊中，或有权限查看群成员列表。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee-chat_member/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee-chat_member/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/calendarv4/ListCalendarEventAttendeeChatMemberSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/calendarv4/ListCalendarEventAttendeeChatMemberSample.java</a> ;
     */
    public ListCalendarEventAttendeeChatMemberResp list(ListCalendarEventAttendeeChatMemberReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/calendar/v4/calendars/:calendar_id/events/:event_id/attendees/:attendee_id/chat_members"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListCalendarEventAttendeeChatMemberResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListCalendarEventAttendeeChatMemberResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/calendar/v4/calendars/:calendar_id/events/:event_id/attendees/:attendee_id/chat_members"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /**
     * 获取日程参与群成员列表，获取日程的群参与人的群成员列表。
     * <p> - 当前身份必须有权限查看日程的参与人列表。;;- 当前身份必须在群聊中，或有权限查看群成员列表。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee-chat_member/list">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/calendar-v4/calendar-event-attendee-chat_member/list</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/calendarv4/ListCalendarEventAttendeeChatMemberSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/calendarv4/ListCalendarEventAttendeeChatMemberSample.java</a> ;
     */
    public ListCalendarEventAttendeeChatMemberResp list(ListCalendarEventAttendeeChatMemberReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/calendar/v4/calendars/:calendar_id/events/:event_id/attendees/:attendee_id/chat_members"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListCalendarEventAttendeeChatMemberResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListCalendarEventAttendeeChatMemberResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/calendar/v4/calendars/:calendar_id/events/:event_id/attendees/:attendee_id/chat_members"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
