package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MavenWebBootApp{
	
	public static void main( String[] args )
	    {
		SpringApplication.run(MavenWebBootApp.class);
	    	ApplicationContext applicationContext = SpringApplication.run(MavenWebBootApp.class);
	    	String[] str = applicationContext.getBeanDefinitionNames();
	    	System.out.println("Bean names are :");
	    	for(String s : str){
	    		System.out.println("Bean name is :"+s);
	    	}
	        System.out.println( "Spring World Spring-Boot App!" );
	    }

}
