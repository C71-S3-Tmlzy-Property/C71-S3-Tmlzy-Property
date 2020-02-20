package com.yc.springboot.C71S3TmlzyProperty.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.springboot.C71S3TmlzyProperty.bean.User;
import com.yc.springboot.C71S3TmlzyProperty.biz.UserBiz;

@Controller
public class UserAction {
	
	@Resource
	UserBiz uBiz;
	
	@GetMapping("login")
	public void login(){}
	
	@PostMapping("dologin")
	public Object dologin(User user){
		User loginUser=uBiz.logining(user);
		if(loginUser!=null){
			return "成功"	;
		}
		
		return "失败";
	}
	
}
