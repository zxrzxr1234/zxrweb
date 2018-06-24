package com.zxr.jpatest;

import com.zxr.MainApplication;
import com.zxr.dao.jpa.SysUserRepository;
import com.zxr.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=MainApplication.class)// 指定spring-boot的启动类

public class SysUserTest {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Test
    public void getSysUser(){
        Optional< SysUser> optional = sysUserRepository.findById(2L);
        if(!optional.isPresent()) return;
        System.out.println(optional.get());
    }

    @Test
    public void getPageSysUser(){
        //创建查询条件数据对象
        SysUser sysUser = new SysUser();
        sysUser.setUserName("adm");

        //创建匹配器，即如何使用查询条件
        ExampleMatcher matcher = ExampleMatcher.matching() //构建对象
                .withMatcher("userName", ExampleMatcher.GenericPropertyMatchers.contains())
            //    .withIgnorePaths("focus") //忽略属性：是否关注。因为是基本类型，需要忽略掉
        ;

        //创建实例
        Example<SysUser> ex = Example.of(sysUser, matcher);

        //查询
        List<SysUser> sysUsers = sysUserRepository.findAll(ex);

        //输出结果
        System.out.println("数量："+sysUsers.size());
        for (SysUser bo:sysUsers)
        {
            System.out.println(bo.getCardNo());
        }

    }
}
