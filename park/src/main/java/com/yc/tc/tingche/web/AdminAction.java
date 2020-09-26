package com.yc.tc.tingche.web;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.tc.tingche.bean.Admin;
import com.yc.tc.tingche.biz.AdminBiz;
import com.yc.tc.tingche.biz.BizException;
import com.yc.tc.tingche.util.Utils;

@Controller
public class AdminAction {
	
	@Resource
	private AdminBiz aBiz;
	
	//管理员登录
	@PostMapping("adm.do")
	public String  AdminLgin(@Valid Admin adm,Errors errors,Model m) {

		if(errors.hasFieldErrors("name") || errors.hasFieldErrors("password")) {
			m.addAttribute("aderrors",Utils.asMap(errors) );
			m.addAttribute("adm",adm);
		}
		try {
			aBiz.Alogin(adm);
		} catch (BizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.addAttribute("aderrors",Utils.asMap(errors));
			m.addAttribute("adm",adm);
			return "login";
		}
		return "index";
	}
	
	

}
