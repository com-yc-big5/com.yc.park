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
import com.yc.tc.tingche.biz.UserBiz;
import com.yc.tc.tingche.util.BizException;
import com.yc.tc.tingche.util.Utils;



@Controller
public class UserAction {
	
	@Resource
	private UserBiz ubiz;

	
	/**
	 * 登录使用ajax提交
	 * ==》Vue
	 * @param user
	 */
	@GetMapping("xxx.do")
	@ResponseBody
	public Result login(@Valid User user,Errors errors,HttpSession session) {
		try {
			if(errors.hasFieldErrors("name") || errors.hasFieldErrors("password"))
			{
				Result res=new Result(0, "验证错误",errors.getFieldErrors());
				return res;
			}
			User loginedUser=ubiz.login(user);
			session.setAttribute("loginedUser", loginedUser);
			System.out.println("登录成功存入："+session.getAttribute("loginedUser"));
			
			return new Result(1, "登录成功",loginedUser);
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(0, e.getMessage()); 
		}
		
	}
	
	/**
	 * 注册使用表单提交
	 * ==》页面跳转
	 * @param user
	 */
	@PostMapping("xxx.do")
	public String  register(@Valid User user,Errors errors,Model m) {
		if(errors.hasErrors()) { 
			//返回所有的报错信息
			m.addAttribute("errors", Utils.asMap(errors));
			//返回用户提交的字段的信息
			m.addAttribute("user", user);  
			System.out.println( errors.getAllErrors());
			return "xxx";
		}  
		try {  
			ubiz.register(user);  
		} catch (BizException e) {
			e.printStackTrace(); 
			//将我们自定义的‘用户已存在’错误注册到errors中
			errors.rejectValue("name", "name",e.getMessage());
			//返回所有的报错信息
			m.addAttribute("errors", Utils.asMap(errors));
			//返回用户提交的字段的信息
			m.addAttribute("user", user);
			return "xxx";
		}
		
		return "redirect:/"; //使用响应重定向方法跳转  
	}
}
