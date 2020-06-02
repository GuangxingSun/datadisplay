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
package com.guangxing.modules.system.service.mapstruct;

import com.guangxing.modules.system.repository.MenuRepository;
import com.guangxing.base.BaseMapper;
import com.guangxing.modules.system.domain.Menu;
import com.guangxing.modules.system.service.dto.MenuDto;
import com.guangxing.utils.SpringContextHolder;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

/**
 * @author Guangxing
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDto, Menu> {

    /**
     * 转换
     * @param menuDto /
     * @return /
     */
    @AfterMapping
    default MenuDto dealDto(@MappingTarget MenuDto menuDto) {
        MenuRepository menuRepository = SpringContextHolder.getBean(MenuRepository.class);
        if(menuRepository.countByPid(menuDto.getId()) > 0){
            menuDto.setLeaf(false);
            menuDto.setHasChildren(true);
        }
        return menuDto;
    }
}
