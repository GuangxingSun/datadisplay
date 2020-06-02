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

import com.guangxing.annotation.DataPermission;
import com.guangxing.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
* @author Guangxing
* @date 2019-03-25
*/
@DataPermission(fieldName = "id")
public class DeptQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String name;

    @Query
    private Boolean enabled;

    @Query
    private Long pid;

    @Query(type = Query.Type.IS_NULL, propName = "pid")
    private Boolean pidIsNull;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    public DeptQueryCriteria() {
    }

    public String getName() {
        return this.name;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Long getPid() {
        return this.pid;
    }

    public Boolean getPidIsNull() {
        return this.pidIsNull;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setPidIsNull(Boolean pidIsNull) {
        this.pidIsNull = pidIsNull;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DeptQueryCriteria)) return false;
        final DeptQueryCriteria other = (DeptQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$enabled = this.getEnabled();
        final Object other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !this$enabled.equals(other$enabled)) return false;
        final Object this$pid = this.getPid();
        final Object other$pid = other.getPid();
        if (this$pid == null ? other$pid != null : !this$pid.equals(other$pid)) return false;
        final Object this$pidIsNull = this.getPidIsNull();
        final Object other$pidIsNull = other.getPidIsNull();
        if (this$pidIsNull == null ? other$pidIsNull != null : !this$pidIsNull.equals(other$pidIsNull)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DeptQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $enabled = this.getEnabled();
        result = result * PRIME + ($enabled == null ? 43 : $enabled.hashCode());
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        final Object $pidIsNull = this.getPidIsNull();
        result = result * PRIME + ($pidIsNull == null ? 43 : $pidIsNull.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "DeptQueryCriteria(name=" + this.getName() + ", enabled=" + this.getEnabled() + ", pid=" + this.getPid() + ", pidIsNull=" + this.getPidIsNull() + ", createTime=" + this.getCreateTime() + ")";
    }
}