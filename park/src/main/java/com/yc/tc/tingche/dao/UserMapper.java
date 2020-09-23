package com.yc.tc.tingche.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.yc.tc.tingche.bean.User;

public interface UserMapper {
	
	@Insert("insert into user values("
			+ "null,#{name},"
			+ "#{password},#{phone},#{plate_num},"
			+ "#{stauts},now(),#{head},"
			+ "#{email})")
	public int insert(User user);
	
	@Select("select count(*) from user where name=#{name}")
	public int selectByName(String name);
	

	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectByLogin(User user);
}
