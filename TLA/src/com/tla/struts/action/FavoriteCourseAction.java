/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.tla.struts.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tla.domain.Course;
import com.tla.domain.TaLikeCourse;
import com.tla.domain.Teachingassistant;
import com.tla.service.imp.CourseServiceImp;
import com.tla.service.imp.LikeServiceImp;
import com.tla.service.inter.CourseServiceInter;
import com.tla.service.inter.LikeServiceInter;

/**
 * MyEclipse Struts Creation date: 05-24-2015
 * 
 * XDoclet definition:
 * 
 * @struts.action parameter="flag"
 */
public class FavoriteCourseAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward favoriteCourseUi(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		if (request.getSession().getAttribute("role").equals("ta")) {
			Teachingassistant ta = (Teachingassistant) request.getSession().getAttribute("TAinfo");
			// go to TA favorite course page
			// load data
			CourseServiceInter courseService = new CourseServiceImp();
			LikeServiceInter likeService = new LikeServiceImp();
			
			List<TaLikeCourse> taLikeCourseList = likeService.getTaLikeCourseByTaId(ta.getId().toString());
			List<Course> courseList = courseService.getCourses();
			
			HashMap<Integer, Course> map = new HashMap<>();
			for(int i=0;i<taLikeCourseList.size();i++){
				map.put(taLikeCourseList.get(i).getCourse().getId(), taLikeCourseList.get(i).getCourse());
			}
			List<Course> newCourseList = new ArrayList<>();
			
			for(int j=0;j<courseList.size();j++){
				Course co = new Course();
				co.setId(courseList.get(j).getId());
				co.setName(courseList.get(j).getName());
				co.setInstructor(courseList.get(j).getInstructor());
				co.setTimeVenue(courseList.get(j).getTimeVenue());
				if(map.containsKey(courseList.get(j).getId())){
					co.setLike(true);
				}else{
					co.setLike(false);
				}
				newCourseList.add(co);
			}
			
			
			request.setAttribute("courseList", newCourseList);
			// redirection
			return mapping.findForward("goFavoriteCourseUi");
		} else {
			request.setAttribute("msg", "ERROR: Permission denied.");
			return mapping.findForward("goLogin");
		}
	}
	
	public ActionForward addFavoriteCourse(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		if (request.getSession().getAttribute("role").equals("ta")) {
			// add TA favorite course
			// get data
			String cid = request.getParameter("cid");
			Teachingassistant ta = (Teachingassistant) request.getSession().getAttribute("TAinfo");
			
			LikeServiceInter likeService = new LikeServiceImp();
			CourseServiceInter courseService = new CourseServiceImp();
			TaLikeCourse like = new TaLikeCourse();
			like.setTeachingassistant(ta);
			like.setCourse(courseService.getUniqueCourseById(cid));
			if(likeService.saveObject(like)){
				request.setAttribute("LikeOperation", "success");
			}else{
				request.setAttribute("LikeOperation", "error");
			}
			// redirection
			return new ActionForward("/favoriteCourse.do?flag=favoriteCourseUi");
		} else {
			request.setAttribute("msg", "ERROR: Permission denied.");
			return mapping.findForward("goLogin");
		}
	}
	
	public ActionForward removeFavoriteCourse(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		if (request.getSession().getAttribute("role").equals("ta")) {
			// add TA favorite course
			// get data
			String cid = request.getParameter("cid");
			Teachingassistant ta = (Teachingassistant) request.getSession().getAttribute("TAinfo");
			
			LikeServiceInter likeService = new LikeServiceImp();
			if(likeService.removeTaLikeCourse(ta.getId()+"", cid)){
				request.setAttribute("LikeOperation", "success");
			}else{
				request.setAttribute("LikeOperation", "error");
			}
			// redirection
			return new ActionForward("/favoriteCourse.do?flag=favoriteCourseUi");
		} else {
			request.setAttribute("msg", "ERROR: Permission denied.");
			return mapping.findForward("goLogin");
		}
	}
}