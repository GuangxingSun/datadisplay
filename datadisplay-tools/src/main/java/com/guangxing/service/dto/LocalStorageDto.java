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
package com.guangxing.service.dto;

import com.guangxing.base.BaseDTO;

import java.io.Serializable;

/**
* @author Guangxing
* @date 2019-09-05
*/
public class LocalStorageDto extends BaseDTO implements Serializable {

    private Long id;

    private String realName;

    private String name;

    private String suffix;

    private String type;

    private String size;

    public Long getId() {
        return this.id;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getName() {
        return this.name;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public String getType() {
        return this.type;
    }

    public String getSize() {
        return this.size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }
}