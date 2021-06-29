package com.market.discoveryserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis((com.google.common.base.Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.market.discoveryserver.controller"))
                //.paths((com.google.common.base.Predicate<String>) regex("/rest.*"))
                .build();
        //.apiInfo(metaInfo());
    }

}
