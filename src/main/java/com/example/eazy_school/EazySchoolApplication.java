package com.example.eazy_school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;


//@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)  //Щоб позначити клас для якого я хочу сам зробити налшатування, буде в звіті автоконфігурації як виняток
@SpringBootApplication
public class EazySchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazySchoolApplication.class, args);
	}

}
