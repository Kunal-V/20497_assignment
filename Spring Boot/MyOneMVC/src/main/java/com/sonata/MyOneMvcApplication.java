package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class MyOneMvcApplication {
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("./WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
	


	public static void main(String[] args) {
		SpringApplication.run(MyOneMvcApplication.class, args);
	}

}
