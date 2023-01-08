package com.sbst.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sbst.common.Constants;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController(Constants.HOME_PATH).setViewName(Constants.HOME_VIEW);
	}
}
