package com.catCake.cakeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userIdea")
public class UserIdea {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String userName ;
	private String userEmail ;
	private String userPhone ;
	private String userIdea ;
	
	@Column(name="userName")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="userEmail")
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Column(name="userPhone")
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Column(name="userIdea")
	public String getUserIdea() {
		return userIdea;
	}
	public void setUserIdea(String userIdea) {
		this.userIdea = userIdea;
	}
}
