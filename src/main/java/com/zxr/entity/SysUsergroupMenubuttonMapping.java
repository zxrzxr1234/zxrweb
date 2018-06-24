package com.zxr.entity;

public class SysUsergroupMenubuttonMapping {
    private Long sysUsergroupMenubuttonMappingId;

    private Long sysUsegroupId;

    private Long sysMenubuttonId;

    private String enable;

    public Long getSysUsergroupMenubuttonMappingId() {
        return sysUsergroupMenubuttonMappingId;
    }

    public void setSysUsergroupMenubuttonMappingId(Long sysUsergroupMenubuttonMappingId) {
        this.sysUsergroupMenubuttonMappingId = sysUsergroupMenubuttonMappingId;
    }

    public Long getSysUsegroupId() {
        return sysUsegroupId;
    }

    public void setSysUsegroupId(Long sysUsegroupId) {
        this.sysUsegroupId = sysUsegroupId;
    }

    public Long getSysMenubuttonId() {
        return sysMenubuttonId;
    }

    public void setSysMenubuttonId(Long sysMenubuttonId) {
        this.sysMenubuttonId = sysMenubuttonId;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }
}