package com.tla.domain;

/**
 * Teachingassistant entity. @author MyEclipse Persistence Tools
 */

public class Teachingassistant implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String account;
	private String password;
	private String name;
	private String email;
	private String phone;

	// Constructors

	/** default constructor */
	public Teachingassistant() {
	}

	/** full constructor */
	public Teachingassistant(String account, String password, String name,
			String email, String phone) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}