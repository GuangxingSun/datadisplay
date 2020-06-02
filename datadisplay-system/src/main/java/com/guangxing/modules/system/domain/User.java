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
package com.guangxing.modules.system.domain;

import io.swagger.annotations.ApiModelProperty;
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 * @author Guangxing
 * @date 2018-11-22
 */
@Entity
@Table(name="sys_user")
public class User extends BaseEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    @NotNull(groups = Update.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @ManyToMany
    @ApiModelProperty(value = "用户角色")
    @JoinTable(name = "sys_users_roles",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "role_id")})
    private Set<Role> roles;

    @ManyToMany
    @ApiModelProperty(value = "用户岗位")
    @JoinTable(name = "sys_users_jobs",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "job_id",referencedColumnName = "job_id")})
    private Set<Job> jobs;

    @OneToOne
    @JoinColumn(name = "dept_id")
    @ApiModelProperty(value = "用户部门")
    private Dept dept;

    @NotBlank
    @Column(unique = true)
    @ApiModelProperty(value = "用户名称")
    private String username;

    @NotBlank
    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @Email
    @NotBlank
    @ApiModelProperty(value = "邮箱")
    private String email;

    @NotBlank
    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "用户性别")
    private String gender;

    @ApiModelProperty(value = "头像真实名称",hidden = true)
    private String avatarName;

    @ApiModelProperty(value = "头像存储的路径", hidden = true)
    private String avatarPath;

    @ApiModelProperty(value = "密码")
    private String password;

    @NotNull
    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;

    @ApiModelProperty(value = "是否为admin账号", hidden = true)
    private Boolean isAdmin = false;

    @Column(name = "pwd_reset_time")
    @ApiModelProperty(value = "最后修改密码的时间", hidden = true)
    private Date pwdResetTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

    public @NotNull(groups = Update.class) Long getId() {
        return this.id;
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public Set<Job> getJobs() {
        return this.jobs;
    }

    public Dept getDept() {
        return this.dept;
    }

    public @NotBlank String getUsername() {
        return this.username;
    }

    public @NotBlank String getNickName() {
        return this.nickName;
    }

    public @Email @NotBlank String getEmail() {
        return this.email;
    }

    public @NotBlank String getPhone() {
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

    public @NotNull Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public Date getPwdResetTime() {
        return this.pwdResetTime;
    }

    public void setId(@NotNull(groups = Update.class) Long id) {
        this.id = id;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setUsername(@NotBlank String username) {
        this.username = username;
    }

    public void setNickName(@NotBlank String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(@Email @NotBlank String email) {
        this.email = email;
    }

    public void setPhone(@NotBlank String phone) {
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

    public void setEnabled(@NotNull Boolean enabled) {
        this.enabled = enabled;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setPwdResetTime(Date pwdResetTime) {
        this.pwdResetTime = pwdResetTime;
    }
}