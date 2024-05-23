package com.myprojects.user_management_system_spring_documentation;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "pavani",
						email = "pavanisatrapu@gmail.com",
						url = ""
				),
				license =@License(
						name = "Apache 2.0",
						url = ""
				)
		),
				externalDocs = @ExternalDocumentation(
						description = "Spring Boot User Management Documentation",
						url = ""
		)
)
public class UserManagementSystemSpringDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSystemSpringDocumentationApplication.class, args);
	}

}
