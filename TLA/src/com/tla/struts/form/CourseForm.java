/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.tla.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * MyEclipse Struts Creation date: 05-24-2015
 * 
 * XDoclet definition:
 * 
 * @struts.form name="courseForm"
 */
public class CourseForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String courseName;
	private String[] instructor;
	private String timeVenue;
	private String[] favoriteTA;
	private String notes;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String[] getInstructor() {
		return instructor;
	}

	public void setInstructor(String[] instructor) {
		this.instructor = instructor;
	}

	public String getTimeVenue() {
		return timeVenue;
	}

	public void setTimeVenue(String timeVenue) {
		this.timeVenue = timeVenue;
	}

	public String[] getFavoriteTA() {
		return favoriteTA;
	}

	public void setFavoriteTA(String[] favoriteTA) {
		this.favoriteTA = favoriteTA;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}