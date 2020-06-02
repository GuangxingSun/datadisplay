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

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Guangxing
 * 公共查询类
 */
public class MenuQueryCriteria {

    @Query(blurry = "title,component,permission")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    @Query(type = Query.Type.IS_NULL, propName = "pid")
    private Boolean pidIsNull;

    @Query
    private Long pid;

    public MenuQueryCriteria() {
    }

    public String getBlurry() {
        return this.blurry;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public Boolean getPidIsNull() {
        return this.pidIsNull;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setBlurry(String blurry) {
        this.blurry = blurry;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public void setPidIsNull(Boolean pidIsNull) {
        this.pidIsNull = pidIsNull;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenuQueryCriteria)) return false;
        final MenuQueryCriteria other = (MenuQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$blurry = this.getBlurry();
        final Object other$blurry = other.getBlurry();
        if (this$blurry == null ? other$blurry != null : !this$blurry.equals(other$blurry)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$pidIsNull = this.getPidIsNull();
        final Object other$pidIsNull = other.getPidIsNull();
        if (this$pidIsNull == null ? other$pidIsNull != null : !this$pidIsNull.equals(other$pidIsNull)) return false;
        final Object this$pid = this.getPid();
        final Object other$pid = other.getPid();
        if (this$pid == null ? other$pid != null : !this$pid.equals(other$pid)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $blurry = this.getBlurry();
        result = result * PRIME + ($blurry == null ? 43 : $blurry.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $pidIsNull = this.getPidIsNull();
        result = result * PRIME + ($pidIsNull == null ? 43 : $pidIsNull.hashCode());
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        return result;
    }

    public String toString() {
        return "MenuQueryCriteria(blurry=" + this.getBlurry() + ", createTime=" + this.getCreateTime() + ", pidIsNull=" + this.getPidIsNull() + ", pid=" + this.getPid() + ")";
    }
}
