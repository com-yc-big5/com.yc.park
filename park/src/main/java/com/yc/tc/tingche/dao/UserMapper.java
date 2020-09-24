package com.yc.tc.tingche.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yc.tc.tingche.bean.User;



@Repository
public interface UserMapper {
	
	
	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectLogined(User user);

}
