package com.zxr.entity;

public class SysUserMenuMapping {
    private Long sysUserMenuMappingId;

    private Long sysMenuid;

    private Long sysUserid;

    private String enable;

    public Long getSysUserMenuMappingId() {
        return sysUserMenuMappingId;
    }

    public void setSysUserMenuMappingId(Long sysUserMenuMappingId) {
        this.sysUserMenuMappingId = sysUserMenuMappingId;
    }

    public Long getSysMenuid() {
        return sysMenuid;
    }

    public void setSysMenuid(Long sysMenuid) {
        this.sysMenuid = sysMenuid;
    }

    public Long getSysUserid() {
        return sysUserid;
    }

    public void setSysUserid(Long sysUserid) {
        this.sysUserid = sysUserid;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }
}