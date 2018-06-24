package com.zxr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  com.zxr.entity.SysMenu;

@MapperScan("com.zxr.dao.mapper")
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		SpringApplication.run(MainApplication.class, args);
	}
}
