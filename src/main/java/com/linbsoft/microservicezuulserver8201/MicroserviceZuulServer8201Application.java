package com.linbsoft.microservicezuulserver8201;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulServer8201Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulServer8201Application.class, args);
	}
}

