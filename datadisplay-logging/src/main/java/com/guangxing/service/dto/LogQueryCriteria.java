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

import com.guangxing.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * 日志查询类
 * @author Guangxing
 * @date 2019-6-4 09:23:07
 */
public class LogQueryCriteria {

    @Query(blurry = "username,description,address,requestIp,method,params")
    private String blurry;

    @Query
    private String logType;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    public LogQueryCriteria() {
    }

    public String getBlurry() {
        return this.blurry;
    }

    public String getLogType() {
        return this.logType;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setBlurry(String blurry) {
        this.blurry = blurry;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LogQueryCriteria)) return false;
        final LogQueryCriteria other = (LogQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$blurry = this.getBlurry();
        final Object other$blurry = other.getBlurry();
        if (this$blurry == null ? other$blurry != null : !this$blurry.equals(other$blurry)) return false;
        final Object this$logType = this.getLogType();
        final Object other$logType = other.getLogType();
        if (this$logType == null ? other$logType != null : !this$logType.equals(other$logType)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LogQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $blurry = this.getBlurry();
        result = result * PRIME + ($blurry == null ? 43 : $blurry.hashCode());
        final Object $logType = this.getLogType();
        result = result * PRIME + ($logType == null ? 43 : $logType.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "LogQueryCriteria(blurry=" + this.getBlurry() + ", logType=" + this.getLogType() + ", createTime=" + this.getCreateTime() + ")";
    }
}
