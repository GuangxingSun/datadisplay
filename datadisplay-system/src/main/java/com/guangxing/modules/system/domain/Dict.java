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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
* @author Guangxing
* @date 2019-04-10
*/
@Entity
@Table(name="sys_dict")
public class Dict extends BaseEntity implements Serializable {

    @Id
    @Column(name = "dict_id")
    @NotNull(groups = Update.class)
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "dict",cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private List<DictDetail> dictDetails;

    @NotBlank
    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    public @NotNull(groups = Update.class) Long getId() {
        return this.id;
    }

    public List<DictDetail> getDictDetails() {
        return this.dictDetails;
    }

    public @NotBlank String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(@NotNull(groups = Update.class) Long id) {
        this.id = id;
    }

    public void setDictDetails(List<DictDetail> dictDetails) {
        this.dictDetails = dictDetails;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}