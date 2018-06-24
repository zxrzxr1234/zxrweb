package com.zxr.dao.mapper;

import com.zxr.entity.SysUserGroupMapping;
import com.zxr.entity.SysUserGroupMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserGroupMappingMapper {
    long countByExample(SysUserGroupMappingExample example);

    int deleteByExample(SysUserGroupMappingExample example);

    int deleteByPrimaryKey(Long sysUserGroupMappingId);

    int insert(SysUserGroupMapping record);

    int insertSelective(SysUserGroupMapping record);

    List<SysUserGroupMapping> selectByExample(SysUserGroupMappingExample example);

    SysUserGroupMapping selectByPrimaryKey(Long sysUserGroupMappingId);

    int updateByExampleSelective(@Param("record") SysUserGroupMapping record, @Param("example") SysUserGroupMappingExample example);

    int updateByExample(@Param("record") SysUserGroupMapping record, @Param("example") SysUserGroupMappingExample example);

    int updateByPrimaryKeySelective(SysUserGroupMapping record);

    int updateByPrimaryKey(SysUserGroupMapping record);
}