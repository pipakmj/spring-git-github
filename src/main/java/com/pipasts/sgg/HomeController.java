package com.pipasts.sgg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String Home() {
		return "Code-Deploy EC2_server Access Success!!";
	}
}
