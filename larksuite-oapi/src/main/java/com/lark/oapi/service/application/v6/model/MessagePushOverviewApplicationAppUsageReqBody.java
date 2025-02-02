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

package com.lark.oapi.service.application.v6.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
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

public class MessagePushOverviewApplicationAppUsageReqBody {
    /**
     * 查询日期，若cycle_type为week，则输入的date必须为周一； 若cycle_type为month，则输入的date必须为每月1号
     * <p> 示例值：2021-07-08
     */
    @SerializedName("date")
    private String date;
    /**
     * 枚举值：day，week，month；week指自然周，返回当前日期所在周的数据；不满一周则从周一到当前日期算。month指自然月，返回当前日期所在月的数据。
     * <p> 示例值：1
     */
    @SerializedName("cycle_type")
    private Integer cycleType;
    /**
     * 需要查询的部门id，获取方法可参考[部门ID概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview);-  若部门id为空，则返回当前租户的使用数据；若填写部门id，则返回当前部门的使用数据（包含子部门的用户）； ;-  若路径参数中department_id_type为空或者为open_department_id，则此处应该填写部门的 open_department_id；若路径参数中department_id_type为department_id，则此处应该填写部门的 department_id。返回当前部门的使用数据； 若不填写，则返回当前租户的使用数据
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    @SerializedName("department_id")
    private String departmentId;

    // builder 开始
    public MessagePushOverviewApplicationAppUsageReqBody() {
    }

    public MessagePushOverviewApplicationAppUsageReqBody(Builder builder) {
        /**
         * 查询日期，若cycle_type为week，则输入的date必须为周一； 若cycle_type为month，则输入的date必须为每月1号
         * <p> 示例值：2021-07-08
         */
        this.date = builder.date;
        /**
         * 枚举值：day，week，month；week指自然周，返回当前日期所在周的数据；不满一周则从周一到当前日期算。month指自然月，返回当前日期所在月的数据。
         * <p> 示例值：1
         */
        this.cycleType = builder.cycleType;
        /**
         * 需要查询的部门id，获取方法可参考[部门ID概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview);-  若部门id为空，则返回当前租户的使用数据；若填写部门id，则返回当前部门的使用数据（包含子部门的用户）； ;-  若路径参数中department_id_type为空或者为open_department_id，则此处应该填写部门的 open_department_id；若路径参数中department_id_type为department_id，则此处应该填写部门的 department_id。返回当前部门的使用数据； 若不填写，则返回当前租户的使用数据
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        this.departmentId = builder.departmentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCycleType() {
        return this.cycleType;
    }

    public void setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public static class Builder {
        /**
         * 查询日期，若cycle_type为week，则输入的date必须为周一； 若cycle_type为month，则输入的date必须为每月1号
         * <p> 示例值：2021-07-08
         */
        private String date;
        /**
         * 枚举值：day，week，month；week指自然周，返回当前日期所在周的数据；不满一周则从周一到当前日期算。month指自然月，返回当前日期所在月的数据。
         * <p> 示例值：1
         */
        private Integer cycleType;
        /**
         * 需要查询的部门id，获取方法可参考[部门ID概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview);-  若部门id为空，则返回当前租户的使用数据；若填写部门id，则返回当前部门的使用数据（包含子部门的用户）； ;-  若路径参数中department_id_type为空或者为open_department_id，则此处应该填写部门的 open_department_id；若路径参数中department_id_type为department_id，则此处应该填写部门的 department_id。返回当前部门的使用数据； 若不填写，则返回当前租户的使用数据
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        private String departmentId;

        /**
         * 查询日期，若cycle_type为week，则输入的date必须为周一； 若cycle_type为month，则输入的date必须为每月1号
         * <p> 示例值：2021-07-08
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 枚举值：day，week，month；week指自然周，返回当前日期所在周的数据；不满一周则从周一到当前日期算。month指自然月，返回当前日期所在月的数据。
         * <p> 示例值：1
         *
         * @param cycleType
         * @return
         */
        public Builder cycleType(Integer cycleType) {
            this.cycleType = cycleType;
            return this;
        }

        /**
         * 枚举值：day，week，month；week指自然周，返回当前日期所在周的数据；不满一周则从周一到当前日期算。month指自然月，返回当前日期所在月的数据。
         * <p> 示例值：1
         *
         * @param cycleType {@link com.lark.oapi.service.application.v6.enums.MessagePushOverviewApplicationAppUsageMessagePushOverviewApplicationAppUsageCycleTypeEnum}
         * @return
         */
        public Builder cycleType(com.lark.oapi.service.application.v6.enums.MessagePushOverviewApplicationAppUsageMessagePushOverviewApplicationAppUsageCycleTypeEnum cycleType) {
            this.cycleType = cycleType.getValue();
            return this;
        }


        /**
         * 需要查询的部门id，获取方法可参考[部门ID概述](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/department/field-overview);-  若部门id为空，则返回当前租户的使用数据；若填写部门id，则返回当前部门的使用数据（包含子部门的用户）； ;-  若路径参数中department_id_type为空或者为open_department_id，则此处应该填写部门的 open_department_id；若路径参数中department_id_type为department_id，则此处应该填写部门的 department_id。返回当前部门的使用数据； 若不填写，则返回当前租户的使用数据
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        public MessagePushOverviewApplicationAppUsageReqBody build() {
            return new MessagePushOverviewApplicationAppUsageReqBody(this);
        }
    }
}
