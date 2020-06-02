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
package com.guangxing.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
* @author Guangxing
* @date 2019-5-22
*/
public class LogErrorDTO implements Serializable {

    private Long id;

    private String username;

    private String description;

    private String method;

    private String params;

    private String browser;

    private String requestIp;

    private String address;

    private Timestamp createTime;

    public LogErrorDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMethod() {
        return this.method;
    }

    public String getParams() {
        return this.params;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getRequestIp() {
        return this.requestIp;
    }

    public String getAddress() {
        return this.address;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LogErrorDTO)) return false;
        final LogErrorDTO other = (LogErrorDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$method = this.getMethod();
        final Object other$method = other.getMethod();
        if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
        final Object this$params = this.getParams();
        final Object other$params = other.getParams();
        if (this$params == null ? other$params != null : !this$params.equals(other$params)) return false;
        final Object this$browser = this.getBrowser();
        final Object other$browser = other.getBrowser();
        if (this$browser == null ? other$browser != null : !this$browser.equals(other$browser)) return false;
        final Object this$requestIp = this.getRequestIp();
        final Object other$requestIp = other.getRequestIp();
        if (this$requestIp == null ? other$requestIp != null : !this$requestIp.equals(other$requestIp)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LogErrorDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $method = this.getMethod();
        result = result * PRIME + ($method == null ? 43 : $method.hashCode());
        final Object $params = this.getParams();
        result = result * PRIME + ($params == null ? 43 : $params.hashCode());
        final Object $browser = this.getBrowser();
        result = result * PRIME + ($browser == null ? 43 : $browser.hashCode());
        final Object $requestIp = this.getRequestIp();
        result = result * PRIME + ($requestIp == null ? 43 : $requestIp.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "LogErrorDTO(id=" + this.getId() + ", username=" + this.getUsername() + ", description=" + this.getDescription() + ", method=" + this.getMethod() + ", params=" + this.getParams() + ", browser=" + this.getBrowser() + ", requestIp=" + this.getRequestIp() + ", address=" + this.getAddress() + ", createTime=" + this.getCreateTime() + ")";
    }
}