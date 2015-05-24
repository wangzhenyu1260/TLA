package com.tla.service.inter;

import java.util.List;

import com.tla.domain.Course;

public interface CourseServiceInter extends BaseInterface {

	public Course getUniqueCourseByName(String name);

	public List<Course> getCourses();
	
	public List<Course> getCoursesByTeacherId(String id);

	public List<String> getCoursesNameList();

	public boolean deleteCourse(String id);

	public boolean checkName(String name);

	public Course getUniqueCourseById(String id);

}
