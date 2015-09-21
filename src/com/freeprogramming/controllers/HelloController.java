package com.freeprogramming.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping(value="/hello/{name}", method=RequestMethod.GET)
	public String getGreeting(@PathVariable String name){
		return "hello "+name;
	}
	
	
	
	
}

