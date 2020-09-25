package com.yc.tc.tingche.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.yc.tc.tingche.bean.User;

public interface UserMapper {
	@Insert("insert into user valus (null"
			+ "#{name},#{password},#{phone}"
			+ "#{plate_num},#{createDate},#{money}"
			+ "#{head})")
   public  int insert(User user);
	
	@Select("select count(*) from user where name=#{name}")
	public int  countByName(String name);

	@Select("select * from user where name=#{name} and password=#{password}")
	public User selectLogined(User user);
}
