package com.kites.swagger;

import org.hibernate.sql.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket getDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("public-api")
				.apiInfo(getApiInfo())
				.select().build();
		
	}
	
	public ApiInfo getApiInfo() {
		
		return new ApiInfoBuilder().title("Kites")
				.description("API build by Kites")
				.version("1").build();
		
	}

}
