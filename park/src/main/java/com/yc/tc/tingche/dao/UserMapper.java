package com.yc.tc.tingche.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.yc.tc.tingche.bean.User;

public interface UserMapper {
	


	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectLogined(User user);
	
	@Insert("insert into user values (null,#{name},#{password},#{phone},#{platenum},#{status},now(),#{money},#{head},#{email})")
	public int insert(User user);
}
