package com.tla.service.imp;

import java.util.List;

import com.tla.domain.Teacher;
import com.tla.service.inter.DefaultSettings;
import com.tla.service.inter.TeacherServiceInter;
import com.tla.util.HibernateUtil;

public class TeacherServiceImp extends BaseServiceImp implements TeacherServiceInter{

	@Override
	public Teacher getUniqueTeacherByName(String name) {
		String hql="from Teacher where name=?";
		String[] parameters={name};
		try {
			Teacher t=(Teacher) getUniqueObject(hql, parameters);
			return t;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Teacher> getTeachers() {
		String hql = "from Teacher";
		try{
			List<Teacher> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteTeacher(String id) {
		String hql = "delete Teacher where id=?";
		String[] parameters={id};
		try {
			HibernateUtil.executeUpdateOpenInView(hql, parameters);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean resetTeacher(String id) {
		String hql = "update Teacher set password=? where id=?";
		String[] parameters={DefaultSettings.defaultPassword,id};
		try {
			HibernateUtil.executeUpdateOpenInView(hql, parameters);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean checkAccount(String account) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String hql = "from Teacher where account=?";
		String[] parameters={account};
		try {
			Object obj = getUniqueObject(hql, parameters);
			if(obj==null){
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Teacher getUniqueTeacherById(String id) {
		String hql="from Teacher where id=?";
		String[] parameters={id};
		try {
			Teacher t=(Teacher) getUniqueObject(hql, parameters);
			return t;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<String> getTeachersNameList() {
		String hql = "select name from Teacher";
		try{
			List<String> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
