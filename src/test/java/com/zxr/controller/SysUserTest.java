package com.zxr.controller;

import com.zxr.MainApplication;
import com.zxr.dao.mapper.SysUserMapper;
import com.zxr.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MainApplication.class)// 指定spring-boot的启动类
public class SysUserTest {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void getSysUser(){
        SysUser sysUser= sysUserMapper.selectByPrimaryKey(1L);
        System.out.println(sysUser);

    }
}
