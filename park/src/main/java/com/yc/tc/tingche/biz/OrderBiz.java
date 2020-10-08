package com.yc.tc.tingche.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.OrderMapper;
@Service
public class OrderBiz {
	
	
	@Resource
	private OrderMapper ompper;
	
	public List<Orders> selectOr(Orders ord) {
		List<Orders> o=ompper.selectByOrder(ord);
		if(o.size()==0) {
			System.out.println("没有相关订单");
		}
		return o;
	}
	
	public Orders getOrderByUserId(Integer id) {
		Orders o=ompper.getOrderByUserId(id);
		
		return o;
	}
	
	//支付宝
	
	public Orders getOrderByOrderId(String id) {
		Orders odr=ompper.getOrderByOrderId(id);
		return odr;
	}
	
}
