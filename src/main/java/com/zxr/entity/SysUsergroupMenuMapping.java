package com.zxr.entity;

public class SysUsergroupMenuMapping {
    private Long sysUsergroupMenuMappingId;

    private Long sysMenuId;

    private Long sysUsergroupId;

    private String enable;

    public Long getSysUsergroupMenuMappingId() {
        return sysUsergroupMenuMappingId;
    }

    public void setSysUsergroupMenuMappingId(Long sysUsergroupMenuMappingId) {
        this.sysUsergroupMenuMappingId = sysUsergroupMenuMappingId;
    }

    public Long getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(Long sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public Long getSysUsergroupId() {
        return sysUsergroupId;
    }

    public void setSysUsergroupId(Long sysUsergroupId) {
        this.sysUsergroupId = sysUsergroupId;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }
}