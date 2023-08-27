package com.epicode.Spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/centrale")
public class CentralePompieriController {
	
	public Object getSonde() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/sonde";
		Object res = rt.getForObject(url, Object.class);
		System.out.println(res);
		return res;
	}
	
}
