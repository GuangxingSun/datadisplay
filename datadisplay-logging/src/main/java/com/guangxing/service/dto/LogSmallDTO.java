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
public class LogSmallDTO implements Serializable {

    private String description;

    private String requestIp;

    private Long time;

    private String address;

    private String browser;

    private Timestamp createTime;

    public LogSmallDTO() {
    }

    public String getDescription() {
        return this.description;
    }

    public String getRequestIp() {
        return this.requestIp;
    }

    public Long getTime() {
        return this.time;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBrowser() {
        return this.browser;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LogSmallDTO)) return false;
        final LogSmallDTO other = (LogSmallDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$requestIp = this.getRequestIp();
        final Object other$requestIp = other.getRequestIp();
        if (this$requestIp == null ? other$requestIp != null : !this$requestIp.equals(other$requestIp)) return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$browser = this.getBrowser();
        final Object other$browser = other.getBrowser();
        if (this$browser == null ? other$browser != null : !this$browser.equals(other$browser)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LogSmallDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $requestIp = this.getRequestIp();
        result = result * PRIME + ($requestIp == null ? 43 : $requestIp.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $browser = this.getBrowser();
        result = result * PRIME + ($browser == null ? 43 : $browser.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "LogSmallDTO(description=" + this.getDescription() + ", requestIp=" + this.getRequestIp() + ", time=" + this.getTime() + ", address=" + this.getAddress() + ", browser=" + this.getBrowser() + ", createTime=" + this.getCreateTime() + ")";
    }
}
