package com.yc.tc.tingche.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.yc.tc.tingche.bean.Admin;

import com.yc.tc.tingche.biz.AdminBiz;
import com.yc.tc.tingche.biz.BizException;


@Controller
public class AdminAction {
	
	@Resource
	private AdminBiz aBiz;
	
	//去管理员登录页面
	@GetMapping("toadlogin")
	public String  AdminLgin(@Valid Admin adm,Errors errors,Model m) {

	
		return "admin/login";
	}
	//后台管理员登录页面
	@PostMapping("adlogin.do")
	public String login( Admin adm, HttpSession session,Model m) throws BizException {
         
		Admin admed= aBiz.Alogin(adm);
	    session.setAttribute("adlogined", admed);
     	m.addAttribute("adlduser",admed);
		
         return "admin/index";
		
	}
	

}
