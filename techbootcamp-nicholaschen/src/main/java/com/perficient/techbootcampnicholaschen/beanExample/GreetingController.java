package com.perficient.techbootcampnicholaschen.beanExample;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private PlayerPool pp;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/p1")
	public String getP1() {
		Gamer p = pp.getP1Player();
		return p.toString();
	}
	
	@GetMapping("/p2")
	public String getP2() {
		Gamer p = pp.getP2Player();
		return p.toString();
	}
}