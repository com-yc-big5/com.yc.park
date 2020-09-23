package com.yc.tc.tingche;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yc.tc.tingche.bean.User;
import com.yc.tc.tingche.biz.UserBiz;
import com.yc.tc.tingche.dao.UserMapper;



@SpringBootTest
class TingcheApplicationTests {
	
	@Resource
	private UserMapper userMapper;
	
	@Test
	void contextLoads() {
	}
	
	
	
}
