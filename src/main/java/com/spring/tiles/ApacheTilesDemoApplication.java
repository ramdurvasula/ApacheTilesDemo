package com.spring.tiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApacheTilesDemoApplication extends SpringBootServletInitializer{
	
	private static Class applicationClass = ApacheTilesDemoApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(ApacheTilesDemoApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}

