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

package com.lark.oapi.service.compensation.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.compensation.v1.enums.*;
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

public class PlanItem {
    /**
     * 定薪方式
     * <p> 示例值：manual
     */
    @SerializedName("adjustment_type")
    private String adjustmentType;
    /**
     * 薪酬项ID，详细信息可以通过[批量查询薪资项](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item/list)接口查询获得
     * <p> 示例值：21341234
     */
    @SerializedName("item_id")
    private String itemId;
    /**
     * 方案关联薪资项逻辑配置
     * <p> 示例值：
     */
    @SerializedName("plan_item_logic")
    private AdjustmentLogic planItemLogic;
    /**
     * 试用期薪酬类型
     * <p> 示例值：percentum
     */
    @SerializedName("probation_discount_type")
    private String probationDiscountType;
    /**
     * 试用期薪酬百分比
     * <p> 示例值：80.00
     */
    @SerializedName("probation_discount_percentum")
    private String probationDiscountPercentum;

    // builder 开始
    public PlanItem() {
    }

    public PlanItem(Builder builder) {
        /**
         * 定薪方式
         * <p> 示例值：manual
         */
        this.adjustmentType = builder.adjustmentType;
        /**
         * 薪酬项ID，详细信息可以通过[批量查询薪资项](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item/list)接口查询获得
         * <p> 示例值：21341234
         */
        this.itemId = builder.itemId;
        /**
         * 方案关联薪资项逻辑配置
         * <p> 示例值：
         */
        this.planItemLogic = builder.planItemLogic;
        /**
         * 试用期薪酬类型
         * <p> 示例值：percentum
         */
        this.probationDiscountType = builder.probationDiscountType;
        /**
         * 试用期薪酬百分比
         * <p> 示例值：80.00
         */
        this.probationDiscountPercentum = builder.probationDiscountPercentum;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public AdjustmentLogic getPlanItemLogic() {
        return this.planItemLogic;
    }

    public void setPlanItemLogic(AdjustmentLogic planItemLogic) {
        this.planItemLogic = planItemLogic;
    }

    public String getProbationDiscountType() {
        return this.probationDiscountType;
    }

    public void setProbationDiscountType(String probationDiscountType) {
        this.probationDiscountType = probationDiscountType;
    }

    public String getProbationDiscountPercentum() {
        return this.probationDiscountPercentum;
    }

    public void setProbationDiscountPercentum(String probationDiscountPercentum) {
        this.probationDiscountPercentum = probationDiscountPercentum;
    }

    public static class Builder {
        /**
         * 定薪方式
         * <p> 示例值：manual
         */
        private String adjustmentType;
        /**
         * 薪酬项ID，详细信息可以通过[批量查询薪资项](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item/list)接口查询获得
         * <p> 示例值：21341234
         */
        private String itemId;
        /**
         * 方案关联薪资项逻辑配置
         * <p> 示例值：
         */
        private AdjustmentLogic planItemLogic;
        /**
         * 试用期薪酬类型
         * <p> 示例值：percentum
         */
        private String probationDiscountType;
        /**
         * 试用期薪酬百分比
         * <p> 示例值：80.00
         */
        private String probationDiscountPercentum;

        /**
         * 定薪方式
         * <p> 示例值：manual
         *
         * @param adjustmentType
         * @return
         */
        public Builder adjustmentType(String adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        /**
         * 定薪方式
         * <p> 示例值：manual
         *
         * @param adjustmentType {@link com.lark.oapi.service.compensation.v1.enums.PlanItemAdjustmentTypeEnum}
         * @return
         */
        public Builder adjustmentType(com.lark.oapi.service.compensation.v1.enums.PlanItemAdjustmentTypeEnum adjustmentType) {
            this.adjustmentType = adjustmentType.getValue();
            return this;
        }


        /**
         * 薪酬项ID，详细信息可以通过[批量查询薪资项](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/compensation-v1/item/list)接口查询获得
         * <p> 示例值：21341234
         *
         * @param itemId
         * @return
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }


        /**
         * 方案关联薪资项逻辑配置
         * <p> 示例值：
         *
         * @param planItemLogic
         * @return
         */
        public Builder planItemLogic(AdjustmentLogic planItemLogic) {
            this.planItemLogic = planItemLogic;
            return this;
        }


        /**
         * 试用期薪酬类型
         * <p> 示例值：percentum
         *
         * @param probationDiscountType
         * @return
         */
        public Builder probationDiscountType(String probationDiscountType) {
            this.probationDiscountType = probationDiscountType;
            return this;
        }

        /**
         * 试用期薪酬类型
         * <p> 示例值：percentum
         *
         * @param probationDiscountType {@link com.lark.oapi.service.compensation.v1.enums.PlanItemProbationDiscountTypeEnum}
         * @return
         */
        public Builder probationDiscountType(com.lark.oapi.service.compensation.v1.enums.PlanItemProbationDiscountTypeEnum probationDiscountType) {
            this.probationDiscountType = probationDiscountType.getValue();
            return this;
        }


        /**
         * 试用期薪酬百分比
         * <p> 示例值：80.00
         *
         * @param probationDiscountPercentum
         * @return
         */
        public Builder probationDiscountPercentum(String probationDiscountPercentum) {
            this.probationDiscountPercentum = probationDiscountPercentum;
            return this;
        }


        public PlanItem build() {
            return new PlanItem(this);
        }
    }
}
