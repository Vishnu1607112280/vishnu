package com.zensar.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.zensar.springbootdemo.StudentDto.StudentDto;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootDemoApplication {

	public static void main(String... args) {
		System.out.println("Vishnu");
		SpringApplication.run(SpringBootDemoApplication.class, args);

		System.out.println("Vinay");

		StudentDto dto = new StudentDto();

	}

}
