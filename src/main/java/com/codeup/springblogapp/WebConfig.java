package com.codeup.springblogapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//https://www.baeldung.com/maven-webjars
@Configuration
//@EnableWebMvc -> Also make sure you haven't used @EnableWebMvc in your application as that will disable Spring Boot's
// auto-configuration of Spring MVC.
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("/webjars/");
    }
}