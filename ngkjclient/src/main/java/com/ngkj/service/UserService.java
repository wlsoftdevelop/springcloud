package com.ngkj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	
	public List<String> getAllUser(){
		return restTemplate.getForObject("http://login-service/EurekaLoginService/login/getAllUser", List.class);
	}
	
}
