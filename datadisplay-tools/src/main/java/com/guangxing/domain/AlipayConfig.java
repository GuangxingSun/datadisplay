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
 * 支付宝配置类
 * @author Guangxing
 * @date 2018-12-31
 */
@Entity
@Table(name = "tool_alipay_config")
public class AlipayConfig implements Serializable {

    @Id
    @Column(name = "config_id")
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @NotBlank
    @ApiModelProperty(value = "应用ID")
    private String appId;

    @NotBlank
    @ApiModelProperty(value = "商户私钥")
    private String privateKey;

    @NotBlank
    @ApiModelProperty(value = "支付宝公钥")
    private String publicKey;

    @ApiModelProperty(value = "签名方式")
    private String signType="RSA2";

    @Column(name = "gateway_url")
    @ApiModelProperty(value = "支付宝开放安全地址", hidden = true)
    private String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    @ApiModelProperty(value = "编码", hidden = true)
    private String charset= "utf-8";

    @NotBlank
    @ApiModelProperty(value = "异步通知地址")
    private String notifyUrl;

    @NotBlank
    @ApiModelProperty(value = "订单完成后返回的页面")
    private String returnUrl;

    @ApiModelProperty(value = "类型")
    private String format="JSON";

    @NotBlank
    @ApiModelProperty(value = "商户号")
    private String sysServiceProviderId;

    public AlipayConfig() {
    }

    public Long getId() {
        return this.id;
    }

    public @NotBlank String getAppId() {
        return this.appId;
    }

    public @NotBlank String getPrivateKey() {
        return this.privateKey;
    }

    public @NotBlank String getPublicKey() {
        return this.publicKey;
    }

    public String getSignType() {
        return this.signType;
    }

    public String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public String getCharset() {
        return this.charset;
    }

    public @NotBlank String getNotifyUrl() {
        return this.notifyUrl;
    }

    public @NotBlank String getReturnUrl() {
        return this.returnUrl;
    }

    public String getFormat() {
        return this.format;
    }

    public @NotBlank String getSysServiceProviderId() {
        return this.sysServiceProviderId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppId(@NotBlank String appId) {
        this.appId = appId;
    }

    public void setPrivateKey(@NotBlank String privateKey) {
        this.privateKey = privateKey;
    }

    public void setPublicKey(@NotBlank String publicKey) {
        this.publicKey = publicKey;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setNotifyUrl(@NotBlank String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public void setReturnUrl(@NotBlank String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setSysServiceProviderId(@NotBlank String sysServiceProviderId) {
        this.sysServiceProviderId = sysServiceProviderId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AlipayConfig)) return false;
        final AlipayConfig other = (AlipayConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$appId = this.getAppId();
        final Object other$appId = other.getAppId();
        if (this$appId == null ? other$appId != null : !this$appId.equals(other$appId)) return false;
        final Object this$privateKey = this.getPrivateKey();
        final Object other$privateKey = other.getPrivateKey();
        if (this$privateKey == null ? other$privateKey != null : !this$privateKey.equals(other$privateKey))
            return false;
        final Object this$publicKey = this.getPublicKey();
        final Object other$publicKey = other.getPublicKey();
        if (this$publicKey == null ? other$publicKey != null : !this$publicKey.equals(other$publicKey)) return false;
        final Object this$signType = this.getSignType();
        final Object other$signType = other.getSignType();
        if (this$signType == null ? other$signType != null : !this$signType.equals(other$signType)) return false;
        final Object this$gatewayUrl = this.getGatewayUrl();
        final Object other$gatewayUrl = other.getGatewayUrl();
        if (this$gatewayUrl == null ? other$gatewayUrl != null : !this$gatewayUrl.equals(other$gatewayUrl))
            return false;
        final Object this$charset = this.getCharset();
        final Object other$charset = other.getCharset();
        if (this$charset == null ? other$charset != null : !this$charset.equals(other$charset)) return false;
        final Object this$notifyUrl = this.getNotifyUrl();
        final Object other$notifyUrl = other.getNotifyUrl();
        if (this$notifyUrl == null ? other$notifyUrl != null : !this$notifyUrl.equals(other$notifyUrl)) return false;
        final Object this$returnUrl = this.getReturnUrl();
        final Object other$returnUrl = other.getReturnUrl();
        if (this$returnUrl == null ? other$returnUrl != null : !this$returnUrl.equals(other$returnUrl)) return false;
        final Object this$format = this.getFormat();
        final Object other$format = other.getFormat();
        if (this$format == null ? other$format != null : !this$format.equals(other$format)) return false;
        final Object this$sysServiceProviderId = this.getSysServiceProviderId();
        final Object other$sysServiceProviderId = other.getSysServiceProviderId();
        if (this$sysServiceProviderId == null ? other$sysServiceProviderId != null : !this$sysServiceProviderId.equals(other$sysServiceProviderId))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AlipayConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $appId = this.getAppId();
        result = result * PRIME + ($appId == null ? 43 : $appId.hashCode());
        final Object $privateKey = this.getPrivateKey();
        result = result * PRIME + ($privateKey == null ? 43 : $privateKey.hashCode());
        final Object $publicKey = this.getPublicKey();
        result = result * PRIME + ($publicKey == null ? 43 : $publicKey.hashCode());
        final Object $signType = this.getSignType();
        result = result * PRIME + ($signType == null ? 43 : $signType.hashCode());
        final Object $gatewayUrl = this.getGatewayUrl();
        result = result * PRIME + ($gatewayUrl == null ? 43 : $gatewayUrl.hashCode());
        final Object $charset = this.getCharset();
        result = result * PRIME + ($charset == null ? 43 : $charset.hashCode());
        final Object $notifyUrl = this.getNotifyUrl();
        result = result * PRIME + ($notifyUrl == null ? 43 : $notifyUrl.hashCode());
        final Object $returnUrl = this.getReturnUrl();
        result = result * PRIME + ($returnUrl == null ? 43 : $returnUrl.hashCode());
        final Object $format = this.getFormat();
        result = result * PRIME + ($format == null ? 43 : $format.hashCode());
        final Object $sysServiceProviderId = this.getSysServiceProviderId();
        result = result * PRIME + ($sysServiceProviderId == null ? 43 : $sysServiceProviderId.hashCode());
        return result;
    }

    public String toString() {
        return "AlipayConfig(id=" + this.getId() + ", appId=" + this.getAppId() + ", privateKey=" + this.getPrivateKey() + ", publicKey=" + this.getPublicKey() + ", signType=" + this.getSignType() + ", gatewayUrl=" + this.getGatewayUrl() + ", charset=" + this.getCharset() + ", notifyUrl=" + this.getNotifyUrl() + ", returnUrl=" + this.getReturnUrl() + ", format=" + this.getFormat() + ", sysServiceProviderId=" + this.getSysServiceProviderId() + ")";
    }
}
