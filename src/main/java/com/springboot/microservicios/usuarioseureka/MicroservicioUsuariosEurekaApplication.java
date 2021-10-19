package com.springboot.microservicios.usuarioseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicioUsuariosEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioUsuariosEurekaApplication.class, args);
	}

}
