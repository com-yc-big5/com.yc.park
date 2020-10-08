package com.yc.tc.tingche.dao;

import org.apache.ibatis.annotations.Select;

import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.bean.Park;
import com.yc.tc.tingche.bean.User;

public interface IndexMapper {

	//根据车牌号查询订单
	@Select("select * from orders where plate_num=#{pate_num}")
	public Orders OselectBynum(String pate_num);
	//根据user_id 查找用户
	@Select("select * from user where id=#{uid}")
	public User UselectBynum(Integer uid);
	//根据park_id 查找车位
	@Select("select * from park where num_id=#{pid}")
	public Park PselectBynum(Integer pid);
	
	//根据车库名查询数量
		@Select("select count(*) from park where garage=#{garage}")
		public int selectnumByPark(String garage);
		
}
