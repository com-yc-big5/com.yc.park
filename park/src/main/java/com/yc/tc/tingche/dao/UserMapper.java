package com.yc.tc.tingche.dao;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yc.tc.tingche.bean.Park;
import com.yc.tc.tingche.bean.User;

public interface UserMapper {
	//注册页面
	@Insert("insert into user values (null"
			+ ",#{name},#{password},#{phone}"
			+ ",'niqwe',1,now(),123"
			+ ",123,#{email})")
   public  int insert(User user);

	@Select("select count(*) from user where name=#{name}")
	public int  countByName(String name);
    //登录页面
	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectLogined(User user);
	
	//用户管理页面-- 查询
	@Select("select * from user where name=#{name} or plate_num=#{plate_num} or phone=#{phone} or email=#{email}")
	public List<User> selectByU(User u);
	
	@Update("update user set name=#{name},plate_num=#{plate_num} ,phone=#{phone},email=#{email} where id=#{id}")
	public void updateByU(User u);
	
}
