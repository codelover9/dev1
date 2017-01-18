package com.deveopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class i18NConfig {
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("classpath:i18n/messages");
		//Checks for new messages every 30 minutes
		resourceBundleMessageSource.setCacheSeconds(1000);
		return resourceBundleMessageSource;
		
	}

}
