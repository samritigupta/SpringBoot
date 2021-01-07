package com.springboot.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
    http://localhost:8080/swagger-ui/
    http://localhost:8080/swagger-ui/index.html#/employee-rest-controller/updateEmployeeUsingPUT
    http://localhost:8080/v2/api-docs
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}
