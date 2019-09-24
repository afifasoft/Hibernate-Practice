package com.cloudsoftware.association;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.EntityManagerFactory;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class AssociationOneToOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociationOneToOneApplication.class, args);

	}

	@Bean
	public Docket swaggerConfiguration() {
		// Return a prepared Docket instance
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.cloudsoftware"))
				.build()
				.apiInfo(apiDetails());
	}


	private ApiInfo apiDetails() {
		return new ApiInfo(
				"POS Software API",
				"Sample API for POS",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Abdul Atif", "http://clickncollect.com", "info@clickncollect.com"),
				"API License",
				"http://clickncollect.com",
				Collections.emptyList());
	}


}
