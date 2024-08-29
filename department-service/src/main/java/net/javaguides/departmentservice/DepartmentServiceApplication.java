package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info =@Info(
				title = "Department Service REST APIs",
				description = "Deaprtment Service REST APIs Documentation",
				version = "V1.0",
				contact = @Contact(
						name = "PIRF",
						email = "fabiola.pichardo@profuturo.com.mx",
						url = "www.arquitecturaTI.profuturo.com.mx"
				),
				license = @License(
						name = "Apache 2.0",
						url = "www.arquitecturaTI.profuturo.com.mx"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Doc",
				url = "www.arquitecturaTI.profuturo.com.mx"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
