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

package com.lark.oapi.core.response.error;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Error {

    @SerializedName("log_id")
    private String logId;
    @SerializedName("message")
    private String message;
    @SerializedName("troubleshooter")
    private String troubleshooter;
    @SerializedName("details")
    private ErrorDetail[] details;
    @SerializedName("permission_violations")
    private ErrorPermissionViolation[] permissionViolations;
    @SerializedName("field_violations")
    private ErrorFieldViolation[] fieldViolations;
    @SerializedName("helps")
    private ErrorHelp[] helps;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTroubleshooter() {
        return troubleshooter;
    }

    public void setTroubleshooter(String troubleshooter) {
        this.troubleshooter = troubleshooter;
    }

    public ErrorDetail[] getDetails() {
        return details;
    }

    public void setDetails(ErrorDetail[] details) {
        this.details = details;
    }

    public ErrorPermissionViolation[] getPermissionViolations() {
        return permissionViolations;
    }

    public void setPermissionViolations(ErrorPermissionViolation[] permissionViolations) {
        this.permissionViolations = permissionViolations;
    }

    public ErrorFieldViolation[] getFieldViolations() {
        return fieldViolations;
    }

    public void setFieldViolations(ErrorFieldViolation[] fieldViolations) {
        this.fieldViolations = fieldViolations;
    }

    public ErrorHelp[] getHelps() {
        return helps;
    }

    public void setHelps(ErrorHelp[] helps) {
        this.helps = helps;
    }

    @Override
    public String toString() {
        return "{" +
                "logId=" + logId +
                ", message=" + message +
                ", troubleshooter=" + troubleshooter +
                ", details=" + Arrays.toString(details) +
                ", permissionViolations=" + Arrays.toString(permissionViolations) +
                ", fieldViolations=" + Arrays.toString(fieldViolations) +
                ", helps=" + Arrays.toString(helps) +
                '}';
    }
}
