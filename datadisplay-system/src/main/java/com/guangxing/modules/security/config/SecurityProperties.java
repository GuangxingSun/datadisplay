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
package com.guangxing.modules.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Jwt参数配置
 * @author Guangxing
 * @date 2019年11月28日
 */
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class SecurityProperties {

    /** Request Headers ： Authorization */
    private String header;

    /** 令牌前缀，最后留个空格 Bearer */
    private String tokenStartWith;

    /** 必须使用最少88位的Base64对该令牌进行编码 */
    private String base64Secret;

    /** 令牌过期时间 此处单位/毫秒 */
    private Long tokenValidityInSeconds;

    /** 在线用户 key，根据 key 查询 redis 中在线用户的数据 */
    private String onlineKey;

    /** 验证码 key */
    private String codeKey;

    /** token 续期检查 */
    private Long detect;

    /** 续期时间 */
    private Long renew;

    public SecurityProperties() {
    }

    public String getTokenStartWith() {
        return tokenStartWith + " ";
    }

    public String getHeader() {
        return this.header;
    }

    public String getBase64Secret() {
        return this.base64Secret;
    }

    public Long getTokenValidityInSeconds() {
        return this.tokenValidityInSeconds;
    }

    public String getOnlineKey() {
        return this.onlineKey;
    }

    public String getCodeKey() {
        return this.codeKey;
    }

    public Long getDetect() {
        return this.detect;
    }

    public Long getRenew() {
        return this.renew;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setTokenStartWith(String tokenStartWith) {
        this.tokenStartWith = tokenStartWith;
    }

    public void setBase64Secret(String base64Secret) {
        this.base64Secret = base64Secret;
    }

    public void setTokenValidityInSeconds(Long tokenValidityInSeconds) {
        this.tokenValidityInSeconds = tokenValidityInSeconds;
    }

    public void setOnlineKey(String onlineKey) {
        this.onlineKey = onlineKey;
    }

    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    public void setDetect(Long detect) {
        this.detect = detect;
    }

    public void setRenew(Long renew) {
        this.renew = renew;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SecurityProperties)) return false;
        final SecurityProperties other = (SecurityProperties) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$header = this.getHeader();
        final Object other$header = other.getHeader();
        if (this$header == null ? other$header != null : !this$header.equals(other$header)) return false;
        final Object this$tokenStartWith = this.getTokenStartWith();
        final Object other$tokenStartWith = other.getTokenStartWith();
        if (this$tokenStartWith == null ? other$tokenStartWith != null : !this$tokenStartWith.equals(other$tokenStartWith))
            return false;
        final Object this$base64Secret = this.getBase64Secret();
        final Object other$base64Secret = other.getBase64Secret();
        if (this$base64Secret == null ? other$base64Secret != null : !this$base64Secret.equals(other$base64Secret))
            return false;
        final Object this$tokenValidityInSeconds = this.getTokenValidityInSeconds();
        final Object other$tokenValidityInSeconds = other.getTokenValidityInSeconds();
        if (this$tokenValidityInSeconds == null ? other$tokenValidityInSeconds != null : !this$tokenValidityInSeconds.equals(other$tokenValidityInSeconds))
            return false;
        final Object this$onlineKey = this.getOnlineKey();
        final Object other$onlineKey = other.getOnlineKey();
        if (this$onlineKey == null ? other$onlineKey != null : !this$onlineKey.equals(other$onlineKey)) return false;
        final Object this$codeKey = this.getCodeKey();
        final Object other$codeKey = other.getCodeKey();
        if (this$codeKey == null ? other$codeKey != null : !this$codeKey.equals(other$codeKey)) return false;
        final Object this$detect = this.getDetect();
        final Object other$detect = other.getDetect();
        if (this$detect == null ? other$detect != null : !this$detect.equals(other$detect)) return false;
        final Object this$renew = this.getRenew();
        final Object other$renew = other.getRenew();
        if (this$renew == null ? other$renew != null : !this$renew.equals(other$renew)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SecurityProperties;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $header = this.getHeader();
        result = result * PRIME + ($header == null ? 43 : $header.hashCode());
        final Object $tokenStartWith = this.getTokenStartWith();
        result = result * PRIME + ($tokenStartWith == null ? 43 : $tokenStartWith.hashCode());
        final Object $base64Secret = this.getBase64Secret();
        result = result * PRIME + ($base64Secret == null ? 43 : $base64Secret.hashCode());
        final Object $tokenValidityInSeconds = this.getTokenValidityInSeconds();
        result = result * PRIME + ($tokenValidityInSeconds == null ? 43 : $tokenValidityInSeconds.hashCode());
        final Object $onlineKey = this.getOnlineKey();
        result = result * PRIME + ($onlineKey == null ? 43 : $onlineKey.hashCode());
        final Object $codeKey = this.getCodeKey();
        result = result * PRIME + ($codeKey == null ? 43 : $codeKey.hashCode());
        final Object $detect = this.getDetect();
        result = result * PRIME + ($detect == null ? 43 : $detect.hashCode());
        final Object $renew = this.getRenew();
        result = result * PRIME + ($renew == null ? 43 : $renew.hashCode());
        return result;
    }

    public String toString() {
        return "SecurityProperties(header=" + this.getHeader() + ", tokenStartWith=" + this.getTokenStartWith() + ", base64Secret=" + this.getBase64Secret() + ", tokenValidityInSeconds=" + this.getTokenValidityInSeconds() + ", onlineKey=" + this.getOnlineKey() + ", codeKey=" + this.getCodeKey() + ", detect=" + this.getDetect() + ", renew=" + this.getRenew() + ")";
    }
}
