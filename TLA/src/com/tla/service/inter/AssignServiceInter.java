package com.tla.service.inter;

import java.util.List;

import com.tla.domain.CourseTa;

public interface AssignServiceInter extends BaseInterface {
	
	public List<CourseTa> getAssignTas();
	
	public List<CourseTa> getAssignTasByTeacherId(String tid);
	
	public boolean updateCourseTa(String cid, String tid);
	
	public boolean checkCourseTa(String cid);

}
