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
package com.guangxing.gen.repository;

import com.guangxing.gen.domain.DemoTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @website https://docs.auauz.net
* @description /
* @author Guangxing
* @date 2020-07-21
**/
public interface DemoTestRepository extends JpaRepository<DemoTest, Integer>, JpaSpecificationExecutor<DemoTest> {
}