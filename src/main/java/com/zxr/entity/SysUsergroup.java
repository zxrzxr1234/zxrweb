package com.zxr.entity;

import java.util.Date;

public class SysUsergroup {
    private Long sysUsergroupId;

    private Long sysDepartmentId;

    private String groupCode;

    private String groupName;

    private String enable;

    private Date timestamp;

    public Long getSysUsergroupId() {
        return sysUsergroupId;
    }

    public void setSysUsergroupId(Long sysUsergroupId) {
        this.sysUsergroupId = sysUsergroupId;
    }

    public Long getSysDepartmentId() {
        return sysDepartmentId;
    }

    public void setSysDepartmentId(Long sysDepartmentId) {
        this.sysDepartmentId = sysDepartmentId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}