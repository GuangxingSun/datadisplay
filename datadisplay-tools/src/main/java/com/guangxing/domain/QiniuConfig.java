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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 七牛云对象存储配置类
 * @author Guangxing
 * @date 2018-12-31
 */
@Entity
@Table(name = "tool_qiniu_config")
public class QiniuConfig implements Serializable {

    @Id
    @Column(name = "config_id")
    @ApiModelProperty(value = "ID")
    private Long id;

    @NotBlank
    @ApiModelProperty(value = "accessKey")
    private String accessKey;

    @NotBlank
    @ApiModelProperty(value = "secretKey")
    private String secretKey;

    @NotBlank
    @ApiModelProperty(value = "存储空间名称作为唯一的 Bucket 识别符")
    private String bucket;

    /**
     * Zone表示与机房的对应关系
     * 华东	Zone.zone0()
     * 华北	Zone.zone1()
     * 华南	Zone.zone2()
     * 北美	Zone.zoneNa0()
     * 东南亚	Zone.zoneAs0()
     */
    @NotBlank
    @ApiModelProperty(value = "Zone表示与机房的对应关系")
    private String zone;

    @NotBlank
    @ApiModelProperty(value = "外链域名，可自定义，需在七牛云绑定")
    private String host;

    @ApiModelProperty(value = "空间类型：公开/私有")
    private String type = "公开";

    public QiniuConfig() {
    }

    public Long getId() {
        return this.id;
    }

    public @NotBlank String getAccessKey() {
        return this.accessKey;
    }

    public @NotBlank String getSecretKey() {
        return this.secretKey;
    }

    public @NotBlank String getBucket() {
        return this.bucket;
    }

    public @NotBlank String getZone() {
        return this.zone;
    }

    public @NotBlank String getHost() {
        return this.host;
    }

    public String getType() {
        return this.type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccessKey(@NotBlank String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(@NotBlank String secretKey) {
        this.secretKey = secretKey;
    }

    public void setBucket(@NotBlank String bucket) {
        this.bucket = bucket;
    }

    public void setZone(@NotBlank String zone) {
        this.zone = zone;
    }

    public void setHost(@NotBlank String host) {
        this.host = host;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof QiniuConfig)) return false;
        final QiniuConfig other = (QiniuConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$accessKey = this.getAccessKey();
        final Object other$accessKey = other.getAccessKey();
        if (this$accessKey == null ? other$accessKey != null : !this$accessKey.equals(other$accessKey)) return false;
        final Object this$secretKey = this.getSecretKey();
        final Object other$secretKey = other.getSecretKey();
        if (this$secretKey == null ? other$secretKey != null : !this$secretKey.equals(other$secretKey)) return false;
        final Object this$bucket = this.getBucket();
        final Object other$bucket = other.getBucket();
        if (this$bucket == null ? other$bucket != null : !this$bucket.equals(other$bucket)) return false;
        final Object this$zone = this.getZone();
        final Object other$zone = other.getZone();
        if (this$zone == null ? other$zone != null : !this$zone.equals(other$zone)) return false;
        final Object this$host = this.getHost();
        final Object other$host = other.getHost();
        if (this$host == null ? other$host != null : !this$host.equals(other$host)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof QiniuConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $accessKey = this.getAccessKey();
        result = result * PRIME + ($accessKey == null ? 43 : $accessKey.hashCode());
        final Object $secretKey = this.getSecretKey();
        result = result * PRIME + ($secretKey == null ? 43 : $secretKey.hashCode());
        final Object $bucket = this.getBucket();
        result = result * PRIME + ($bucket == null ? 43 : $bucket.hashCode());
        final Object $zone = this.getZone();
        result = result * PRIME + ($zone == null ? 43 : $zone.hashCode());
        final Object $host = this.getHost();
        result = result * PRIME + ($host == null ? 43 : $host.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "QiniuConfig(id=" + this.getId() + ", accessKey=" + this.getAccessKey() + ", secretKey=" + this.getSecretKey() + ", bucket=" + this.getBucket() + ", zone=" + this.getZone() + ", host=" + this.getHost() + ", type=" + this.getType() + ")";
    }
}
