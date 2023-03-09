package com.toyproject.challengeplannersystem.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SpringDocsConfig {
    static final String JWT = "JWT";
    static final String TITLE = "API 문서";
    static final String DESCRIPTION = "Challenge Planner System API 문서";
    static final String NAME_CONTACT = "sunggyu";
    static final String EMAIL_CONTACT = "gkdlshtjdrb@gmail.com";
    @Bean
    public GroupedOpenApi usersGroup(@Value("${springdoc.version}") String appVersion) {
        return GroupedOpenApi.builder().group("users")
                .addOperationCustomizer((operation, handlerMethod) -> {
                    operation.addSecurityItem(new SecurityRequirement().addList("basicScheme"));
                    return operation;
                })
                .addOpenApiCustomiser(openApi -> openApi.info(new Info().title("Users API").version(appVersion)))
                .packagesToScan("com.toyproject.challengeplannersystem")
                .build();
    }
}
