package com.rjeezy.videocall;

import com.rjeezy.videocall.user.User;
import com.rjeezy.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {
			service.register(User.builder()
					.username("Yeezy")
					.email("ye_everyday@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Linny")
					.email("wonderpets@mail.com")
					.password("aaa")
					.build());

		};
	}
}
