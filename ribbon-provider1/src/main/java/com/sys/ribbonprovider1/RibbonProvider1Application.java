package com.sys.ribbonprovider1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class RibbonProvider1Application {


	@RequestMapping("/info")
	public String getInfo(){
		return "This is provider1!!!!";
	}



	public static void main(String[] args) {
		SpringApplication.run(RibbonProvider1Application.class, args);
	}
}
