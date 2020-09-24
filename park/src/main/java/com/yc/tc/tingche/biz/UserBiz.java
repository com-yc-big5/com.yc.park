package com.yc.tc.tingche.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.UserMapper;

@Service
public class UserBiz {
	
	
	@Resource
	private UserMapper umpper;
	
	
	
	public User login(User user) throws BizException {
		User dbUser=umpper.selectLogined(user);
		if(dbUser==null) {
			throw new BizException("用户名或者密码错误");
		}
		return dbUser;
	}
}


