package com.challenge.betterday.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Base Architecture API")
                .version("0.0.1")
                .description("Spring Boot Base Architecture Project")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.yilmazgokhan"))
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class);
    }
}