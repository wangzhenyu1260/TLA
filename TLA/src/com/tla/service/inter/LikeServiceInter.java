package com.tla.service.inter;

import java.util.List;

import com.tla.domain.Course;

public interface LikeServiceInter extends BaseInterface {
	
	public List<Course> getTaLikeCourseByTaId(String tid);
	
	public boolean removeTaLikeCourse(String tid, String cid);

}
