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
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author Guangxing
* @date 2019-04-10
*/
@Entity
@Table(name="sys_dict_detail")
public class DictDetail extends BaseEntity implements Serializable {

    @Id
    @Column(name = "detail_id")
    @NotNull(groups = Update.class)
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "dict_id")
    @ManyToOne(fetch=FetchType.LAZY)
    @ApiModelProperty(value = "字典", hidden = true)
    private Dict dict;

    @ApiModelProperty(value = "字典标签")
    private String label;

    @ApiModelProperty(value = "字典值")
    private String value;

    @ApiModelProperty(value = "排序")
    private Integer dictSort = 999;

    public @NotNull(groups = Update.class) Long getId() {
        return this.id;
    }

    public Dict getDict() {
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

    public void setId(@NotNull(groups = Update.class) Long id) {
        this.id = id;
    }

    public void setDict(Dict dict) {
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