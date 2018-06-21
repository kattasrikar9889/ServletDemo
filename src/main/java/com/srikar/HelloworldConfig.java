package com.srikar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class HelloworldConfig {

	
	@Bean(name="helloworldBean")
	@Description("this is a sample spring bean")
	public Helloworld helloWorld() {
		return new Helloworldimp();
	}
}
