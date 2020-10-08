package com.yc.tc.tingche.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.yc.tc.tingche.bean.Park;

import com.yc.tc.tingche.dao.ParkMapper;


@Service
public class ParkBiz {
	@Resource
	private ParkMapper pmpper;
	
	//展示车位
	public List<Park> selectOr(Park p) {
		List<Park> o=pmpper.selectByW(p);
		if(o.size()==0) {
			System.out.println("没有相关车位");
		}
		return o;
		
	}
	
	public void updateOr(Park p) {
		
		 pmpper.updateByw(p);
		 System.out.println("修改完成？");
		return;
	}
	
	

	

}
