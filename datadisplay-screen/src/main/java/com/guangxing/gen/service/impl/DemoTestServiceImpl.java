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
package com.guangxing.gen.service.impl;

import com.guangxing.gen.domain.DemoTest;
import com.guangxing.utils.ValidationUtil;
import com.guangxing.utils.FileUtil;
import lombok.RequiredArgsConstructor;
import com.guangxing.gen.repository.DemoTestRepository;
import com.guangxing.gen.service.DemoTestService;
import com.guangxing.gen.service.dto.DemoTestDto;
import com.guangxing.gen.service.dto.DemoTestQueryCriteria;
import com.guangxing.gen.service.mapstruct.DemoTestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.guangxing.utils.PageUtil;
import com.guangxing.utils.QueryHelp;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
* @website https://docs.auauz.net
* @description /
* @author Guangxing
* @date 2020-07-21
**/
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DemoTestServiceImpl implements DemoTestService {

    private final DemoTestRepository demoTestRepository;
    private final DemoTestMapper demoTestMapper;

    @Override
    public Map<String,Object> queryAll(DemoTestQueryCriteria criteria, Pageable pageable){
        Page<DemoTest> page = demoTestRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return PageUtil.toPage(page.map(demoTestMapper::toDto));
    }

    @Override
    public List<DemoTestDto> queryAll(DemoTestQueryCriteria criteria){
        return demoTestMapper.toDto(demoTestRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder)));
    }

    @Override
    public DemoTestDto findById(Integer id) {
        DemoTest demoTest = demoTestRepository.findById(id).orElseGet(DemoTest::new);
        ValidationUtil.isNull(demoTest.getId(),"DemoTest","id",id);
        return demoTestMapper.toDto(demoTest);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DemoTestDto create(DemoTest resources) {
        return demoTestMapper.toDto(demoTestRepository.save(resources));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(DemoTest resources) {
        DemoTest demoTest = demoTestRepository.findById(resources.getId()).orElseGet(DemoTest::new);
        ValidationUtil.isNull( demoTest.getId(),"DemoTest","id",resources.getId());
        demoTest.copy(resources);
        demoTestRepository.save(demoTest);
    }

    @Override
    public void deleteAll(Integer[] ids) {
        for (Integer id : ids) {
            demoTestRepository.deleteById(id);
        }
    }

    @Override
    public void download(List<DemoTestDto> all, HttpServletResponse response) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        for (DemoTestDto demoTest : all) {
            Map<String,Object> map = new LinkedHashMap<>();
            map.put("姓名", demoTest.getName());
            map.put("性别", demoTest.getSex());
            map.put("创建日期", demoTest.getCreateTime());
            list.add(map);
        }
        FileUtil.downloadExcel(list, response);
    }
}