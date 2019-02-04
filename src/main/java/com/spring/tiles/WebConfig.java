package com.spring.tiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

		@Override
		public void addResourceHandlers(final ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/*.js/**").addResourceLocations("/webapp/resources/");
			registry.addResourceHandler("/*.css/**").addResourceLocations("/webapp/resources/");
		}

	}
