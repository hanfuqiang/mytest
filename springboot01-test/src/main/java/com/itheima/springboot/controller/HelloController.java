package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 就是@Controller 和  @ResponseBody 注解加在一起,响应json格式
public class HelloController {
	
	@Autowired
	private Environment environment;
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	// http://localhost:8080/hello
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping("/hello")
	public String hello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		System.out.println("name: "+name);
		System.out.println("url: "+url);
		return "Hello World";
	}
}
