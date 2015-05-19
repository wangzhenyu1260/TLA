package com.tla.service.imp;

import com.tla.domain.Users;
import com.tla.service.inter.UsersServiceInter;

public class UsersServiceImp extends BaseServiceImp implements UsersServiceInter{

	@Override
	public Object checkUser(Users user) {
		// TODO Auto-generated method stub
		Object obj = null;
		if(user.getType().equals("secretary")){
			String hql = "from Secretary where account=? and password=?";
			String parameters[]={user.getUsername(),user.getPassword()};
			obj = getUniqueObject(hql, parameters);
		}
		else if(user.getType().equals("teacher")){
			String hql = "from Teacher where account=? and password=?";
			String parameters[]={user.getUsername(),user.getPassword()};
			obj = getUniqueObject(hql, parameters);
		}
		else if(user.getType().equals("ta")){
			String hql = "from Teachingassistant where account=? and password=?";
			String parameters[]={user.getUsername(),user.getPassword()};
			obj = getUniqueObject(hql, parameters);
		}
		return obj;
		
		
	}

	@Override
	public Object checkUser(String username, String type) {
		// TODO Auto-generated method stub
		Object obj = null;
		if(type.equals("secretary")){
			String hql = "from Secretary where account=?";
			String parameters[]={username};
			obj = getUniqueObject(hql, parameters);
		}else if(type.equals("teacher")){
			String hql = "from Teacher where account=?";
			String parameters[]={username};
			obj = getUniqueObject(hql, parameters);
		}else if(type.equals("ta")){
			String hql = "from Teachingassistant where account=?";
			String parameters[]={username};
			obj = getUniqueObject(hql, parameters);
		}
		return obj;
	}

	@Override
	public boolean changePwd(String role, String newPwd, String id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(role.equals("secretary")){
			String hql = "update Secretary set password=? where id=?";
			String parameters[]={newPwd,id};
			flag = updateObject(hql, parameters);
		}else if(role.equals("teacher")){
			String hql = "update Teacher set password=? where id=?";
			String parameters[]={newPwd,id};
			flag =  updateObject(hql, parameters);
		}else if(role.equals("ta")){
			String hql = "update Teachingassistant set password=? where id=?";
			String parameters[]={newPwd,id};
			flag = updateObject(hql, parameters);
		}
		return flag;
	}

	

}
