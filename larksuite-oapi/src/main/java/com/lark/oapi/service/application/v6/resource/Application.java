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

package com.lark.oapi.service.application.v6.resource;

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

import com.lark.oapi.service.application.v6.model.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private final Config config;

    public Application(Config config) {
        this.config = config;
    }


    /**
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=contacts_range_configuration&project=application&resource=application&version=v6">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=contacts_range_configuration&project=application&resource=application&version=v6</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/ContactsRangeConfigurationApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/ContactsRangeConfigurationApplicationSample.java</a> ;
     */
    public ContactsRangeConfigurationApplicationResp contactsRangeConfiguration(ContactsRangeConfigurationApplicationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/:app_id/contacts_range_configuration"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ContactsRangeConfigurationApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ContactsRangeConfigurationApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/contacts_range_configuration"
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
     * ，
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=contacts_range_configuration&project=application&resource=application&version=v6">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=contacts_range_configuration&project=application&resource=application&version=v6</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/ContactsRangeConfigurationApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/ContactsRangeConfigurationApplicationSample.java</a> ;
     */
    public ContactsRangeConfigurationApplicationResp contactsRangeConfiguration(ContactsRangeConfigurationApplicationReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/:app_id/contacts_range_configuration"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        ContactsRangeConfigurationApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ContactsRangeConfigurationApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id/contacts_range_configuration"
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
     * 获取应用信息，根据app_id获取应用的基础信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/GetApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/GetApplicationSample.java</a> ;
     */
    public GetApplicationResp get(GetApplicationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/:app_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id"
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
     * 获取应用信息，根据app_id获取应用的基础信息
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/GetApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/GetApplicationSample.java</a> ;
     */
    public GetApplicationResp get(GetApplicationReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/:app_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id"
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
     * 更新应用分组信息，更新应用的分组信息（分组会影响应用在工作台中的分类情况，请谨慎更新）
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/PatchApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/PatchApplicationSample.java</a> ;
     */
    public PatchApplicationResp patch(PatchApplicationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/application/v6/applications/:app_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        PatchApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id"
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
     * 更新应用分组信息，更新应用的分组信息（分组会影响应用在工作台中的分类情况，请谨慎更新）
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/patch</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/PatchApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/PatchApplicationSample.java</a> ;
     */
    public PatchApplicationResp patch(PatchApplicationReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PATCH"
                , "/open-apis/application/v6/applications/:app_id"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        PatchApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, PatchApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/:app_id"
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
     * 查看待审核的应用列表，查看本企业下所有待审核的自建应用列表
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/UnderauditlistApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/UnderauditlistApplicationSample.java</a> ;
     */
    public UnderauditlistApplicationResp underauditlist(UnderauditlistApplicationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/underauditlist"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        UnderauditlistApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UnderauditlistApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/underauditlist"
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
     * 查看待审核的应用列表，查看本企业下所有待审核的自建应用列表
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/application-v6/application/underauditlist</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/UnderauditlistApplicationSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/applicationv6/UnderauditlistApplicationSample.java</a> ;
     */
    public UnderauditlistApplicationResp underauditlist(UnderauditlistApplicationReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/application/v6/applications/underauditlist"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        UnderauditlistApplicationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UnderauditlistApplicationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/application/v6/applications/underauditlist"
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
