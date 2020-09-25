package com.yc.tc.tingche.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

/****************管理员页面     开始****************/
	//后台首页
	@GetMapping(path= {"admin","index.html"})
	public String AdIndex() {
		return "admin/index";
	}
	//后台车辆入库页面
	@GetMapping("inpart.html")
	public String AdInpart() {
		return "admin/inpart";
	}
	//后台车辆出库页面
	@GetMapping("outpart.html")
	public String AdOutpart() {
		return "admin/outpart";
	}
	//后台车位管理页面
	@GetMapping("part.html")
	public String AdPart() {
		return "admin/part";
	}
	//后台用户管理页面
	@GetMapping("user.html")
	public String AdUser() {
		return "admin/user";
	}
	//后台订单管理页面
	@GetMapping("order.html")
	public String AdOrder() {
		return "admin/order";
	}
	//后台管理员登录页面
	@GetMapping("login.html")
	public String AdLogin() {
		return "admin/login";
	}
	//后台个人中心页面
	@GetMapping("person.html")
	public String AdPerson() {
		return "admin/person";
	}
/****************管理员页面     结束****************/
	
}
