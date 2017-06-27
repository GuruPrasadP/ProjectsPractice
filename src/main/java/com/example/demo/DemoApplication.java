package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication  application = new SpringApplication(DemoApplication.class);
		
		Map<String, Object> map = new HashMap<>();
		map.put("SERVER_CONTEXT_PATH", "/springApp");
		map.put("SERVER_PORT", "8585");
		application.setDefaultProperties(map);
		
		application.run();
	}
	
	@RestController
	class GreetingController {

	    @RequestMapping("/hello/{name}")
	    String hello(@PathVariable String name) {
	        return "Hello, " + name + "!";
	    }
	}
}
