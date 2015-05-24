package com.tla.domain;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Teacher teacher;
	private String name;
	private String instructor;
	private String timeVenue;
	private String favoriteTa;
	private String notes;
	private boolean like;

	// Constructors

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(Teacher teacher, String name, String instructor,
			String timeVenue) {
		this.teacher = teacher;
		this.name = name;
		this.instructor = instructor;
		this.timeVenue = timeVenue;
	}

	/** full constructor */
	public Course(Teacher teacher, String name, String instructor,
			String timeVenue, String favoriteTa, String notes) {
		this.teacher = teacher;
		this.name = name;
		this.instructor = instructor;
		this.timeVenue = timeVenue;
		this.favoriteTa = favoriteTa;
		this.notes = notes;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return this.instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getTimeVenue() {
		return this.timeVenue;
	}

	public void setTimeVenue(String timeVenue) {
		this.timeVenue = timeVenue;
	}

	public String getFavoriteTa() {
		return this.favoriteTa;
	}

	public void setFavoriteTa(String favoriteTa) {
		this.favoriteTa = favoriteTa;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}