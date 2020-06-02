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

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
* @author Guangxing
* @date 2019-03-25
*/
@Entity
@Table(name="sys_dept")
public class Dept extends BaseEntity implements Serializable {

    @Id
    @Column(name = "dept_id")
    @NotNull(groups = Update.class)
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "depts")
    @ApiModelProperty(value = "角色")
    private Set<Role> roles;

    @ApiModelProperty(value = "排序")
    private Integer deptSort;

    @NotBlank
    @ApiModelProperty(value = "部门名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;

    @ApiModelProperty(value = "上级部门")
    private Long pid;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dept dept = (Dept) o;
        return Objects.equals(id, dept.id) &&
                Objects.equals(name, dept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public @NotNull(groups = Update.class) Long getId() {
        return this.id;
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public Integer getDeptSort() {
        return this.deptSort;
    }

    public @NotBlank String getName() {
        return this.name;
    }

    public @NotNull Boolean getEnabled() {
        return this.enabled;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setId(@NotNull(groups = Update.class) Long id) {
        this.id = id;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public void setEnabled(@NotNull Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}