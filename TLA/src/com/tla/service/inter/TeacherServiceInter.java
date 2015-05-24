package com.tla.service.inter;

import java.util.List;

import com.tla.domain.Teacher;

public interface TeacherServiceInter extends BaseInterface {
	
	public Teacher getUniqueTeacherByName(String name);
	
	public List<Teacher> getTeachers();
	
	public List<String> getTeachersNameList();
	
	public boolean deleteTeacher(String id);
	
	public boolean resetTeacher(String id);
	
	public boolean checkAccount(String account);
	
	public Teacher getUniqueTeacherById(String id);

}
