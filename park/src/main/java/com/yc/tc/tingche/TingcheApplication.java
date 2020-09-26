package com.yc.tc.tingche;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * mubaits命名空间注册
 * @author lenovo
 *
 */
@MapperScan("com.yc.tc.tingche.dao")
public class TingcheApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(TingcheApplication.class, args);
	}

	
}
