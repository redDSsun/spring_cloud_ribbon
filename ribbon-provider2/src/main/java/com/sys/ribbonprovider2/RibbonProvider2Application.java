package com.sys.ribbonprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class RibbonProvider2Application {

	@RequestMapping("/info")
	public String getInfo(){
		return "This is provider2!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonProvider2Application.class, args);
	}
}
