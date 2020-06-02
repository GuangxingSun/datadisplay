/*
 *  Copyright 2019-2020 Guangxing
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.guangxing.domain;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * sm.ms图床
 *
 * @author Guangxing
 * @date 2018-12-27
 */
@Entity
@Table(name = "tool_picture")
public class Picture implements Serializable {

    @Id
    @Column(name = "picture_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "文件名")
    private String filename;

    @ApiModelProperty(value = "图片url")
    private String url;

    @ApiModelProperty(value = "图片大小")
    private String size;

    @ApiModelProperty(value = "图片高")
    private String height;

    @ApiModelProperty(value = "图片宽")
    private String width;

    @Column(name = "delete_url")
    @ApiModelProperty(value = "用于删除的url")
    private String delete;

    @ApiModelProperty(value = "创建者")
    private String username;

    @CreationTimestamp
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;

    /** 用于检测文件是否重复 */
    private String md5Code;

    public Picture() {
    }

    @Override
    public String toString() {
        return "Picture{" +
                "filename='" + filename + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getUrl() {
        return this.url;
    }

    public String getSize() {
        return this.size;
    }

    public String getHeight() {
        return this.height;
    }

    public String getWidth() {
        return this.width;
    }

    public String getDelete() {
        return this.delete;
    }

    public String getUsername() {
        return this.username;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public String getMd5Code() {
        return this.md5Code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Picture)) return false;
        final Picture other = (Picture) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$filename = this.getFilename();
        final Object other$filename = other.getFilename();
        if (this$filename == null ? other$filename != null : !this$filename.equals(other$filename)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$height = this.getHeight();
        final Object other$height = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) return false;
        final Object this$width = this.getWidth();
        final Object other$width = other.getWidth();
        if (this$width == null ? other$width != null : !this$width.equals(other$width)) return false;
        final Object this$delete = this.getDelete();
        final Object other$delete = other.getDelete();
        if (this$delete == null ? other$delete != null : !this$delete.equals(other$delete)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$md5Code = this.getMd5Code();
        final Object other$md5Code = other.getMd5Code();
        if (this$md5Code == null ? other$md5Code != null : !this$md5Code.equals(other$md5Code)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Picture;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $filename = this.getFilename();
        result = result * PRIME + ($filename == null ? 43 : $filename.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $height = this.getHeight();
        result = result * PRIME + ($height == null ? 43 : $height.hashCode());
        final Object $width = this.getWidth();
        result = result * PRIME + ($width == null ? 43 : $width.hashCode());
        final Object $delete = this.getDelete();
        result = result * PRIME + ($delete == null ? 43 : $delete.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $md5Code = this.getMd5Code();
        result = result * PRIME + ($md5Code == null ? 43 : $md5Code.hashCode());
        return result;
    }
}
