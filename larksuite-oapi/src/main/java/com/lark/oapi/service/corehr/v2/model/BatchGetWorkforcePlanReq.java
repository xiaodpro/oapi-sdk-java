package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class BatchGetWorkforcePlanReq {

    @Query
    @SerializedName("get_all_plan")
    private Boolean getAllPlan;
    @Query
    @SerializedName("active")
    private Boolean active;

    public BatchGetWorkforcePlanReq() {
    }

    public BatchGetWorkforcePlanReq(Builder builder) {
        this.getAllPlan = builder.getAllPlan;
        this.active = builder.active;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getGetAllPlan() {
        return this.getAllPlan;
    }

    public void setGetAllPlan(Boolean getAllPlan) {
        this.getAllPlan = getAllPlan;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public static class Builder {
        private Boolean getAllPlan;
        private Boolean active;

        public Builder() {
        }

        public BatchGetWorkforcePlanReq.Builder getAllPlan(Boolean getAllPlan) {
            this.getAllPlan = getAllPlan;
            return this;
        }

        public BatchGetWorkforcePlanReq.Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public BatchGetWorkforcePlanReq build() {
            return new BatchGetWorkforcePlanReq(this);
        }
    }
}
