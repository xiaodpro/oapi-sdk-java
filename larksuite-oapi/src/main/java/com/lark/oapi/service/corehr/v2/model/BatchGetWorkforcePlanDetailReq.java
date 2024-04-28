package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Query;

public class BatchGetWorkforcePlanDetailReq {

    @Query
    @SerializedName("page_token")
    private String pageToken;
    @Query
    @SerializedName("page_size")
    private Integer pageSize;

    @Body
    private BatchGetWorkforcePlanDetailReqBody body;

    public String getPageToken() {
        return pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public BatchGetWorkforcePlanDetailReq() {
    }

    public BatchGetWorkforcePlanDetailReq(Builder builder) {
        this.pageToken = builder.pageToken;
        this.pageSize = builder.pageSize;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String pageToken;
        private Integer pageSize;
        private BatchGetWorkforcePlanDetailReqBody body;

        public Builder() {
        }

        public BatchGetWorkforcePlanDetailReq.Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public BatchGetWorkforcePlanDetailReq.Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public BatchGetWorkforcePlanDetailReq.Builder body(BatchGetWorkforcePlanDetailReqBody body) {
            this.body = body;
            return this;
        }

        public BatchGetWorkforcePlanDetailReq build() {
            return new BatchGetWorkforcePlanDetailReq(this);
        }
    }
}
