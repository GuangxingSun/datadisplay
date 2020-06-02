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
package com.guangxing.modules.system.rest;

import cn.hutool.core.collection.CollectionUtil;
import com.guangxing.modules.system.domain.Dept;
import com.guangxing.modules.system.service.DeptService;
import com.guangxing.modules.system.service.dto.DeptDto;
import com.guangxing.modules.system.service.dto.DeptQueryCriteria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.guangxing.annotation.Log;
import com.guangxing.exception.BadRequestException;
import com.guangxing.utils.PageUtil;
import com.guangxing.utils.ThrowableUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
* @author Guangxing
* @date 2019-03-25
*/
@RestController
@Api(tags = "系统：部门管理")
@RequestMapping("/api/dept")
public class DeptController {

    private final DeptService deptService;
    private static final String ENTITY_NAME = "dept";

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }

    @Log("导出部门数据")
    @ApiOperation("导出部门数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('dept:list')")
    public void download(HttpServletResponse response, DeptQueryCriteria criteria) throws Exception {
        deptService.download(deptService.queryAll(criteria, false), response);
    }

    @Log("查询部门")
    @ApiOperation("查询部门")
    @GetMapping
    @PreAuthorize("@el.check('user:list','dept:list')")
    public ResponseEntity<Object> getDepts(DeptQueryCriteria criteria) throws Exception {
        List<DeptDto> deptDtos = deptService.queryAll(criteria, true);
        return new ResponseEntity<>(PageUtil.toPage(deptDtos, deptDtos.size()),HttpStatus.OK);
    }

    @Log("查询部门")
    @ApiOperation("查询部门:根据ID获取同级与上级数据")
    @GetMapping("/superior")
    @PreAuthorize("@el.check('user:list','dept:list')")
    public ResponseEntity<Object> getSuperior(@RequestParam List<Long> ids) {
        Set<DeptDto> deptDtos  = new LinkedHashSet<>();
        for (Long id : ids) {
            DeptDto deptDto = deptService.findById(id);
            List<DeptDto> depts = deptService.getSuperior(deptDto, new ArrayList<>());
            deptDtos.addAll(depts);
        }
        return new ResponseEntity<>(deptService.buildTree(new ArrayList<>(deptDtos)),HttpStatus.OK);
    }

    @Log("新增部门")
    @ApiOperation("新增部门")
    @PostMapping
    @PreAuthorize("@el.check('dept:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody Dept resources){
        if (resources.getId() != null) {
            throw new BadRequestException("A new "+ ENTITY_NAME +" cannot already have an ID");
        }
        return new ResponseEntity<>(deptService.create(resources),HttpStatus.CREATED);
    }

    @Log("修改部门")
    @ApiOperation("修改部门")
    @PutMapping
    @PreAuthorize("@el.check('dept:edit')")
    public ResponseEntity<Object> update(@Validated(Dept.Update.class) @RequestBody Dept resources){
        deptService.update(resources);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Log("删除部门")
    @ApiOperation("删除部门")
    @DeleteMapping
    @PreAuthorize("@el.check('dept:del')")
    public ResponseEntity<Object> delete(@RequestBody Set<Long> ids){
        Set<DeptDto> deptDtos = new HashSet<>();
        for (Long id : ids) {
            List<Dept> deptList = deptService.findByPid(id);
            deptDtos.add(deptService.findById(id));
            if(CollectionUtil.isNotEmpty(deptList)){
                deptDtos = deptService.getDeleteDepts(deptList, deptDtos);
            }
        }
        try {
            deptService.delete(deptDtos);
        }catch (Throwable e){
            ThrowableUtil.throwForeignKeyException(e, "所选部门中存在岗位或者角色关联，请取消关联后再试");
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}