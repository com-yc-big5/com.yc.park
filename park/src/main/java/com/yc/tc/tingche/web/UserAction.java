package com.yc.tc.tingche.web;

import javax.annotation.Resource;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.UserBiz;

@Controller
public class UserAction {

	@Resource
	private UserBiz uBiz;
	@PostMapping("login.do")
	public String login(@Valid User user,Errors errors,Model m) {
		
		
		return "index";}

}
