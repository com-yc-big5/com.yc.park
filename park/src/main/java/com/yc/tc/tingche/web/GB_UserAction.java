package com.yc.tc.tingche.web;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.UserBiz;

@Controller
public class GB_UserAction {
	@Resource
	private UserBiz ubiz;
	
	//去用户管理
		@GetMapping("user.html")
		public String toUser() {
			return "admin/user";
		}
		//后台用户查询
		@PostMapping("user.do")
		public String AdUser( User u,Model m, @RequestParam(defaultValue = "1")int page) {
			PageHelper.startPage(page,5);
			ubiz.selectByu(u);
			
			List<User> ul=ubiz.selectByu(u);
			m.addAttribute("ulist",ul);
			
			return "admin/user";
		}
		//后台用户修改
			@PostMapping("xuser.do")
			public String xAdUser(@Valid User u) {	
				ubiz.updateByu(u);	
				return "admin/user";
			}
}
