package com.tla.service.inter;

import com.tla.domain.Users;

public interface UsersServiceInter {

	public Object checkUser(Users user);

	public Object checkUser(String username, String type);

	public boolean changePwd(String role, String newPwd, String id);

}
