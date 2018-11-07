package com.sys.ribbonprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class RibbonProvider3Application {

	@RequestMapping("/info")
	public String getInfo(){
		return "This is provider3@!!!!!!!!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonProvider3Application.class, args);
	}
}
