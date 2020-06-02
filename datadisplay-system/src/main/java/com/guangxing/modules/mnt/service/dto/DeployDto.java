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
package com.guangxing.modules.mnt.service.dto;

import cn.hutool.core.collection.CollectionUtil;
import com.guangxing.base.BaseDTO;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


/**
* @author zhanghouying
* @date 2019-08-24
*/
public class DeployDto extends BaseDTO implements Serializable {

	/**
	 * 部署编号
	 */
    private String id;

	private AppDto app;

	/**
	 * 服务器
	 */
	private Set<ServerDeployDto> deploys;

	private String servers;

	/**
	 * 服务状态
	 */
	private String status;

	public String getServers() {
		if(CollectionUtil.isNotEmpty(deploys)){
			return deploys.stream().map(ServerDeployDto::getName).collect(Collectors.joining(","));
		}
		return servers;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeployDto deployDto = (DeployDto) o;
		return Objects.equals(id, deployDto.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

    public String getId() {
        return this.id;
    }

    public AppDto getApp() {
        return this.app;
    }

    public Set<ServerDeployDto> getDeploys() {
        return this.deploys;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApp(AppDto app) {
        this.app = app;
    }

    public void setDeploys(Set<ServerDeployDto> deploys) {
        this.deploys = deploys;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
