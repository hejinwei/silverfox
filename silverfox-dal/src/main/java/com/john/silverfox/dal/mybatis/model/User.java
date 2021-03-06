package com.john.silverfox.dal.mybatis.model;

import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.id
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.username
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.password
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.is_valid
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private Boolean isValid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.created_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column users.updated_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.id
	 * @return  the value of users.id
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.id
	 * @param id  the value for users.id
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.username
	 * @return  the value of users.username
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.username
	 * @param username  the value for users.username
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.password
	 * @return  the value of users.password
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.password
	 * @param password  the value for users.password
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.is_valid
	 * @return  the value of users.is_valid
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public Boolean getIsValid() {
		return isValid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.is_valid
	 * @param isValid  the value for users.is_valid
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.created_at
	 * @return  the value of users.created_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.created_at
	 * @param createdAt  the value for users.created_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column users.updated_at
	 * @return  the value of users.updated_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column users.updated_at
	 * @param updatedAt  the value for users.updated_at
	 * @mbggenerated  Sun Jun 24 22:48:56 CST 2018
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}