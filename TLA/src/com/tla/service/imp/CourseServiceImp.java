package com.tla.service.imp;

import java.util.List;

import com.tla.domain.Course;
import com.tla.service.inter.CourseServiceInter;
import com.tla.util.HibernateUtil;

public class CourseServiceImp extends BaseServiceImp implements CourseServiceInter{

	@Override
	public Course getUniqueCourseByName(String name) {
		String hql="from Course where name=?";
		String[] parameters={name};
		try {
			Course c=(Course) getUniqueObject(hql, parameters);
			return c;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Course> getCourses() {
		String hql = "from Course";
		try{
			List<Course> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<String> getCoursesNameList() {
		String hql = "select name from Course";
		try{
			List<String> list = getListObject(hql, null);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteCourse(String id) {
		String hql = "delete Course where id=?";
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
	public boolean checkName(String name) {
		boolean flag = false;
		String hql = "from Course where name=?";
		String[] parameters={name};
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
	public Course getUniqueCourseById(String id) {
		String hql="from Course where id=?";
		String[] parameters={id};
		try {
			Course c=(Course) getUniqueObject(hql, parameters);
			return c;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<Course> getCoursesByTeacherId(String id) {
		String hql = "from Course where teacher.id=?";
		String[] parameters={id};
		try{
			List<Course> list = getListObject(hql, parameters);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
