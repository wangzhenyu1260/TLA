package com.tla.service.inter;

import java.util.List;

import com.tla.domain.TaLikeCourse;

public interface LikeServiceInter extends BaseInterface {
	
	public List<TaLikeCourse> getTaLikeCourseByTaId(String tid);
	
	public boolean removeTaLikeCourse(String tid, String cid);

}
