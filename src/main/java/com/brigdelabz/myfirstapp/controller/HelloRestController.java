package com.brigdelabz.myfirstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstapp")
public class HelloRestController {

	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello From BridgeLabz!!";
	}
}
