package com.catCake.cakeonline.admin.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="adminlogin")
public class Login {
	private int id ;
	private String time ;
	private Admin user ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="loginId")
	public int getUserId() {
		return id;
	}
	public void setUserId(int userId) {
		this.id = userId;
	}
	@Column(name="time",nullable = false)
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@ManyToOne
	@JoinColumn(name="adminId")
	public Admin getUser() {
		return user;
	}
	public void setUser(Admin user) {
		this.user = user;
	}
}
