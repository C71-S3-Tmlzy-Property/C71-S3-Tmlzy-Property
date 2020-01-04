package com.yc.C71TmlzyProperty.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAction {
	
	@GetMapping("login")
	public void login(){}
	
	@GetMapping("index")
	public void index(){}
	
	@GetMapping("welcome")
	public void welcome(){}
	
}
