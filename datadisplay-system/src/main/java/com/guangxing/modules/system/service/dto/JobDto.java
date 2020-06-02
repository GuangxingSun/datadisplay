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

/**
* @author Guangxing
* @date 2019-03-29
*/
public class JobDto extends BaseDTO implements Serializable {

    private Long id;

    private Integer jobSort;

    private String name;

    private Boolean enabled;

    public JobDto(String name, Boolean enabled) {
        this.name = name;
        this.enabled = enabled;
    }

    public JobDto() {
    }

    public Long getId() {
        return this.id;
    }

    public Integer getJobSort() {
        return this.jobSort;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJobSort(Integer jobSort) {
        this.jobSort = jobSort;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}