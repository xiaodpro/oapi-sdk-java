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
import com.lark.oapi.service.moments.v1.enums.*;
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

public class Post {
    /**
     * 发帖用户ID
     * <p> 示例值："ou_xxxxx"
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 帖子内容
     * <p> 示例值："[[{\"tag\":\"text\",\"text\":\"豪华中型车…………\"},{\"tag\":\"a\",\"text\":\"查看原文\",\"href\":\"https://www.autohome.com.cn/advice/202204/1244455.html\"}]]"
     */
    @SerializedName("content")
    private String content;
    /**
     * 图片的key 列表
     * <p> 示例值：
     */
    @SerializedName("image_key_list")
    private String[] imageKeyList;
    /**
     * 媒体文件的 token
     * <p> 示例值：""
     */
    @SerializedName("media_file_token")
    private String mediaFileToken;
    /**
     * 评论数
     * <p> 示例值：1
     */
    @SerializedName("comment_count")
    private Integer commentCount;
    /**
     * 帖子的reaction及其数量
     * <p> 示例值：
     */
    @SerializedName("reaction_set")
    private ReactionSet reactionSet;
    /**
     * 帖子ID
     * <p> 示例值："248381241"
     */
    @SerializedName("id")
    private String id;
    /**
     * 帖子创建时间
     * <p> 示例值："2022-05-23T00:00:00+08:00"
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 视频封面图片
     * <p> 示例值：""
     */
    @SerializedName("media_cover_image_key")
    private String mediaCoverImageKey;
    /**
     * 创建帖子时去重用
     * <p> 示例值："generate-a-uuid-here"
     */
    @SerializedName("cid")
    private String cid;
    /**
     * 帖子所属板块
     * <p> 示例值：
     */
    @SerializedName("category_ids")
    private String[] categoryIds;
    /**
     * 帖子链接
     * <p> 示例值："https://applink.feishu.cn/client/moments/detail?postId=7254"
     */
    @SerializedName("link")
    private String link;
    /**
     * 发帖人类型
     * <p> 示例值：1
     */
    @SerializedName("user_type")
    private Integer userType;
    /**
     * 点踩数量
     * <p> 示例值：0
     */
    @SerializedName("dislike_count")
    private Integer dislikeCount;

    // builder 开始
    public Post() {
    }

