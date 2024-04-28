package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class BatchGetWorkforcePlanDetailRespBody {

    @SerializedName("workforce_plan_id")
    private String workforcePlanId;
    @SerializedName("centralized_reporting_project_id")
    private String centralizedReportingProjectId;
    @SerializedName("items")
    private WorkforcePlanDetail[] items;
    @SerializedName("page_token")
    private String pageToken;
    @SerializedName("has_more")
    private Boolean hasMore;

    public String getWorkforcePlanId() {
        return workforcePlanId;
    }

    public void setWorkforcePlanId(String workforcePlanId) {
        this.workforcePlanId = workforcePlanId;
    }

    public String getCentralizedReportingProjectId() {
        return centralizedReportingProjectId;
    }

    public void setCentralizedReportingProjectId(String centralizedReportingProjectId) {
        this.centralizedReportingProjectId = centralizedReportingProjectId;
    }

    public WorkforcePlanDetail[] getItems() {
        return items;
    }

    public void setItems(WorkforcePlanDetail[] items) {
        this.items = items;
    }

    public String getPageToken() {
        return pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Boolean hasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

}
