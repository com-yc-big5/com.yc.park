package com.yc.tc.tingche.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yc.tc.tingche.bean.Admin;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.PersonBiz;

@Controller
public class PersonAction {

	@Resource
	private PersonBiz pbiz;
	
	/********用户************/
	//用户去个人中心
	@GetMapping("person.html")
	public String toPerson() {
		return "uperson";
	}
	//用户后台个人中心页面修改
	@PostMapping("person.do")
	public String Person(User u,Model m,HttpSession session) {
        
		pbiz.updateByp(u);
		User su=pbiz.selectByid(u);
		session.setAttribute("logined", su);
		
		return "uperson";
	}
	
	//用户后台个人中心页面充值
			@PostMapping("cperson.do")
			public String cAdPerson(double money,Model m,HttpSession session) {
				User ud=(User)session.getAttribute("logined");
			      money= money+ud.getMoney();
			      ud.setMoney(money);
			      pbiz.UpdateByMo(ud);
			      session.setAttribute("logined", ud);
				
				return "uperson";
			}
			/********管理员************/
	
	//管理员去个人中心
		@GetMapping("adperson.html")
		public String atoPerson() {
			return "admin/person";
		}
		//管理员后台个人中心页面修改
		@PostMapping("adperson.do")
		public String AdPerson(Admin adm,Model m,HttpSession session) {
	        
			pbiz.adupdateByp(adm);
			Admin admed=pbiz.adselectByid(adm);
			session.setAttribute("adlogined", admed);
			
			return "admin/person";
		}
		

	
	
}
