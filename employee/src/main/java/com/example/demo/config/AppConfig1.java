package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
	
	@Bean
	public ModelMapper modelmapper()
	{
		return new ModelMapper();
	}

}
