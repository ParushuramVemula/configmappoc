package com.congifmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.congifmap.entities.DbConfig;

@SpringBootApplication
public class ConfigmappocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigmappocApplication.class, args);
		System.err.println(context.getBean(DbConfig.class));
	}

}
