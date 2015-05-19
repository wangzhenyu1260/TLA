package com.tla.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tla.domain.Secretary;
import com.tla.domain.Teacher;
import com.tla.domain.Teachingassistant;
import com.tla.domain.Users;
import com.tla.service.imp.UsersServiceImp;
import com.tla.service.inter.UsersServiceInter;
import com.tla.util.SecurityUtil;


public class AutoLoginFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		HttpServletRequest request=(HttpServletRequest) arg0;
		HttpServletResponse response=(HttpServletResponse) arg1;
		//Check session whether userinfo is existent
		Object obj=request.getSession().getAttribute("userinfo");
		if(obj!=null){
            request.getRequestDispatcher("goMainUi.do").forward(request, response);
            return;    
        }
		//check cookie
		Cookie autoCookie=null;
		Cookie cookies[]=request.getCookies();
		if(cookies!=null){
			//traversal cookie
			 for (Cookie cookie : cookies) {
				 //check whether autologin tag is existent
				 if("tla_autologin".equals(cookie.getName())){
					 autoCookie=cookie;
				 }
			 }
			 if(autoCookie == null){
				 arg2.doFilter(request, response);
				 return;
			 }
			 
			 //System.out.println("+++++++++++"+autoCookie);
			 
			 //get cookie value
			 String value=autoCookie.getValue();
			 String temp[]=value.split(":");
			 //System.out.println("length::::::::;;"+temp.length);
			 //Check cookie length
	         if(temp.length!=4){
	        	 arg2.doFilter(request, response);
	             return;
	         }
	         String type=temp[0];
	         String username=temp[1];
	         String time=temp[2];
	         String service_md5Value=temp[3];
	         //System.out.println(Long.valueOf(time)+"-----Time------"+System.currentTimeMillis());
	         //Check cookie EXPIRY DATE
	         if(Long.valueOf(time)<=System.currentTimeMillis()){
	             arg2.doFilter(request, response);
	             return;
	         }
	         UsersServiceInter userServiceInter = new UsersServiceImp();
	         Object user = userServiceInter.checkUser(username, type);
	         Users tempUser = new Users();
	         
	         if(user==null){
	        	 arg2.doFilter(request, response);
	        	 return;
	         }
	         if(type.equals("secretary")){
	        	 Secretary sec = (Secretary)user;
	        	 tempUser.setType("secretary");
	        	 tempUser.setUsername(sec.getAccount());
	        	 tempUser.setPassword(sec.getPassword());
	        	 request.getSession().setAttribute("secretaryinfo", sec);
	         }else if(type.equals("teacher")){
	        	 Teacher teacher = (Teacher)user;
	        	 tempUser.setType("teacher");
	        	 tempUser.setUsername(teacher.getAccount());
	        	 tempUser.setPassword(teacher.getPassword());
	        	 request.getSession().setAttribute("teacherinfo", teacher);
	         }else if(type.equals("ta")){
	        	 Teachingassistant ta = (Teachingassistant)user;
	        	 tempUser.setType("ta");
	        	 tempUser.setUsername(ta.getAccount());
	        	 tempUser.setPassword(ta.getPassword());
	        	 request.getSession().setAttribute("TAinfo", ta);
	         }
	         String md5Temp=tempUser.getType()+":"+tempUser.getUsername()+":"+tempUser.getPassword()+":"+time;
	         if(!(SecurityUtil.MD5(md5Temp).equals(service_md5Value))){
	        	 arg2.doFilter(request, response);
	        	 return;
	         }
	         request.getSession().setAttribute("userinfo", tempUser);
	         request.getSession().setAttribute("role", type);
	         request.getRequestDispatcher("goMainUi.do").forward(request, response);
		}else{
			arg2.doFilter(request, response);
			return;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
