package com.yc.tc.tingche.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexAction {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
