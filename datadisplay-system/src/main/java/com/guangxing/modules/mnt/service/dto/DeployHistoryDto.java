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
package com.guangxing.modules.mnt.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
* @author guangxing
* @date 2019-08-24
*/
public class DeployHistoryDto implements Serializable {

	/**
	 * 编号
	 */
    private String id;

	/**
	 * 应用名称
	 */
    private String appName;

	/**
	 * 部署IP
	 */
    private String ip;

	/**
	 * 部署时间
	 */
	private Timestamp deployDate;

	/**
	 * 部署人员
	 */
	private String deployUser;

	/**
	 * 部署编号
	 */
	private Long deployId;

    public DeployHistoryDto() {
    }

    public String getId() {
        return this.id;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getIp() {
        return this.ip;
    }

    public Timestamp getDeployDate() {
        return this.deployDate;
    }

    public String getDeployUser() {
        return this.deployUser;
    }

    public Long getDeployId() {
        return this.deployId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setDeployDate(Timestamp deployDate) {
        this.deployDate = deployDate;
    }

    public void setDeployUser(String deployUser) {
        this.deployUser = deployUser;
    }

    public void setDeployId(Long deployId) {
        this.deployId = deployId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeployHistoryDto)) return false;
        final DeployHistoryDto other = (DeployHistoryDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$appName = this.getAppName();
        final Object other$appName = other.getAppName();
        if (this$appName == null ? other$appName != null : !this$appName.equals(other$appName)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$deployDate = this.getDeployDate();
        final Object other$deployDate = other.getDeployDate();
        if (this$deployDate == null ? other$deployDate != null : !this$deployDate.equals(other$deployDate))
            return false;
        final Object this$deployUser = this.getDeployUser();
        final Object other$deployUser = other.getDeployUser();
        if (this$deployUser == null ? other$deployUser != null : !this$deployUser.equals(other$deployUser))
            return false;
        final Object this$deployId = this.getDeployId();
        final Object other$deployId = other.getDeployId();
        if (this$deployId == null ? other$deployId != null : !this$deployId.equals(other$deployId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeployHistoryDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $appName = this.getAppName();
        result = result * PRIME + ($appName == null ? 43 : $appName.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $deployDate = this.getDeployDate();
        result = result * PRIME + ($deployDate == null ? 43 : $deployDate.hashCode());
        final Object $deployUser = this.getDeployUser();
        result = result * PRIME + ($deployUser == null ? 43 : $deployUser.hashCode());
        final Object $deployId = this.getDeployId();
        result = result * PRIME + ($deployId == null ? 43 : $deployId.hashCode());
        return result;
    }

    public String toString() {
        return "DeployHistoryDto(id=" + this.getId() + ", appName=" + this.getAppName() + ", ip=" + this.getIp() + ", deployDate=" + this.getDeployDate() + ", deployUser=" + this.getDeployUser() + ", deployId=" + this.getDeployId() + ")";
    }
}
