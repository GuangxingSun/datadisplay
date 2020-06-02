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
package com.guangxing.modules.mnt.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import io.swagger.annotations.ApiModelProperty;
import com.guangxing.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
* @author zhanghouying
* @date 2019-08-24
*/
@Entity
@Table(name="mnt_deploy")
public class Deploy extends BaseEntity implements Serializable {

    @Id
	@Column(name = "deploy_id")
	@ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@ManyToMany
	@ApiModelProperty(name = "服务器", hidden = true)
	@JoinTable(name = "mnt_deploy_server",
			joinColumns = {@JoinColumn(name = "deploy_id",referencedColumnName = "deploy_id")},
			inverseJoinColumns = {@JoinColumn(name = "server_id",referencedColumnName = "server_id")})
	private Set<ServerDeploy> deploys;

	@ManyToOne
    @JoinColumn(name = "app_id")
	@ApiModelProperty(value = "应用编号")
    private App app;

    public void copy(Deploy source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }

    public Long getId() {
        return this.id;
    }

    public Set<ServerDeploy> getDeploys() {
        return this.deploys;
    }

    public App getApp() {
        return this.app;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDeploys(Set<ServerDeploy> deploys) {
        this.deploys = deploys;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
