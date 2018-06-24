package com.zxr.entity;

public class SysDepartment {
    private Long sysDepartmentId;

    private String departmentCode;

    private String departmentName;

    public Long getSysDepartmentId() {
        return sysDepartmentId;
    }

    public void setSysDepartmentId(Long sysDepartmentId) {
        this.sysDepartmentId = sysDepartmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }
}