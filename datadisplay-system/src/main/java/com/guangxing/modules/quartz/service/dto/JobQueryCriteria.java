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
package com.guangxing.modules.quartz.service.dto;

import com.guangxing.annotation.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Guangxing
 * @date 2019-6-4 10:33:02
 */
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String jobName;

    @Query
    private Boolean isSuccess;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

    public JobQueryCriteria() {
    }

    public String getJobName() {
        return this.jobName;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public List<Timestamp> getCreateTime() {
        return this.createTime;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setCreateTime(List<Timestamp> createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof JobQueryCriteria)) return false;
        final JobQueryCriteria other = (JobQueryCriteria) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$jobName = this.getJobName();
        final Object other$jobName = other.getJobName();
        if (this$jobName == null ? other$jobName != null : !this$jobName.equals(other$jobName)) return false;
        final Object this$isSuccess = this.getIsSuccess();
        final Object other$isSuccess = other.getIsSuccess();
        if (this$isSuccess == null ? other$isSuccess != null : !this$isSuccess.equals(other$isSuccess)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof JobQueryCriteria;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $jobName = this.getJobName();
        result = result * PRIME + ($jobName == null ? 43 : $jobName.hashCode());
        final Object $isSuccess = this.getIsSuccess();
        result = result * PRIME + ($isSuccess == null ? 43 : $isSuccess.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "JobQueryCriteria(jobName=" + this.getJobName() + ", isSuccess=" + this.getIsSuccess() + ", createTime=" + this.getCreateTime() + ")";
    }
}
