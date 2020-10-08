package com.yc.tc.tingche.dao;

import java.util.List;


import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yc.tc.tingche.bean.Park;



public interface ParkMapper {
	
	
	@Select("select * from park where garage=#{garage} order by id desc")
	public List<Park> selectByNew(String garage);
	
	@Select("select * from park where garage=#{garage} or id=#{id} or price=#{price}")
	public List<Park> selectByW(Park p);
	//update park set id='3',garage="6" where id='1'
	@Update("update park set num_id=#{num_id},garage=#{garage},price=#{price} where id=#{id}")
	public void updateByw(Park p);
	
	
	
	
}
