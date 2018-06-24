package com.zxr.dao.mapper;

import com.zxr.entity.SysUsergroup;
import com.zxr.entity.SysUsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsergroupMapper {
    long countByExample(SysUsergroupExample example);

    int deleteByExample(SysUsergroupExample example);

    int deleteByPrimaryKey(Long sysUsergroupId);

    int insert(SysUsergroup record);

    int insertSelective(SysUsergroup record);

    List<SysUsergroup> selectByExample(SysUsergroupExample example);

    SysUsergroup selectByPrimaryKey(Long sysUsergroupId);

    int updateByExampleSelective(@Param("record") SysUsergroup record, @Param("example") SysUsergroupExample example);

    int updateByExample(@Param("record") SysUsergroup record, @Param("example") SysUsergroupExample example);

    int updateByPrimaryKeySelective(SysUsergroup record);

    int updateByPrimaryKey(SysUsergroup record);
}