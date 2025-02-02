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

package com.lark.oapi.service.bitable.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.bitable.v1.enums.*;
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

public class AppRole {
    /**
     * 自定义角色的名字
     * <p> 示例值：自定义角色1
     */
    @SerializedName("role_name")
    private String roleName;
    /**
     * 自定义角色的id
     * <p> 示例值：roljRpwIUt
     */
    @SerializedName("role_id")
    private String roleId;
    /**
     * 数据表角色
     * <p> 示例值：
     */
    @SerializedName("table_roles")
    private AppRoleTableRole[] tableRoles;
    /**
     * block权限
     * <p> 示例值：
     */
    @SerializedName("block_roles")
    private AppRoleBlockRole[] blockRoles;

    // builder 开始
    public AppRole() {
    }

    public AppRole(Builder builder) {
        /**
         * 自定义角色的名字
         * <p> 示例值：自定义角色1
         */
        this.roleName = builder.roleName;
        /**
         * 自定义角色的id
         * <p> 示例值：roljRpwIUt
         */
        this.roleId = builder.roleId;
        /**
         * 数据表角色
         * <p> 示例值：
         */
        this.tableRoles = builder.tableRoles;
        /**
         * block权限
         * <p> 示例值：
         */
        this.blockRoles = builder.blockRoles;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public AppRoleTableRole[] getTableRoles() {
        return this.tableRoles;
    }

    public void setTableRoles(AppRoleTableRole[] tableRoles) {
        this.tableRoles = tableRoles;
    }

    public AppRoleBlockRole[] getBlockRoles() {
        return this.blockRoles;
    }

    public void setBlockRoles(AppRoleBlockRole[] blockRoles) {
        this.blockRoles = blockRoles;
    }

    public static class Builder {
        /**
         * 自定义角色的名字
         * <p> 示例值：自定义角色1
         */
        private String roleName;
        /**
         * 自定义角色的id
         * <p> 示例值：roljRpwIUt
         */
        private String roleId;
        /**
         * 数据表角色
         * <p> 示例值：
         */
        private AppRoleTableRole[] tableRoles;
        /**
         * block权限
         * <p> 示例值：
         */
        private AppRoleBlockRole[] blockRoles;

        /**
         * 自定义角色的名字
         * <p> 示例值：自定义角色1
         *
         * @param roleName
         * @return
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }


        /**
         * 自定义角色的id
         * <p> 示例值：roljRpwIUt
         *
         * @param roleId
         * @return
         */
        public Builder roleId(String roleId) {
            this.roleId = roleId;
            return this;
        }


        /**
         * 数据表角色
         * <p> 示例值：
         *
         * @param tableRoles
         * @return
         */
        public Builder tableRoles(AppRoleTableRole[] tableRoles) {
            this.tableRoles = tableRoles;
            return this;
        }


        /**
         * block权限
         * <p> 示例值：
         *
         * @param blockRoles
         * @return
         */
        public Builder blockRoles(AppRoleBlockRole[] blockRoles) {
            this.blockRoles = blockRoles;
            return this;
        }


        public AppRole build() {
            return new AppRole(this);
        }
    }
}
