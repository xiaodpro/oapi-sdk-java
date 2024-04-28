package com.lark.oapi.service.corehr.v2.model;

import com.google.gson.annotations.SerializedName;

public class BatchGetWorkforcePlanRespBody {

    @SerializedName("items")
    private WorkforcePlan[] items;
    @SerializedName("total")
    private Integer total;

    public WorkforcePlan[] getItems() {
        return items;
    }

    public Integer getTotal() {
        return total;
    }

    public void setItems(WorkforcePlan[] items) {
        this.items = items;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
