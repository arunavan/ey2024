package com.ey;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootapp1Application implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(Springbootapp1Application.class, args);
	}

	public void run(String... args) {
		System.out.println(" Console springBoot application");
	}
}
