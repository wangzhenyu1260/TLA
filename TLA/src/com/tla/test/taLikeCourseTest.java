package com.tla.test;

import java.util.List;

import com.tla.domain.Course;
import com.tla.service.imp.LikeServiceImp;
import com.tla.service.inter.LikeServiceInter;

public class taLikeCourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LikeServiceInter service = new LikeServiceImp();
		List<Course> list = service.getTaLikeCourseByTaId("1");
		System.out.println(list.size());

	}

}
