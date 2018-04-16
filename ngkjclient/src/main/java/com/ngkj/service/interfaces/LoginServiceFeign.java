package com.ngkj.service.interfaces;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="login-service")
public interface LoginServiceFeign {
	
	@RequestMapping("/EurekaLoginService/login/getAllUser")
	public List<String> getAllUser();
	
}
