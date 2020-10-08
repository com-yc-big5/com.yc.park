package com.yc.tc.tingche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.bean.User;

public interface OrderMapper {
	
	//select * from orders where user_id=1 or plate_id=1
	@Select("select * from orders where id=#{id} or plate_num=#{plate_num} or user_id=#{user_id}")
    public List<Orders> selectByOrder(Orders ord);
	
	//根据id查询ordr
	@Select("select * from orders where id=#{id}")
	public Orders  getOrderByOrderId(String id);
	
	//根据user_id查询ordr
		@Select("select * from orders where user_id=#{id}")
		public Orders  getOrderByUserId(Integer id);

}
