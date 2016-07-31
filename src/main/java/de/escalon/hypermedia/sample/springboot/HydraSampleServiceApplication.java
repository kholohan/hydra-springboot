package de.escalon.hypermedia.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import de.escalon.hypermedia.sample.springboot.config.EnableHydra;

@SpringBootApplication
@EnableWebMvc
@EnableHydra
public class HydraSampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HydraSampleServiceApplication.class, args);
	}
}
