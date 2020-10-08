package com.yc.tc.tingche.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yc.tc.tingche.bean.Admin;
import com.yc.tc.tingche.bean.User;

public interface PersonMapper {
	
	//修改用户参数
	@Update("update user set name=#{name},phone=#{phone},email=#{email},plate_num=#{plate_num} where id=#{id}")
	public void updateByp(User u);
	
	//用户根据id查找
	@Select("select * from user where id=#{id}")
	public User selectByid(User u);
	
	//用户根据user id添加money
	@Update("update user set money=#{money} where id=#{id} ")
	public void updayeByMo(User u);
	
	//修改管理员参数
		@Update("update admin set name=#{name},phone=#{phone},email=#{email} where id=#{id}")
		public void adupdateByp(Admin adm);
		
		//管理员根据id查找
		@Select("select * from admin where id=#{id}")
		public Admin adselectByid(Admin adm);
		
}
