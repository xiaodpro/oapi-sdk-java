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

package com.lark.oapi.service.moments.v1.model;

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

public class P2CommentCreatedV1Data {
    /**
     * 评论所属用户ID
     * <p> 示例值：
     */
    @SerializedName("user_id")
    private UserId userId;
    /**
     * 评论 ID
     * <p> 示例值："248381240"
     */
    @SerializedName("id")
    private String id;
    /**
     * 评论创建时间
     * <p> 示例值："2022-05-23T00:00:00+08:00"
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 评论所属帖子的ID
     * <p> 示例值："248381241"
     */
    @SerializedName("post_id")
    private String postId;
    /**
     * 回复的评论ID
     * <p> 示例值：""
     */
    @SerializedName("reply_comment_id")
    private String replyCommentId;
    /**
     * 根评论ID
     * <p> 示例值：""
     */
    @SerializedName("root_comment_id")
    private String rootCommentId;
    /**
     * 表情回复人类型
     * <p> 示例值：1
     */
    @SerializedName("user_type")
    private Integer userType;

    public UserId getUserId() {
        return this.userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPostId() {
        return this.postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getReplyCommentId() {
        return this.replyCommentId;
    }

    public void setReplyCommentId(String replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public String getRootCommentId() {
        return this.rootCommentId;
    }

    public void setRootCommentId(String rootCommentId) {
        this.rootCommentId = rootCommentId;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}
