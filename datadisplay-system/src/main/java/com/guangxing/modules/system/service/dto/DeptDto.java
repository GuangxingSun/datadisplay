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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.guangxing.base.BaseDTO;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
* @author Guangxing
* @date 2019-03-25
*/
public class DeptDto extends BaseDTO implements Serializable {

    private Long id;

    private String name;

    private Boolean enabled;

    private Integer deptSort;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptDto> children;

    private Long pid;

    private Boolean hasChildren = false;

    private Boolean leaf = true;

    public String getLabel() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeptDto deptDto = (DeptDto) o;
        return Objects.equals(id, deptDto.id) &&
                Objects.equals(name, deptDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Integer getDeptSort() {
        return this.deptSort;
    }

    public List<DeptDto> getChildren() {
        return this.children;
    }

    public Long getPid() {
        return this.pid;
    }

    public Boolean getHasChildren() {
        return this.hasChildren;
    }

    public Boolean getLeaf() {
        return this.leaf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setDeptSort(Integer deptSort) {
        this.deptSort = deptSort;
    }

    public void setChildren(List<DeptDto> children) {
        this.children = children;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}