    public Post(Builder builder) {
        /**
         * 发帖用户ID
         * <p> 示例值："ou_xxxxx"
         */
        this.userId = builder.userId;
        /**
         * 帖子内容
         * <p> 示例值："[[{\"tag\":\"text\",\"text\":\"豪华中型车…………\"},{\"tag\":\"a\",\"text\":\"查看原文\",\"href\":\"https://www.autohome.com.cn/advice/202204/1244455.html\"}]]"
         */
        this.content = builder.content;
        /**
         * 图片的key 列表
         * <p> 示例值：
         */
        this.imageKeyList = builder.imageKeyList;
        /**
         * 媒体文件的 token
         * <p> 示例值：""
         */
        this.mediaFileToken = builder.mediaFileToken;
        /**
         * 评论数
         * <p> 示例值：1
         */
        this.commentCount = builder.commentCount;
        /**
         * 帖子的reaction及其数量
         * <p> 示例值：
         */
        this.reactionSet = builder.reactionSet;
        /**
         * 帖子ID
         * <p> 示例值："248381241"
         */
        this.id = builder.id;
        /**
         * 帖子创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         */
        this.createTime = builder.createTime;
        /**
         * 视频封面图片
         * <p> 示例值：""
         */
        this.mediaCoverImageKey = builder.mediaCoverImageKey;
        /**
         * 创建帖子时去重用
         * <p> 示例值："generate-a-uuid-here"
         */
        this.cid = builder.cid;
        /**
         * 帖子所属板块
         * <p> 示例值：
         */
        this.categoryIds = builder.categoryIds;
        /**
         * 帖子链接
         * <p> 示例值："https://applink.feishu.cn/client/moments/detail?postId=7254"
         */
        this.link = builder.link;
        /**
         * 发帖人类型
         * <p> 示例值：1
         */
        this.userType = builder.userType;
        /**
         * 点踩数量
         * <p> 示例值：0
         */
        this.dislikeCount = builder.dislikeCount;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getImageKeyList() {
        return this.imageKeyList;
    }

    public void setImageKeyList(String[] imageKeyList) {
        this.imageKeyList = imageKeyList;
    }

    public String getMediaFileToken() {
        return this.mediaFileToken;
    }

    public void setMediaFileToken(String mediaFileToken) {
        this.mediaFileToken = mediaFileToken;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public ReactionSet getReactionSet() {
        return this.reactionSet;
    }

    public void setReactionSet(ReactionSet reactionSet) {
        this.reactionSet = reactionSet;
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

    public String getMediaCoverImageKey() {
        return this.mediaCoverImageKey;
    }

    public void setMediaCoverImageKey(String mediaCoverImageKey) {
        this.mediaCoverImageKey = mediaCoverImageKey;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String[] getCategoryIds() {
        return this.categoryIds;
    }

    public void setCategoryIds(String[] categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getDislikeCount() {
        return this.dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public static class Builder {
        /**
         * 发帖用户ID
         * <p> 示例值："ou_xxxxx"
         */
        private String userId;
        /**
         * 帖子内容
         * <p> 示例值："[[{\"tag\":\"text\",\"text\":\"豪华中型车…………\"},{\"tag\":\"a\",\"text\":\"查看原文\",\"href\":\"https://www.autohome.com.cn/advice/202204/1244455.html\"}]]"
         */
        private String content;
        /**
         * 图片的key 列表
         * <p> 示例值：
         */
        private String[] imageKeyList;
        /**
         * 媒体文件的 token
         * <p> 示例值：""
         */
        private String mediaFileToken;
        /**
         * 评论数
         * <p> 示例值：1
         */
        private Integer commentCount;
        /**
         * 帖子的reaction及其数量
         * <p> 示例值：
         */
        private ReactionSet reactionSet;
        /**
         * 帖子ID
         * <p> 示例值："248381241"
         */
        private String id;
        /**
         * 帖子创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         */
        private String createTime;
        /**
         * 视频封面图片
         * <p> 示例值：""
         */
        private String mediaCoverImageKey;
        /**
         * 创建帖子时去重用
         * <p> 示例值："generate-a-uuid-here"
         */
        private String cid;
        /**
         * 帖子所属板块
         * <p> 示例值：
         */
        private String[] categoryIds;
        /**
         * 帖子链接
         * <p> 示例值："https://applink.feishu.cn/client/moments/detail?postId=7254"
         */
        private String link;
        /**
         * 发帖人类型
         * <p> 示例值：1
         */
        private Integer userType;
        /**
         * 点踩数量
         * <p> 示例值：0
         */
        private Integer dislikeCount;

        /**
         * 发帖用户ID
         * <p> 示例值："ou_xxxxx"
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 帖子内容
         * <p> 示例值："[[{\"tag\":\"text\",\"text\":\"豪华中型车…………\"},{\"tag\":\"a\",\"text\":\"查看原文\",\"href\":\"https://www.autohome.com.cn/advice/202204/1244455.html\"}]]"
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 图片的key 列表
         * <p> 示例值：
         *
         * @param imageKeyList
         * @return
         */
        public Builder imageKeyList(String[] imageKeyList) {
            this.imageKeyList = imageKeyList;
            return this;
        }


        /**
         * 媒体文件的 token
         * <p> 示例值：""
         *
         * @param mediaFileToken
         * @return
         */
        public Builder mediaFileToken(String mediaFileToken) {
            this.mediaFileToken = mediaFileToken;
            return this;
        }


        /**
         * 评论数
         * <p> 示例值：1
         *
         * @param commentCount
         * @return
         */
        public Builder commentCount(Integer commentCount) {
            this.commentCount = commentCount;
            return this;
        }


        /**
         * 帖子的reaction及其数量
         * <p> 示例值：
         *
         * @param reactionSet
         * @return
         */
        public Builder reactionSet(ReactionSet reactionSet) {
            this.reactionSet = reactionSet;
            return this;
        }


        /**
         * 帖子ID
         * <p> 示例值："248381241"
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 帖子创建时间
         * <p> 示例值："2022-05-23T00:00:00+08:00"
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 视频封面图片
         * <p> 示例值：""
         *
         * @param mediaCoverImageKey
         * @return
         */
        public Builder mediaCoverImageKey(String mediaCoverImageKey) {
            this.mediaCoverImageKey = mediaCoverImageKey;
            return this;
        }


        /**
         * 创建帖子时去重用
         * <p> 示例值："generate-a-uuid-here"
         *
         * @param cid
         * @return
         */
        public Builder cid(String cid) {
            this.cid = cid;
            return this;
        }


        /**
         * 帖子所属板块
         * <p> 示例值：
         *
         * @param categoryIds
         * @return
         */
        public Builder categoryIds(String[] categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }


        /**
         * 帖子链接
         * <p> 示例值："https://applink.feishu.cn/client/moments/detail?postId=7254"
         *
         * @param link
         * @return
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }


        /**
         * 发帖人类型
         * <p> 示例值：1
         *
         * @param userType
         * @return
         */
        public Builder userType(Integer userType) {
            this.userType = userType;
            return this;
        }

        /**
         * 发帖人类型
         * <p> 示例值：1
         *
         * @param userType {@link com.lark.oapi.service.moments.v1.enums.PostUserTypeEnum}
         * @return
         */
        public Builder userType(com.lark.oapi.service.moments.v1.enums.PostUserTypeEnum userType) {
            this.userType = userType.getValue();
            return this;
        }


        /**
         * 点踩数量
         * <p> 示例值：0
         *
         * @param dislikeCount
         * @return
         */
        public Builder dislikeCount(Integer dislikeCount) {
            this.dislikeCount = dislikeCount;
            return this;
        }


        public Post build() {
            return new Post(this);
        }
    }
}
