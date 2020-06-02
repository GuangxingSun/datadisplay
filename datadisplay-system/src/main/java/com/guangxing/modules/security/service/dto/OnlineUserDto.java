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
package com.guangxing.modules.security.service.dto;

import java.util.Date;

/**
 * 在线用户
 * @author Guangxing
 */
public class OnlineUserDto {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 岗位
     */
    private String dept;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * IP
     */
    private String ip;

    /**
     * 地址
     */
    private String address;

    /**
     * token
     */
    private String key;

    /**
     * 登录时间
     */
    private Date loginTime;


    public OnlineUserDto(String userName, String nickName, String dept, String browser, String ip, String address, String key, Date loginTime) {
        this.userName = userName;
        this.nickName = nickName;
        this.dept = dept;
        this.browser = browser;
        this.ip = ip;
        this.address = address;
        this.key = key;
        this.loginTime = loginTime;
    }

    public OnlineUserDto() {
    }

    public String getUserName() {
        return this.userName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getDept() {
        return this.dept;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getIp() {
        return this.ip;
    }

    public String getAddress() {
        return this.address;
    }

    public String getKey() {
        return this.key;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OnlineUserDto)) return false;
        final OnlineUserDto other = (OnlineUserDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userName = this.getUserName();
        final Object other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) return false;
        final Object this$nickName = this.getNickName();
        final Object other$nickName = other.getNickName();
        if (this$nickName == null ? other$nickName != null : !this$nickName.equals(other$nickName)) return false;
        final Object this$dept = this.getDept();
        final Object other$dept = other.getDept();
        if (this$dept == null ? other$dept != null : !this$dept.equals(other$dept)) return false;
        final Object this$browser = this.getBrowser();
        final Object other$browser = other.getBrowser();
        if (this$browser == null ? other$browser != null : !this$browser.equals(other$browser)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$key = this.getKey();
        final Object other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false;
        final Object this$loginTime = this.getLoginTime();
        final Object other$loginTime = other.getLoginTime();
        if (this$loginTime == null ? other$loginTime != null : !this$loginTime.equals(other$loginTime)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OnlineUserDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userName = this.getUserName();
        result = result * PRIME + ($userName == null ? 43 : $userName.hashCode());
        final Object $nickName = this.getNickName();
        result = result * PRIME + ($nickName == null ? 43 : $nickName.hashCode());
        final Object $dept = this.getDept();
        result = result * PRIME + ($dept == null ? 43 : $dept.hashCode());
        final Object $browser = this.getBrowser();
        result = result * PRIME + ($browser == null ? 43 : $browser.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $key = this.getKey();
        result = result * PRIME + ($key == null ? 43 : $key.hashCode());
        final Object $loginTime = this.getLoginTime();
        result = result * PRIME + ($loginTime == null ? 43 : $loginTime.hashCode());
        return result;
    }

    public String toString() {
        return "OnlineUserDto(userName=" + this.getUserName() + ", nickName=" + this.getNickName() + ", dept=" + this.getDept() + ", browser=" + this.getBrowser() + ", ip=" + this.getIp() + ", address=" + this.getAddress() + ", key=" + this.getKey() + ", loginTime=" + this.getLoginTime() + ")";
    }
}
