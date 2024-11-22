package com.vasiliskardaras.microservices.order;

import org.springframework.boot.SpringApplication;

public class TestOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
