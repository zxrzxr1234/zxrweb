package com.zxr.dao.mapper;

import com.zxr.entity.SysMenubutton;
import com.zxr.entity.SysMenubuttonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenubuttonMapper {
    long countByExample(SysMenubuttonExample example);

    int deleteByExample(SysMenubuttonExample example);

    int deleteByPrimaryKey(Long sysMenubuttonId);

    int insert(SysMenubutton record);

    int insertSelective(SysMenubutton record);

    List<SysMenubutton> selectByExample(SysMenubuttonExample example);

    SysMenubutton selectByPrimaryKey(Long sysMenubuttonId);

    int updateByExampleSelective(@Param("record") SysMenubutton record, @Param("example") SysMenubuttonExample example);

    int updateByExample(@Param("record") SysMenubutton record, @Param("example") SysMenubuttonExample example);

    int updateByPrimaryKeySelective(SysMenubutton record);

    int updateByPrimaryKey(SysMenubutton record);
}