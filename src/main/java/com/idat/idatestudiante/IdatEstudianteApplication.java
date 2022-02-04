package com.idat.idatestudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableEurekaClient
@SpringBootApplication
public class IdatEstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdatEstudianteApplication.class, args);
	}
	
	//Define todo los detalles que tendra la API
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API de estudiantes")
				.description("La API servira para listar, eliminar, actualizar clientes")
				.termsOfServiceUrl("http://lideratecacademy.com")
				.contact(new Contact("Wilder Espinoza", "", "wilderespinoza@ciplima.org.pe"))
				.license("Wilder Espinoza")
				.licenseUrl("http://lideratecacademy.com")
				.version("1.0.0.")
				.build();
	}
	
	//Define la configuración para swagger
	@Bean
	public Docket petApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Universidad API")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.idat.idatestudiante"))
				.paths(PathSelectors.any())
				.build()
				.tags(new Tag("Estudiante API","Mostrar todas las APIS"));
				
	}

	
}
