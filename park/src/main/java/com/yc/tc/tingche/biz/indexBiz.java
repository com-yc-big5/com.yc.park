package com.yc.tc.tingche.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.bean.Park;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.IndexMapper;

@Service
public class indexBiz {
	
	@Resource
	private IndexMapper Impper;
	//根据车牌号查询订单
	public Orders OselectBynum(String num) {
		Orders o=Impper.OselectBynum(num);
		System.out.println("根据车牌号查信息  --订单");
		return o;
	}
	
	//根据user_id 查找用户
	public User UselectBynum(Integer uid) {
		User u=Impper.UselectBynum(uid);
		System.out.println("根据车牌号查信息  --订单");
		return u;
	}
	
	//根据park_id 查找车位
	public Park PselectBynum(Integer pid) {
		Park p=Impper.PselectBynum(pid);
		System.out.println("根据车牌号查信息  --订单");
		return p;
	}
	
	//根据车库名查询数量
	
		public int selectnumBypark(String garage) {
			
			int num=Impper.selectnumByPark(garage);
			return num;
		}
	
}
