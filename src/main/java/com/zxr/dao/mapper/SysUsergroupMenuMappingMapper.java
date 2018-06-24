package com.zxr.dao.mapper;

import com.zxr.entity.SysUsergroupMenuMapping;
import com.zxr.entity.SysUsergroupMenuMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsergroupMenuMappingMapper {
    long countByExample(SysUsergroupMenuMappingExample example);

    int deleteByExample(SysUsergroupMenuMappingExample example);

    int deleteByPrimaryKey(Long sysUsergroupMenuMappingId);

    int insert(SysUsergroupMenuMapping record);

    int insertSelective(SysUsergroupMenuMapping record);

    List<SysUsergroupMenuMapping> selectByExample(SysUsergroupMenuMappingExample example);

    SysUsergroupMenuMapping selectByPrimaryKey(Long sysUsergroupMenuMappingId);

    int updateByExampleSelective(@Param("record") SysUsergroupMenuMapping record, @Param("example") SysUsergroupMenuMappingExample example);

    int updateByExample(@Param("record") SysUsergroupMenuMapping record, @Param("example") SysUsergroupMenuMappingExample example);

    int updateByPrimaryKeySelective(SysUsergroupMenuMapping record);

    int updateByPrimaryKey(SysUsergroupMenuMapping record);
}