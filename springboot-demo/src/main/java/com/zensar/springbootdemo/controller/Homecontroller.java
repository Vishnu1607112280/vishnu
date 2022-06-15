package com.zensar.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@RequestMapping("/pqr")
	public String sayHello() {
		return "<h2>Enjoy Pandagoo</h2>";
	}

}
