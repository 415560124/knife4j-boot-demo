package com.rhy.knife4jbootdemo.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.security.Security;
import java.util.List;

/**
 * @author Rhy
 * @title swagger配置类
 * @description swagger配置类
 * @createTime 2020年09月16日 16:48:00
 * @modifier：Rhy
 * @modification_time：2020-09-16 16:48
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {
    @Bean("apiV1")
    public Docket initDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfo())
                .groupName("V1.0")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rhy.knife4jbootdemo.v1"))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(Lists.newArrayList(initSecutityContext()))
                .securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
    }
    @Bean("apiV2")
    public Docket initDocketV2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfoV2())
                .groupName("V2.0")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rhy.knife4jbootdemo.v2"))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(Lists.newArrayList(initSecutityContext()))
                .securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
    }

    private ApiKey apiKey() {
        return new ApiKey("BearerToken", "Authorization", "header");
    }
    /**
     * API基本文档信息配置
     * @return
     */
    private ApiInfo initApiInfo(){
        return new ApiInfoBuilder()
                .title("Knife4j接口文档示例v1")
                .contact("任鸿毅")
                .description("Knife4j接口文档示例v1")
                .termsOfServiceUrl("v1.rhy.com")
                .version("1.0")
                .build();

    }
    /**
     * API基本文档信息配置
     * @return
     */
    private ApiInfo initApiInfoV2(){
        return new ApiInfoBuilder()
                .title("Knife4j接口文档示例v2")
                .contact("王圆圆")
                .description("Knife4j接口文档示例v2")
                .termsOfServiceUrl("v2.rhy.com")
                .version("2.0")
                .build();

    }
    /**
     * security上下文配置
     * @return
     */
    private SecurityContext initSecutityContext(){
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.ant("/.*"))
                .build();

    }


    private List<SecurityReference> defaultAuth(){
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    }
}
