package com.yc.tc.tingche.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.Admin;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.PersonMapper;

@Service
public class PersonBiz {
	/********用户************/
	@Resource
	private PersonMapper pempper;
	//修改用户信息
	public void updateByp(User u) {
		pempper.updateByp(u);
		System.out.println("用户后台个人中心页面修改");
		return ;
	}
	
	//用户 根据id查找 User
	public User selectByid(User u) {
	User du=	pempper.selectByid(u);
		return du;
	}
	
	//用户根据user id添加money
	
	public void UpdateByMo(User u) {
		pempper.updayeByMo(u);
		System.out.println("充值");
		
	}
	
	/********管理员************/
	
	//修改管理员信息
		public void adupdateByp(Admin adm) {
			pempper.adupdateByp(adm);
			System.out.println("用户后台个人中心页面修改");
			return ;
		}
		
		//管理员 根据id查找admin
		public Admin adselectByid(Admin adm) {
		Admin admed=	pempper.adselectByid(adm);
			return admed;
		}

}
