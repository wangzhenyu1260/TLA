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
	private String ta;
	private String taId;
	private boolean haveTa;
	private String recommendTA;

	// Constructors

	public String getRecommendTA() {
		return recommendTA;
	}

	public void setRecommendTA(String recommendTA) {
		this.recommendTA = recommendTA;
	}

	public String getTaId() {
		return taId;
	}

	public void setTaId(String taId) {
		this.taId = taId;
	}

	public boolean isHaveTa() {
		return haveTa;
	}

	public void setHaveTa(boolean haveTa) {
		this.haveTa = haveTa;
	}

	public String getTa() {
		return ta;
	}

	public void setTa(String ta) {
		this.ta = ta;
	}

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