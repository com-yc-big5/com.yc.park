package com.yc.tc.tingche.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.OrderBiz;

@Controller
public class OrderAction {
	
	@Resource
	private OrderBiz obiz;
	

	//去订单
	@GetMapping("order.html")
	public String toadOrder() {
		return "admin/order";
	}
	//后台订单搜素
	@PostMapping("order.do")
	public String AdOrder(@Valid Orders ord, Model m,@RequestParam(defaultValue = "1")int page) {
		PageHelper.startPage(page,5);
		obiz.selectOr(ord);
         List<Orders> orded=obiz.selectOr(ord);
		
		m.addAttribute("olist",orded);
		return "admin/order";
	}
	/*********用户**************/

	//去订单
	@GetMapping("uorder.html")
	public String toOrder() {
		return "uorder";
	}
	//后台订单搜素
	@PostMapping("uorder.do")
	public String uOrder(HttpSession session, Model m,@RequestParam(defaultValue = "1")int page) {
		PageHelper.startPage(page,5);
		
		User u=(User)session.getAttribute("logined");
	
		Integer id=u.getId();
		 Orders ord= obiz.getOrderByUserId(id);
		 if(ord==null) {
			 System.out.println(id);
		 }
	    	obiz.selectOr(ord);
         List<Orders> orded=obiz.selectOr(ord);
		
		m.addAttribute("olist",orded);
		return "uorder";
	}
}
