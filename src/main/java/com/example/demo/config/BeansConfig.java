package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BeansConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}
	
}
