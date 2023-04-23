package com.career.goals.spring.docker.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerMavenApplication {
	
	static Logger logger= LoggerFactory.getLogger(SpringBootDockerMavenApplication.class);

	public static void main(String[] args) {
		logger.info("continous ceployment starting...");
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}

}
