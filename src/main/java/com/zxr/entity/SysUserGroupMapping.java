package com.zxr.entity;

public class SysUserGroupMapping {
    private Long sysUserGroupMappingId;

    private Long sysUserGroupId;

    private Long sysUserId;

    private String enable;

    public Long getSysUserGroupMappingId() {
        return sysUserGroupMappingId;
    }

    public void setSysUserGroupMappingId(Long sysUserGroupMappingId) {
        this.sysUserGroupMappingId = sysUserGroupMappingId;
    }

    public Long getSysUserGroupId() {
        return sysUserGroupId;
    }

    public void setSysUserGroupId(Long sysUserGroupId) {
        this.sysUserGroupId = sysUserGroupId;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }
}