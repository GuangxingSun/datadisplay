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
 * 邮件配置类，数据存覆盖式存入数据存
 * @author Guangxing
 * @date 2018-12-26
 */
@Entity
@Table(name = "tool_email_config")
public class EmailConfig implements Serializable {

    @Id
    @Column(name = "config_id")
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @NotBlank
    @ApiModelProperty(value = "邮件服务器SMTP地址")
    private String host;

    @NotBlank
    @ApiModelProperty(value = "邮件服务器 SMTP 端口")
    private String port;

    @NotBlank
    @ApiModelProperty(value = "发件者用户名")
    private String user;

    @NotBlank
    @ApiModelProperty(value = "密码")
    private String pass;

    @NotBlank
    @ApiModelProperty(value = "收件人")
    private String fromUser;

    public EmailConfig() {
    }

    public Long getId() {
        return this.id;
    }

    public @NotBlank String getHost() {
        return this.host;
    }

    public @NotBlank String getPort() {
        return this.port;
    }

    public @NotBlank String getUser() {
        return this.user;
    }

    public @NotBlank String getPass() {
        return this.pass;
    }

    public @NotBlank String getFromUser() {
        return this.fromUser;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHost(@NotBlank String host) {
        this.host = host;
    }

    public void setPort(@NotBlank String port) {
        this.port = port;
    }

    public void setUser(@NotBlank String user) {
        this.user = user;
    }

    public void setPass(@NotBlank String pass) {
        this.pass = pass;
    }

    public void setFromUser(@NotBlank String fromUser) {
        this.fromUser = fromUser;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EmailConfig)) return false;
        final EmailConfig other = (EmailConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$host = this.getHost();
        final Object other$host = other.getHost();
        if (this$host == null ? other$host != null : !this$host.equals(other$host)) return false;
        final Object this$port = this.getPort();
        final Object other$port = other.getPort();
        if (this$port == null ? other$port != null : !this$port.equals(other$port)) return false;
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        final Object this$pass = this.getPass();
        final Object other$pass = other.getPass();
        if (this$pass == null ? other$pass != null : !this$pass.equals(other$pass)) return false;
        final Object this$fromUser = this.getFromUser();
        final Object other$fromUser = other.getFromUser();
        if (this$fromUser == null ? other$fromUser != null : !this$fromUser.equals(other$fromUser)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EmailConfig;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $host = this.getHost();
        result = result * PRIME + ($host == null ? 43 : $host.hashCode());
        final Object $port = this.getPort();
        result = result * PRIME + ($port == null ? 43 : $port.hashCode());
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        final Object $pass = this.getPass();
        result = result * PRIME + ($pass == null ? 43 : $pass.hashCode());
        final Object $fromUser = this.getFromUser();
        result = result * PRIME + ($fromUser == null ? 43 : $fromUser.hashCode());
        return result;
    }

    public String toString() {
        return "EmailConfig(id=" + this.getId() + ", host=" + this.getHost() + ", port=" + this.getPort() + ", user=" + this.getUser() + ", pass=" + this.getPass() + ", fromUser=" + this.getFromUser() + ")";
    }
}
