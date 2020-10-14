package com.HR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeSalaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSalaryApplication.class, args);
	}

}
