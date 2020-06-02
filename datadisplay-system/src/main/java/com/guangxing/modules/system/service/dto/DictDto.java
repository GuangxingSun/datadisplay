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
import java.util.List;

/**
* @author Guangxing
* @date 2019-04-10
*/
public class DictDto extends BaseDTO implements Serializable {

    private Long id;

    private List<DictDetailDto> dictDetails;

    private String name;

    private String description;

    public Long getId() {
        return this.id;
    }

    public List<DictDetailDto> getDictDetails() {
        return this.dictDetails;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDictDetails(List<DictDetailDto> dictDetails) {
        this.dictDetails = dictDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
