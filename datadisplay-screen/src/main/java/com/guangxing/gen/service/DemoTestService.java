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
package com.guangxing.gen.service;

import com.guangxing.gen.domain.DemoTest;
import com.guangxing.gen.service.dto.DemoTestDto;
import com.guangxing.gen.service.dto.DemoTestQueryCriteria;
import org.springframework.data.domain.Pageable;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @website https://docs.auauz.net
* @description /
* @author Guangxing
* @date 2020-07-12
**/
public interface DemoTestService {

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    Map<String,Object> queryAll(DemoTestQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<DemoTestDto>
    */
    List<DemoTestDto> queryAll(DemoTestQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id ID
     * @return DemoTestDto
     */
    DemoTestDto findById(Integer id);

    /**
    * 创建
    * @param resources /
    * @return DemoTestDto
    */
    DemoTestDto create(DemoTest resources);

    /**
    * 编辑
    * @param resources /
    */
    void update(DemoTest resources);

    /**
    * 多选删除
    * @param ids /
    */
    void deleteAll(Integer[] ids);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<DemoTestDto> all, HttpServletResponse response) throws IOException;
}