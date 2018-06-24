package com.zxr.entity;

import java.util.Date;

public class SysMenu {
    private Long sysMenuId;

    private String meunCode;

    private String parentMenuCode;

    private String meunName;

    private String fa;

    private Integer sortIndex;

    private String enable;

    private Date timestamp;

    public Long getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(Long sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public String getMeunCode() {
        return meunCode;
    }

    public void setMeunCode(String meunCode) {
        this.meunCode = meunCode == null ? null : meunCode.trim();
    }

    public String getParentMenuCode() {
        return parentMenuCode;
    }

    public void setParentMenuCode(String parentMenuCode) {
        this.parentMenuCode = parentMenuCode == null ? null : parentMenuCode.trim();
    }

    public String getMeunName() {
        return meunName;
    }

    public void setMeunName(String meunName) {
        this.meunName = meunName == null ? null : meunName.trim();
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa == null ? null : fa.trim();
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
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