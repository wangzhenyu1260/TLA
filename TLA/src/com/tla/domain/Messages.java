package com.tla.domain;

import java.sql.Timestamp;

/**
 * Messages entity. @author MyEclipse Persistence Tools
 */

public class Messages implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Teachingassistant teachingassistant;
	private Course course;
	private Teacher teacher;
	private String subject;
	private String content;
	private Timestamp datetime;

	// Constructors

	/** default constructor */
	public Messages() {
	}

	/** minimal constructor */
	public Messages(Teachingassistant teachingassistant, Course course,
			Teacher teacher, String subject, String content) {
		this.teachingassistant = teachingassistant;
		this.course = course;
		this.teacher = teacher;
		this.subject = subject;
		this.content = content;
	}

	/** full constructor */
	public Messages(Teachingassistant teachingassistant, Course course,
			Teacher teacher, String subject, String content, Timestamp datetime) {
		this.teachingassistant = teachingassistant;
		this.course = course;
		this.teacher = teacher;
		this.subject = subject;
		this.content = content;
		this.datetime = datetime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Teachingassistant getTeachingassistant() {
		return this.teachingassistant;
	}

	public void setTeachingassistant(Teachingassistant teachingassistant) {
		this.teachingassistant = teachingassistant;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

}