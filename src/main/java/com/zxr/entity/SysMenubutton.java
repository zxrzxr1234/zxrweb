package com.zxr.entity;

import java.util.Date;

public class SysMenubutton {
    private Long sysMenubuttonId;

    private Long sysMenuId;

    private String buttonName;

    private String buttonCode;

    private String fa;

    private String className;

    private String html;

    private Integer sortIndex;

    private String enable;

    private Date timestamp;

    public Long getSysMenubuttonId() {
        return sysMenubuttonId;
    }

    public void setSysMenubuttonId(Long sysMenubuttonId) {
        this.sysMenubuttonId = sysMenubuttonId;
    }

    public Long getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(Long sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName == null ? null : buttonName.trim();
    }

    public String getButtonCode() {
        return buttonCode;
    }

    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode == null ? null : buttonCode.trim();
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa == null ? null : fa.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html == null ? null : html.trim();
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