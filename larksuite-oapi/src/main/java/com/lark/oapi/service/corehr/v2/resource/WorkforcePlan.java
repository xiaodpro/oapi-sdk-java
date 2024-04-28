package com.lark.oapi.service.corehr.v2.resource;

import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.corehr.v2.model.BatchGetWorkforcePlanReq;
import com.lark.oapi.service.corehr.v2.model.BatchGetWorkforcePlanResp;



public class WorkforcePlan {

    private static final Logger log = LoggerFactory.getLogger(Contract.class);
    private final Config config;

    public WorkforcePlan(Config config) {
        this.config = config;
    }

    /**
     * 查询编制规划方案列表
     * 灰度中，暂不对外开放
     * https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/corehr-v2/workforce_plan/list
     * @throws Exception 
     */
    public BatchGetWorkforcePlanResp list(BatchGetWorkforcePlanReq req) throws Exception {
        log.info("list req: {}", req);
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/corehr/v2/workforce_plans"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , null);
        // 反序列化
        BatchGetWorkforcePlanResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BatchGetWorkforcePlanResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,",  "/open-apis/corehr/v2/workforce_plans"
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
