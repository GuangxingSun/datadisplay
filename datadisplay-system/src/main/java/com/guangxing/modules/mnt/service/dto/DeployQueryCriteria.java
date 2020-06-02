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
* @author zhanghouying
* @date 2019-08-24
*/
public class DeployQueryCriteria{

	/**
	 * 模糊
	 */
    @Query(type = Query.Type.INNER_LIKE, propName = "name", joinName = "app")
    private String appName;

	@Query(type = Query.Type.BETWEEN)
	private List<Timestamp> createTime;

    public DeployQueryCriteria() {
    }

    public String getAppName() {
        return this.appName;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeployQueryCriteria)) return false;
        final DeployQueryCriteria other = (DeployQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$appName = this.getAppName();
        final Object other$appName = other.getAppName();
        if (this$appName == null ? other$appName != null : !this$appName.equals(other$appName)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeployQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $appName = this.getAppName();
        result = result * PRIME + ($appName == null ? 43 : $appName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "DeployQueryCriteria(appName=" + this.getAppName() + ", createTime=" + this.getCreateTime() + ")";
    }
}
