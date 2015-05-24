package com.tla.service.imp;

import java.util.List;

import com.tla.domain.Course;
import com.tla.domain.TaLikeCourse;
import com.tla.service.inter.LikeServiceInter;
import com.tla.util.HibernateUtil;

public class LikeServiceImp extends BaseServiceImp implements LikeServiceInter{

	@Override
	public List<TaLikeCourse> getTaLikeCourseByTaId(String tid) {
		String hql = "from TaLikeCourse where teachingassistant.id=?";
		String[] parameters={tid};
		try{
			List<TaLikeCourse> list = getListObject(hql, parameters);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean removeTaLikeCourse(String tid, String cid) {
		String hql = "delete TaLikeCourse where Teachingassistant.id=? and Course.id=?";
		String[] parameters={tid,cid};
		try {
			HibernateUtil.executeUpdateOpenInView(hql, parameters);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
