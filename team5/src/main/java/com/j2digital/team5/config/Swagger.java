package com.j2digital.team5.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger{
  @Bean
  public Docket api() {
    //Register the controllers to swagger
    //Also it is configuring the Swagger Docket
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.any())
        .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))//sin basic-error-controller
        .paths(PathSelectors.any())
        .build()
        .pathMapping("/");

  }
}