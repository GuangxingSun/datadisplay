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
package com.guangxing.config;

import com.fasterxml.classmate.TypeResolver;
import com.google.common.base.Predicates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.data.domain.Pageable;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.AlternateTypeRule;
import springfox.documentation.schema.AlternateTypeRuleConvention;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

/**
 * api页面 /doc.html
 * @author Guangxing
 * @date 2018-11-23
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Value("${jwt.token-start-with}")
    private String tokenStartWith;

    @Value("${swagger.enabled}")
    private Boolean enabled;

    @Bean
    @SuppressWarnings("all")
    public Docket createRestApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name(tokenHeader).description("token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .defaultValue(tokenStartWith + " ")
                .required(true)
                .build();
        pars.add(ticketPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enabled)
                .apiInfo(apiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("一个简单且易上手的 Spring boot 后台管理框架")
                .title("EL-ADMIN 接口文档")
                .version("2.4")
                .build();
    }

}

/**
 *  将Pageable转换展示在swagger中
 */
@Configuration
class SwaggerDataConfig {

    @Bean
    public AlternateTypeRuleConvention pageableConvention(final TypeResolver resolver) {
        return new AlternateTypeRuleConvention() {
            @Override
            public int getOrder() {
                return Ordered.HIGHEST_PRECEDENCE;
            }

            @Override
            public List<AlternateTypeRule> rules() {
                return newArrayList(newRule(resolver.resolve(Pageable.class), resolver.resolve(Page.class)));
            }
        };
    }

    @ApiModel
    private static class Page {
        @ApiModelProperty("页码 (0..N)")
        private Integer page;

        @ApiModelProperty("每页显示的数目")
        private Integer size;

        @ApiModelProperty("以下列格式排序标准：property[,asc | desc]。 默认排序顺序为升序。 支持多种排序条件：如：id,asc")
        private List<String> sort;

        public Page() {
        }

        public Integer getPage() {
            return this.page;
        }

        public Integer getSize() {
            return this.size;
        }

        public List<String> getSort() {
            return this.sort;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public void setSort(List<String> sort) {
            this.sort = sort;
        }

        public boolean equals(final Object o) {
            if (o == this) return true;
            if (!(o instanceof Page)) return false;
            final Page other = (Page) o;
            if (!other.canEqual((Object) this)) return false;
            final Object this$page = this.getPage();
            final Object other$page = other.getPage();
            if (this$page == null ? other$page != null : !this$page.equals(other$page)) return false;
            final Object this$size = this.getSize();
            final Object other$size = other.getSize();
            if (this$size == null ? other$size != null : !this$size.equals(other$size)) return false;
            final Object this$sort = this.getSort();
            final Object other$sort = other.getSort();
            if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
            return true;
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Page;
        }

        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final Object $page = this.getPage();
            result = result * PRIME + ($page == null ? 43 : $page.hashCode());
            final Object $size = this.getSize();
            result = result * PRIME + ($size == null ? 43 : $size.hashCode());
            final Object $sort = this.getSort();
            result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
            return result;
        }

        public String toString() {
            return "SwaggerDataConfig.Page(page=" + this.getPage() + ", size=" + this.getSize() + ", sort=" + this.getSort() + ")";
        }
    }
}
