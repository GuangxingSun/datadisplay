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

import com.guangxing.base.BaseDTO;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * @author Guangxing
 * @date 2018-11-23
 */
public class RoleDto extends BaseDTO implements Serializable {

    private Long id;

    private Set<MenuDto> menus;

    private Set<DeptDto> depts;

    private String name;

    private String dataScope;

    private Integer level;

    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleDto roleDto = (RoleDto) o;
        return Objects.equals(id, roleDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return this.id;
    }

    public Set<MenuDto> getMenus() {
        return this.menus;
    }

    public Set<DeptDto> getDepts() {
        return this.depts;
    }

    public String getName() {
        return this.name;
    }

    public String getDataScope() {
        return this.dataScope;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMenus(Set<MenuDto> menus) {
        this.menus = menus;
    }

    public void setDepts(Set<DeptDto> depts) {
        this.depts = depts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
