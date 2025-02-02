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

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
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

public class CreateExamRespBody {
    /**
     * 笔试 ID
     * <p> 示例值：7031822096580868396
     */
    @SerializedName("exam_id")
    private String examId;
    /**
     * 投递 ID
     * <p> 示例值：7031822096580868396
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 试卷名称
     * <p> 示例值：测试名字
     */
    @SerializedName("exam_resource_name")
    private String examResourceName;
    /**
     * 笔试分数
     * <p> 示例值：95.5
     */
    @SerializedName("score")
    private Double score;
    /**
     * 附件ID
     * <p> 示例值：6949805467799537964
     */
    @SerializedName("uuid")
    private String uuid;
    /**
     * 操作人 ID
     * <p> 示例值：ou_xxx
     */
    @SerializedName("operator_id")
    private String operatorId;
    /**
     * 操作时间
     * <p> 示例值：1637295516451
     */
    @SerializedName("operate_time")
    private String operateTime;

    public String getExamId() {
        return this.examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getExamResourceName() {
        return this.examResourceName;
    }

    public void setExamResourceName(String examResourceName) {
        this.examResourceName = examResourceName;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperateTime() {
        return this.operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

}
