package com.zxr.dao.mapper;

import com.zxr.entity.SysUsergroupMenubuttonMapping;
import com.zxr.entity.SysUsergroupMenubuttonMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsergroupMenubuttonMappingMapper {
    long countByExample(SysUsergroupMenubuttonMappingExample example);

    int deleteByExample(SysUsergroupMenubuttonMappingExample example);

    int deleteByPrimaryKey(Long sysUsergroupMenubuttonMappingId);

    int insert(SysUsergroupMenubuttonMapping record);

    int insertSelective(SysUsergroupMenubuttonMapping record);

    List<SysUsergroupMenubuttonMapping> selectByExample(SysUsergroupMenubuttonMappingExample example);

    SysUsergroupMenubuttonMapping selectByPrimaryKey(Long sysUsergroupMenubuttonMappingId);

    int updateByExampleSelective(@Param("record") SysUsergroupMenubuttonMapping record, @Param("example") SysUsergroupMenubuttonMappingExample example);

    int updateByExample(@Param("record") SysUsergroupMenubuttonMapping record, @Param("example") SysUsergroupMenubuttonMappingExample example);

    int updateByPrimaryKeySelective(SysUsergroupMenubuttonMapping record);

    int updateByPrimaryKey(SysUsergroupMenubuttonMapping record);
}