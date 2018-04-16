package com.ngkj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ngkj.service.UserService;
import com.ngkj.service.interfaces.LoginServiceFeign;

@RestController
@RequestMapping(value="/uc")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private LoginServiceFeign loginServiceFeign;
	@RequestMapping(value="/getBothUser")
	public @ResponseBody List<String> getBothUser(){
		System.out.println("开始调用LoginService服务");
		return userService.getAllUser();
	}
	/**
	 * fegin方式调用
	 * @return
	 */
	@RequestMapping(value="/getAllUser")
	public @ResponseBody List<String> getAllUser(){
		return loginServiceFeign.getAllUser();
	}
}
