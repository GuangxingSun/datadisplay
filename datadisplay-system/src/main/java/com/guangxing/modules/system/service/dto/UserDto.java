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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guangxing.base.BaseDTO;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author Guangxing
 * @date 2018-11-23
 */
public class UserDto extends BaseDTO implements Serializable {

    private Long id;

    private Set<RoleSmallDto> roles;

    private Set<JobSmallDto> jobs;

    private DeptSmallDto dept;

    private Long deptId;

    private String username;

    private String nickName;

    private String email;

    private String phone;

    private String gender;

    private String avatarName;

    private String avatarPath;

    @JsonIgnore
    private String password;

    private Boolean enabled;

    @JsonIgnore
    private Boolean isAdmin = false;

    private Date pwdResetTime;

    public Long getId() {
        return this.id;
    }

    public Set<RoleSmallDto> getRoles() {
        return this.roles;
    }

    public Set<JobSmallDto> getJobs() {
        return this.jobs;
    }

    public DeptSmallDto getDept() {
        return this.dept;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getGender() {
        return this.gender;
    }

    public String getAvatarName() {
        return this.avatarName;
    }

    public String getAvatarPath() {
        return this.avatarPath;
    }

    public String getPassword() {
        return this.password;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public Date getPwdResetTime() {
        return this.pwdResetTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoles(Set<RoleSmallDto> roles) {
        this.roles = roles;
    }

    public void setJobs(Set<JobSmallDto> jobs) {
        this.jobs = jobs;
    }

    public void setDept(DeptSmallDto dept) {
        this.dept = dept;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setPwdResetTime(Date pwdResetTime) {
        this.pwdResetTime = pwdResetTime;
    }
}
