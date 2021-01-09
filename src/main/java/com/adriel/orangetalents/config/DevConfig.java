package com.adriel.orangetalents.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adriel.orangetalents.services.instantiates.DevInstantiate;

@Configuration
@Profile("test")
public class DevConfig {

	@Autowired
	private DevInstantiate dev;
	
	@Bean
	public boolean instantiate() {
		dev.instantiate();
		return true;
	}
}
