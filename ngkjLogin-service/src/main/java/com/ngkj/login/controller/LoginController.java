package com.ngkj.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping(value="/getAllUser")
	public @ResponseBody List<String> getAllUser(){
		List<String> lst = new ArrayList<String>();
		lst.add("zhangsan");
		lst.add("lisi");
		lst.add("wangwu");
		lst.add(serverPort);
		return lst;
	}
	
}
