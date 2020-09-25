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
	private UserBiz uBiz;
	//注册
	@PostMapping("reg.do")
	public String register(@Valid User user,Errors errors,Model m) {
		if(errors.hasErrors()) {
			m.addAttribute("errors", Utils.asMap(errors));
			m.addAttribute("user",user);
			return "reg";
		}
		
		try {
			uBiz.register(user);
		} catch (BizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errors.rejectValue("name", "name",e.getMessage());
			m.addAttribute("errors",Utils.asMap(errors));
			m.addAttribute("user",user);
			return "reg";
		}
		//响应重定向  redirect:index
		return "index";
		
	}
	
	//点击注册
	@GetMapping("toreg")
	public String toreg() {
		return "reg";
	}
	
	
	//登录
	@PostMapping("login.do")
	@ResponseBody
	public Result login(@Valid User user,Errors errors, HttpSession session) {
		try {
		if(errors.hasFieldErrors("name") || errors.hasFieldErrors("password")) {
			Result res=new Result(0,"验证错误！",Utils.asMap(errors));
			return res;
		}
		User dbuser;
		
			dbuser = uBiz.login(user);
			session.setAttribute("logined", dbuser);
			return new Result(1,"登录成功",dbuser);
		} catch (BizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return new Result(0, e.getMessage());
		}
	 
	
		
		}

}
