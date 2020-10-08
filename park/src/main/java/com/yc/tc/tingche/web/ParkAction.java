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
import com.yc.tc.tingche.bean.Park;
import com.yc.tc.tingche.biz.ParkBiz;

@Controller
public class ParkAction {

	
	@Resource
	private ParkBiz pbiz;
	
	/********管理员************/
	//用户去车位
		@GetMapping("part.html")
		public String topaet() {
			return "admin/part";
		}
		
		//用户车位搜索
		@PostMapping("part.do")
		public String XPart(@Valid Park p, Model m,@RequestParam(defaultValue = "1")int page) {
			PageHelper.startPage(page,5);
			pbiz.selectOr(p);
			List<Park> pn=pbiz.selectOr(p);
			m.addAttribute("pnlist",pn);
			return "admin/part";
		}
		
		//车位修改
			@PostMapping("xpart.do")
			public String AdPart(@Valid Park p) {
				pbiz.updateOr(p);
				pbiz.updateOr(p);
				return "admin/part";
			}
			
			
		
}
