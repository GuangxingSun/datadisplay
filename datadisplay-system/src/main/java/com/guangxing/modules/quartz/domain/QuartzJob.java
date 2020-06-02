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
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Guangxing
 * @date 2019-01-07
 */
@Entity
@Table(name = "sys_quartz_job")
public class QuartzJob extends BaseEntity implements Serializable {

    public static final String JOB_KEY = "JOB_KEY";

    @Id
    @Column(name = "job_id")
    @NotNull(groups = {Update.class})
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "定时器名称")
    private String jobName;

    @NotBlank
    @ApiModelProperty(value = "Bean名称")
    private String beanName;

    @NotBlank
    @ApiModelProperty(value = "方法名称")
    private String methodName;

    @ApiModelProperty(value = "参数")
    private String params;

    @NotBlank
    @ApiModelProperty(value = "cron表达式")
    private String cronExpression;

    @ApiModelProperty(value = "状态，暂时或启动")
    private Boolean isPause = false;

    @ApiModelProperty(value = "负责人")
    private String personInCharge;

    @ApiModelProperty(value = "报警邮箱")
    private String email;

    @ApiModelProperty(value = "子任务")
    private String subTask;

    @ApiModelProperty(value = "失败后暂停")
    private Boolean pauseAfterFailure;

    @NotBlank
    @ApiModelProperty(value = "备注")
    private String description;

    public @NotNull(groups = {Update.class}) Long getId() {
        return this.id;
    }

    public String getJobName() {
        return this.jobName;
    }

    public @NotBlank String getBeanName() {
        return this.beanName;
    }

    public @NotBlank String getMethodName() {
        return this.methodName;
    }

    public String getParams() {
        return this.params;
    }

    public @NotBlank String getCronExpression() {
        return this.cronExpression;
    }

    public Boolean getIsPause() {
        return this.isPause;
    }

    public String getPersonInCharge() {
        return this.personInCharge;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSubTask() {
        return this.subTask;
    }

    public Boolean getPauseAfterFailure() {
        return this.pauseAfterFailure;
    }

    public @NotBlank String getDescription() {
        return this.description;
    }

    public void setId(@NotNull(groups = {Update.class}) Long id) {
        this.id = id;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setBeanName(@NotBlank String beanName) {
        this.beanName = beanName;
    }

    public void setMethodName(@NotBlank String methodName) {
        this.methodName = methodName;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setCronExpression(@NotBlank String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public void setIsPause(Boolean isPause) {
        this.isPause = isPause;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubTask(String subTask) {
        this.subTask = subTask;
    }

    public void setPauseAfterFailure(Boolean pauseAfterFailure) {
        this.pauseAfterFailure = pauseAfterFailure;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }
}