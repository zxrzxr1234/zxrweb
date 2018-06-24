package com.zxr.dao.jpa;

import com.zxr.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Long>{
}
