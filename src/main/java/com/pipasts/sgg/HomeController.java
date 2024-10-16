package com.pipasts.sgg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String Home() {
		return "Hello World<br> Success..202410161027";
	}
}
