package com.tla.service.imp;

import java.util.List;

import com.tla.domain.CourseTa;
import com.tla.service.inter.AssignServiceInter;

public class AssignServiceImp extends BaseServiceImp implements AssignServiceInter{

	@Override
	public List<CourseTa> getAssignTas() {
		String hql = "from CourseTa";
		try{
			List<CourseTa> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateCourseTa(String cid, String tid) {
		boolean flag = false;
		String hql = "update CourseTa set teachingassistant.id=? where course.id=?";
		String parameters[]={tid,cid};
		flag = updateObject(hql, parameters);
		return flag;
	}

	@Override
	public boolean checkCourseTa(String cid) {
		boolean flag = false;
		String hql = "from CourseTa where course.id=?";
		String[] parameters={cid};
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
	public List<CourseTa> getAssignTasByTeacherId(String tid) {
		String hql = "from CourseTa where course.teacher.id=?";
		String[] parameters={tid};
		try{
			List<CourseTa> list = getListObject(hql, parameters);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
