package com.yc.tc.tingche.dao;

import org.apache.ibatis.annotations.Select;

import com.yc.tc.tingche.bean.Admin;

public interface AdmiMapper {

	
	@Select("select * from admin where name=#{name} and password=#{password}")
	public Admin selectAdminLogined(Admin adm);
}
