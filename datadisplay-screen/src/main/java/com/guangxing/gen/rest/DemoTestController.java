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
package com.guangxing.gen.rest;

import com.guangxing.annotation.Log;
import com.guangxing.gen.domain.DemoTest;
import com.guangxing.gen.service.DemoTestService;
import com.guangxing.gen.service.dto.DemoTestQueryCriteria;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @website https://docs.auauz.net
* @description /
* @author Guangxing
* @date 2020-07-21
**/
@AllArgsConstructor
@RestController
@Api(tags = "测试生成管理")
@RequestMapping("/api/demoTest")
public class DemoTestController {

    private final DemoTestService demoTestService;


    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('demoTest:list')")
    public void download(HttpServletResponse response, DemoTestQueryCriteria criteria) throws IOException {
        demoTestService.download(demoTestService.queryAll(criteria), response);
    }

    @GetMapping
    @Log("查询测试生成")
    @ApiOperation("查询测试生成")
    @PreAuthorize("@el.check('demoTest:list')")
    public ResponseEntity<Object> getDemoTests(DemoTestQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(demoTestService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @PostMapping
    @Log("新增测试生成")
    @ApiOperation("新增测试生成")
    @PreAuthorize("@el.check('demoTest:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody DemoTest resources){
        return new ResponseEntity<>(demoTestService.create(resources),HttpStatus.CREATED);
    }

    @PutMapping
    @Log("修改测试生成")
    @ApiOperation("修改测试生成")
    @PreAuthorize("@el.check('demoTest:edit')")
    public ResponseEntity<Object> update(@Validated @RequestBody DemoTest resources){
        demoTestService.update(resources);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Log("删除测试生成")
    @ApiOperation("删除测试生成")
    @PreAuthorize("@el.check('demoTest:del')")
    @DeleteMapping
    public ResponseEntity<Object> deleteAll(@RequestBody Integer[] ids) {
        demoTestService.deleteAll(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}