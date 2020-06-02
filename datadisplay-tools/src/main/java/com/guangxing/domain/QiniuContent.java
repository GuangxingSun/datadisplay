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
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 上传成功后，存储结果
 * @author Guangxing
 * @date 2018-12-31
 */
@Entity
@Table(name = "tool_qiniu_content")
public class QiniuContent implements Serializable {

    @Id
    @Column(name = "content_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @ApiModelProperty(value = "文件名")
    private String key;

    @ApiModelProperty(value = "空间名")
    private String bucket;

    @ApiModelProperty(value = "大小")
    private String size;

    @ApiModelProperty(value = "文件地址")
    private String url;

    @ApiModelProperty(value = "文件类型")
    private String suffix;

    @ApiModelProperty(value = "空间类型：公开/私有")
    private String type = "公开";

    @UpdateTimestamp
    @ApiModelProperty(value = "创建或更新时间")
    @Column(name = "update_time")
    private Timestamp updateTime;

    public QiniuContent() {
    }

    public Long getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public String getType() {
        return this.type;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof QiniuContent)) return false;
        final QiniuContent other = (QiniuContent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$key = this.getKey();
        final Object other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false;
        final Object this$bucket = this.getBucket();
        final Object other$bucket = other.getBucket();
        if (this$bucket == null ? other$bucket != null : !this$bucket.equals(other$bucket)) return false;
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$suffix = this.getSuffix();
        final Object other$suffix = other.getSuffix();
        if (this$suffix == null ? other$suffix != null : !this$suffix.equals(other$suffix)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof QiniuContent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $key = this.getKey();
        result = result * PRIME + ($key == null ? 43 : $key.hashCode());
        final Object $bucket = this.getBucket();
        result = result * PRIME + ($bucket == null ? 43 : $bucket.hashCode());
        final Object $size = this.getSize();
        result = result * PRIME + ($size == null ? 43 : $size.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $suffix = this.getSuffix();
        result = result * PRIME + ($suffix == null ? 43 : $suffix.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "QiniuContent(id=" + this.getId() + ", key=" + this.getKey() + ", bucket=" + this.getBucket() + ", size=" + this.getSize() + ", url=" + this.getUrl() + ", suffix=" + this.getSuffix() + ", type=" + this.getType() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}
