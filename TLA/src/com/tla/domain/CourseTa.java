package com.tla.domain;

/**
 * CourseTa entity. @author MyEclipse Persistence Tools
 */

public class CourseTa implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Course course;
	private Teachingassistant teachingassistant;

	// Constructors

	/** default constructor */
	public CourseTa() {
	}

	/** full constructor */
	public CourseTa(Course course, Teachingassistant teachingassistant) {
		this.course = course;
		this.teachingassistant = teachingassistant;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teachingassistant getTeachingassistant() {
		return this.teachingassistant;
	}

	public void setTeachingassistant(Teachingassistant teachingassistant) {
		this.teachingassistant = teachingassistant;
	}

}