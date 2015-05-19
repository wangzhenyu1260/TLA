package com.tla.domain;

/**
 * Secretary entity. @author MyEclipse Persistence Tools
 */

public class Secretary implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String account;
	private String password;
	private String name;

	// Constructors

	/** default constructor */
	public Secretary() {
	}

	/** full constructor */
	public Secretary(String account, String password, String name) {
		this.account = account;
		this.password = password;
		this.name = name;
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

}