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
package com.guangxing.modules.quartz.domain;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Guangxing
 * @date 2019-01-07
 */
@Entity
@Table(name = "sys_quartz_log")
public class QuartzLog implements Serializable {

    @Id
    @Column(name = "log_id")
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "任务名称", hidden = true)
    private String jobName;

    @ApiModelProperty(value = "bean名称", hidden = true)
    private String beanName;

    @ApiModelProperty(value = "方法名称", hidden = true)
    private String methodName;

    @ApiModelProperty(value = "参数", hidden = true)
    private String params;

    @ApiModelProperty(value = "cron表达式", hidden = true)
    private String cronExpression;

    @ApiModelProperty(value = "状态", hidden = true)
    private Boolean isSuccess;

    @ApiModelProperty(value = "异常详情", hidden = true)
    private String exceptionDetail;

    @ApiModelProperty(value = "执行耗时", hidden = true)
    private Long time;

    @CreationTimestamp
    @ApiModelProperty(value = "创建时间", hidden = true)
    private Timestamp createTime;

    public QuartzLog() {
    }

    public Long getId() {
        return this.id;
    }

    public String getJobName() {
        return this.jobName;
    }

    public String getBeanName() {
        return this.beanName;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public String getParams() {
        return this.params;
    }

    public String getCronExpression() {
        return this.cronExpression;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public String getExceptionDetail() {
        return this.exceptionDetail;
    }

    public Long getTime() {
        return this.time;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setExceptionDetail(String exceptionDetail) {
        this.exceptionDetail = exceptionDetail;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof QuartzLog)) return false;
        final QuartzLog other = (QuartzLog) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$jobName = this.getJobName();
        final Object other$jobName = other.getJobName();
        if (this$jobName == null ? other$jobName != null : !this$jobName.equals(other$jobName)) return false;
        final Object this$beanName = this.getBeanName();
        final Object other$beanName = other.getBeanName();
        if (this$beanName == null ? other$beanName != null : !this$beanName.equals(other$beanName)) return false;
        final Object this$methodName = this.getMethodName();
        final Object other$methodName = other.getMethodName();
        if (this$methodName == null ? other$methodName != null : !this$methodName.equals(other$methodName))
            return false;
        final Object this$params = this.getParams();
        final Object other$params = other.getParams();
        if (this$params == null ? other$params != null : !this$params.equals(other$params)) return false;
        final Object this$cronExpression = this.getCronExpression();
        final Object other$cronExpression = other.getCronExpression();
        if (this$cronExpression == null ? other$cronExpression != null : !this$cronExpression.equals(other$cronExpression))
            return false;
        final Object this$isSuccess = this.getIsSuccess();
        final Object other$isSuccess = other.getIsSuccess();
        if (this$isSuccess == null ? other$isSuccess != null : !this$isSuccess.equals(other$isSuccess)) return false;
        final Object this$exceptionDetail = this.getExceptionDetail();
        final Object other$exceptionDetail = other.getExceptionDetail();
        if (this$exceptionDetail == null ? other$exceptionDetail != null : !this$exceptionDetail.equals(other$exceptionDetail))
            return false;
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof QuartzLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $jobName = this.getJobName();
        result = result * PRIME + ($jobName == null ? 43 : $jobName.hashCode());
        final Object $beanName = this.getBeanName();
        result = result * PRIME + ($beanName == null ? 43 : $beanName.hashCode());
        final Object $methodName = this.getMethodName();
        result = result * PRIME + ($methodName == null ? 43 : $methodName.hashCode());
        final Object $params = this.getParams();
        result = result * PRIME + ($params == null ? 43 : $params.hashCode());
        final Object $cronExpression = this.getCronExpression();
        result = result * PRIME + ($cronExpression == null ? 43 : $cronExpression.hashCode());
        final Object $isSuccess = this.getIsSuccess();
        result = result * PRIME + ($isSuccess == null ? 43 : $isSuccess.hashCode());
        final Object $exceptionDetail = this.getExceptionDetail();
        result = result * PRIME + ($exceptionDetail == null ? 43 : $exceptionDetail.hashCode());
        final Object $time = this.getTime();
        result = result * PRIME + ($time == null ? 43 : $time.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        return result;
    }

    public String toString() {
        return "QuartzLog(id=" + this.getId() + ", jobName=" + this.getJobName() + ", beanName=" + this.getBeanName() + ", methodName=" + this.getMethodName() + ", params=" + this.getParams() + ", cronExpression=" + this.getCronExpression() + ", isSuccess=" + this.getIsSuccess() + ", exceptionDetail=" + this.getExceptionDetail() + ", time=" + this.getTime() + ", createTime=" + this.getCreateTime() + ")";
    }
}
