package com.kzr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(UserRepository repository) {
//		return args -> {
//			repository.save( new User("admin", "admin"));
//		};
//	}
}
