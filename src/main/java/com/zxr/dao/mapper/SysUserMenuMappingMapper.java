package com.zxr.dao.mapper;

import com.zxr.entity.SysUserMenuMapping;
import com.zxr.entity.SysUserMenuMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMenuMappingMapper {
    long countByExample(SysUserMenuMappingExample example);

    int deleteByExample(SysUserMenuMappingExample example);

    int deleteByPrimaryKey(Long sysUserMenuMappingId);

    int insert(SysUserMenuMapping record);

    int insertSelective(SysUserMenuMapping record);

    List<SysUserMenuMapping> selectByExample(SysUserMenuMappingExample example);

    SysUserMenuMapping selectByPrimaryKey(Long sysUserMenuMappingId);

    int updateByExampleSelective(@Param("record") SysUserMenuMapping record, @Param("example") SysUserMenuMappingExample example);

    int updateByExample(@Param("record") SysUserMenuMapping record, @Param("example") SysUserMenuMappingExample example);

    int updateByPrimaryKeySelective(SysUserMenuMapping record);

    int updateByPrimaryKey(SysUserMenuMapping record);
}