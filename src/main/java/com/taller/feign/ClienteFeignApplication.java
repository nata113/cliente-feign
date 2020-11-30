package com.taller.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClienteFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteFeignApplication.class, args);
	}

}
