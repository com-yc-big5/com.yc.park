package com.yc.tc.tingche.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.tc.tingche.bean.Result;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.BizException;
import com.yc.tc.tingche.biz.UserBiz;
import com.yc.tc.tingche.util.Utils;

@Controller
public class UserAction {

	@Resource
	private UserBiz ubiz;
	
	@GetMapping("login.do")
	public String tologin() {
		return "login";
	}
	
	@GetMapping("reg.do")
	public String toreg() {
		return "reg";
	}
	
	

}
