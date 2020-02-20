package com.yc.springboot.C71S3TmlzyProperty.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.springboot.C71S3TmlzyProperty.bean.User;
import com.yc.springboot.C71S3TmlzyProperty.bean.UserExample;
import com.yc.springboot.C71S3TmlzyProperty.dao.UserMapper;


@Service
public class UserBiz {
	
	@Resource
	UserMapper um;
	
	public User logining(User user){
		UserExample example=new UserExample();
		example.createCriteria().andAccountEqualTo(user.getAccount()).andPasswordEqualTo(user.getPassword());
		List<User> userlist=um.selectByExample(example);
		if(userlist.size()!=0){
			System.out.println(userlist);
			return userlist.get(0);
		}else{
			System.out.println("用户名或密码错误！！！");
		}
		return user;
	}
	
	
}
