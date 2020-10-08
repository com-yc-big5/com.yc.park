package com.yc.tc.tingche.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.UserMapper;


@Service
public class UserBiz {
	@Resource
	private UserMapper umpper;
	
	//注册验证
	public void register(User user)throws BizException {
		//可以忽略字段的验证
		//经行同名验证
		if(umpper.countByName(user.getName())>0) {
			throw new BizException("用户已存在");
		}
		umpper.insert(user);
	}
	
	//登录验证
	public User login(User user) throws BizException {
		User dbUser=umpper.selectLogined(user);
		if(dbUser==null) {
			throw new BizException("用户名或者密码错误");
		}
		return dbUser;
	}
	//用户管理页面验证
	
	public List<User> selectByu(User u){
		List<User> lu=umpper.selectByU(u);
		if(lu==null) {
			System.out.println("无用户");
		}
		
		return lu;
	}
	
	//用户管理页面修改
	public void updateByu(User u) {
		umpper.updateByU(u);
		System.out.println("用户修改");
	}
	
}


