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

import com.guangxing.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
* @author guangxing
* @date 2019-08-24
*/
public class DeployHistoryQueryCriteria{

	/**
	 * 精确
	 */
	@Query(blurry = "appName,ip,deployUser")
	private String blurry;

	@Query
	private Long deployId;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> deployDate;

    public DeployHistoryQueryCriteria() {
    }

    public String getBlurry() {
        return this.blurry;
    }

    public Long getDeployId() {
        return this.deployId;
    }

    public List<Timestamp> getDeployDate() {
        return this.deployDate;
    }

    public void setBlurry(String blurry) {
        this.blurry = blurry;
    }

    public void setDeployId(Long deployId) {
        this.deployId = deployId;
    }

    public void setDeployDate(List<Timestamp> deployDate) {
        this.deployDate = deployDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeployHistoryQueryCriteria)) return false;
        final DeployHistoryQueryCriteria other = (DeployHistoryQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$blurry = this.getBlurry();
        final Object other$blurry = other.getBlurry();
        if (this$blurry == null ? other$blurry != null : !this$blurry.equals(other$blurry)) return false;
        final Object this$deployId = this.getDeployId();
        final Object other$deployId = other.getDeployId();
        if (this$deployId == null ? other$deployId != null : !this$deployId.equals(other$deployId)) return false;
        final Object this$deployDate = this.getDeployDate();
        final Object other$deployDate = other.getDeployDate();
        if (this$deployDate == null ? other$deployDate != null : !this$deployDate.equals(other$deployDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeployHistoryQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $blurry = this.getBlurry();
        result = result * PRIME + ($blurry == null ? 43 : $blurry.hashCode());
        final Object $deployId = this.getDeployId();
        result = result * PRIME + ($deployId == null ? 43 : $deployId.hashCode());
        final Object $deployDate = this.getDeployDate();
        result = result * PRIME + ($deployDate == null ? 43 : $deployDate.hashCode());
        return result;
    }

    public String toString() {
        return "DeployHistoryQueryCriteria(blurry=" + this.getBlurry() + ", deployId=" + this.getDeployId() + ", deployDate=" + this.getDeployDate() + ")";
    }
}
