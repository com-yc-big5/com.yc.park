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
import com.yc.tc.tingche.bean.Park;
import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.dao.ParkMapper;
import com.yc.tc.tingche.biz.BizException;
import com.yc.tc.tingche.biz.OrderBiz;
import com.yc.tc.tingche.biz.ParkBiz;
import com.yc.tc.tingche.biz.UserBiz;
import com.yc.tc.tingche.biz.indexBiz;

@Controller
public class IndexAction {
	
	@Resource
	private  ParkMapper pmapper;
	@Resource
	private indexBiz  ibiz;

	//去首登录页面
			@GetMapping("touIndex.html")
			public String touindex() {
				return "uindex";
			}

/****************管理员页面     开始****************/
	
	//去管理员首页
	@GetMapping(path= {"admin","admin.html"})
	public String AdIndex() {
		return "admin/index";
	}
	
	
	
	
	//管理员车辆入库页面
	@GetMapping("inpart.html")
	public String AdInpart(String garage,Model m,@RequestParam(defaultValue = "1")int page) {
		PageHelper.startPage(page,5);
		int num=ibiz.selectnumBypark(garage);
		pmapper.selectByNew(garage);
		List<Park> pp=pmapper.selectByNew(garage);
		m.addAttribute("garaged",garage);
		m.addAttribute("num",num);
		m.addAttribute("plist",pp);
		
		return "admin/inpart";
	}
	//管理员入车库操作
	@GetMapping("adinpartX")
	public String adinpartX(User user ,Park p,Model m) {
		
		
		m.addAttribute("num_ued");
		return "admin/inpart";
	}
	
	
	//管理员停车
	@PostMapping("ting.do")
	public String ting(User user,Model m) {
		
		
		
		
		return "admin/inpart";
	}
	
	
	
	//管理员去后台车辆出库页面
	@GetMapping("outpart.html")
	public String AdOutpart() {
		return "admin/outpart";
	}
	//管理员后台车辆出库
		@PostMapping("outpart")
		public String toAdOutpart(Orders no,Model m) throws BizException{
		
		String	plate_num=	no.getPlate_num();
			//根据车牌查到order
			Orders o=ibiz.OselectBynum(plate_num);
			if(o!=null) {
			//根据order里的uid查user
			Integer uid=o.getUser_id();
			User u=ibiz.UselectBynum(uid);
			//根据order里的pid查park
			Integer pid=o.getPark_id();
			Park p=ibiz.PselectBynum(pid);
		 
			m.addAttribute("oselct",o);
			
			m.addAttribute("uselct",u);
		
			m.addAttribute("pselct",p);
			
			}
			return "admin/outpart";
		}
	
	
	
	
	

	
/****************用户端 ****************/
		
		//去用户首页
				@GetMapping(path= {"user","index.html"})
				public String Index() {
					return "udindex";
				}
				
				//管理员车辆入库页面
				@GetMapping("uinpart.html")
				public String Inpart(String garage,Model m,@RequestParam(defaultValue = "1")int page) {
					PageHelper.startPage(page,5);
					int num=ibiz.selectnumBypark(garage);
					pmapper.selectByNew(garage);
					List<Park> pp=pmapper.selectByNew(garage);
					m.addAttribute("garaged",garage);
					m.addAttribute("num",num);
					m.addAttribute("plist",pp);
					
					return "uinpart";
				}
		
		//用户去后台车辆出库页面
		@GetMapping("uoutpart.html")
		public String Outpart(Model m,HttpSession session) throws BizException{
			if(session.getAttribute("logined")!=null) {
			User dbuser= (User) session.getAttribute("logined");
			
			//根据车牌查到order
			String plate_num=dbuser.getPlate_num();
			
			
			Orders o=ibiz.OselectBynum(plate_num);
			if(o!=null) {
			System.out.println(o.toString());
			//根据order里的pid查park
			Integer pid=o.getPark_id();
			System.out.println("okok");
			Park p=ibiz.PselectBynum(pid);
		
			m.addAttribute("oselct",o);
			
			m.addAttribute("uselct",dbuser);
		
			m.addAttribute("pselct",p);
			}
			return "uoutpart";
			}

			return "uoutpart";
		}
	
}
