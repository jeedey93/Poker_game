package com.renaud.poker_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PokerGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokerGameApplication.class, args);
	}

}
