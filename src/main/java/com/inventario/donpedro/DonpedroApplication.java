package com.inventario.donpedro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DonpedroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DonpedroApplication.class, args);
	}
}
