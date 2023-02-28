package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(Springboot1Application.class, args);
	
  DataSourceInf m=ac.getBean("dataSourceInf", DataSourceInf.class);
  
  m.getMessage();
	}

}
