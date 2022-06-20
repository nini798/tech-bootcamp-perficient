package com.perficient.techbootcampnicholaschen.melee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.perficient.techbootcampnicholaschen.melee.entity"})
public class TechbootcampNicholaschenApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TechbootcampNicholaschenApplication.class, args);
	}

}
