package com.zxr.shiro.realm;

import com.zxr.entity.SysUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

public class LoginRealm extends AuthorizingRealm {

//	@Autowired
//	private SysUserService sysUserServiceImpl;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		Object relo = principals.getPrimaryPrincipal();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(relo);

		//从数据库取得角色
		Set<String> roles = new HashSet<>();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		return info;
	}

	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;

		String username = upToken.getUsername();
		String password = new String(upToken.getPassword());

		try {
			SysUser sysUser = new SysUser();
			sysUser.setUserName(username);
			sysUser.setPassword(password);

			//从数据库查询记录
			//sysUser = sysUserServiceImpl.selectFirst(sysUser);
			sysUser.setSysUserId(1L);
			sysUser.setEnable("1");
			String realmName = getName();

			if (sysUser == null) {
				throw new IncorrectCredentialsException();
			}

			//TODO
			if (!"admin@qq.com" .equals(sysUser.getUserName())) {
				throw new UnknownAccountException();
			}

			if ("1".equals(sysUser.getEnable())) {
				return new SimpleAuthenticationInfo(sysUser, sysUser.getPassword(), realmName);
			} else {
				throw new LockedAccountException();
			}
		} catch (Exception ex) {
			throw new AuthenticationException();
		}
	}
}
