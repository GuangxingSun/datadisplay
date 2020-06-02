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
package com.guangxing.modules.system.service.dto;

import com.guangxing.annotation.Query;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Guangxing
 * @date 2018-11-23
 */
public class UserQueryCriteria implements Serializable {

    @Query
    private Long id;

    @Query(propName = "id", type = Query.Type.IN, joinName = "dept")
    private Set<Long> deptIds = new HashSet<>();

    @Query(blurry = "email,username,nickName")
    private String blurry;

    @Query
    private Boolean enabled;

    private Long deptId;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    public UserQueryCriteria() {
    }

    public Long getId() {
        return this.id;
    }

    public Set<Long> getDeptIds() {
        return this.deptIds;
    }

    public String getBlurry() {
        return this.blurry;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDeptIds(Set<Long> deptIds) {
        this.deptIds = deptIds;
    }

    public void setBlurry(String blurry) {
        this.blurry = blurry;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserQueryCriteria)) return false;
        final UserQueryCriteria other = (UserQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$deptIds = this.getDeptIds();
        final Object other$deptIds = other.getDeptIds();
        if (this$deptIds == null ? other$deptIds != null : !this$deptIds.equals(other$deptIds)) return false;
        final Object this$blurry = this.getBlurry();
        final Object other$blurry = other.getBlurry();
        if (this$blurry == null ? other$blurry != null : !this$blurry.equals(other$blurry)) return false;
        final Object this$enabled = this.getEnabled();
        final Object other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !this$enabled.equals(other$enabled)) return false;
        final Object this$deptId = this.getDeptId();
        final Object other$deptId = other.getDeptId();
        if (this$deptId == null ? other$deptId != null : !this$deptId.equals(other$deptId)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $deptIds = this.getDeptIds();
        result = result * PRIME + ($deptIds == null ? 43 : $deptIds.hashCode());
        final Object $blurry = this.getBlurry();
        result = result * PRIME + ($blurry == null ? 43 : $blurry.hashCode());
        final Object $enabled = this.getEnabled();
        result = result * PRIME + ($enabled == null ? 43 : $enabled.hashCode());
        final Object $deptId = this.getDeptId();
        result = result * PRIME + ($deptId == null ? 43 : $deptId.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "UserQueryCriteria(id=" + this.getId() + ", deptIds=" + this.getDeptIds() + ", blurry=" + this.getBlurry() + ", enabled=" + this.getEnabled() + ", deptId=" + this.getDeptId() + ", createTime=" + this.getCreateTime() + ")";
    }
}
