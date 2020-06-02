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
* @date 2019-04-10
*/
public class DictDetailDto extends BaseDTO implements Serializable {

    private Long id;

    private DictSmallDto dict;

    private String label;

    private String value;

    private Integer dictSort;

    public Long getId() {
        return this.id;
    }

    public DictSmallDto getDict() {
        return this.dict;
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getDictSort() {
        return this.dictSort;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDict(DictSmallDto dict) {
        this.dict = dict;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }
}