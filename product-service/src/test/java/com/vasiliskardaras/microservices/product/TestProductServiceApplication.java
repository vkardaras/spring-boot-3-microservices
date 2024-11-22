package com.vasiliskardaras.microservices.product;

import org.springframework.boot.SpringApplication;

public class TestProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
