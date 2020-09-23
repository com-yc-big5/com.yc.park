package com.yc.tc.tingche.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.UserMapper;
import com.yc.tc.tingche.util.BizException;



@Service
public class UserBiz {
	
	@Resource
	private UserMapper userMapper;
	
	
	/**
	 * 用户注册
	 * 
	 * Errors 保存所有的报错信息，默认会被推送到页面
	 * @param user
	 * @throws BizException
	 */
	
	public void register(User user) throws BizException {
		//参数验证在实体类中进行
		//同名验证
		if(userMapper.selectByName(user.getName())>0) {
			throw new BizException("该用户名已存在");
		}
		userMapper.insert(user);    
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 * @throws BizException 
	 */
	public User login(User user) throws BizException {
	
		User ruser=userMapper.selectByLogin(user);
		
		if(ruser==null) {
			throw new BizException("用户名或密码不正确");
		}
		
		return ruser;
		
	}
}
