package com.gre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gre")
public class GalvenizerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GalvenizerApplication.class, args);
	}
}
