package com.cts.stock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="User")


@NamedQueries(
		{
		@NamedQuery(name="findAllUser",query="from User U"),
		
		@NamedQuery(name="findUserById",query="from User U where U.userId=:Id")
		}
		
		)



public class User {

	
	
	
	
	
	@Column(name="username")
	private String username;
	
	@Id
	@Column(name="userId")
	private int userId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userType")
	private String usertype;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="confirm")
	private String confirm;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userId=" + userId + ", password=" + password + ", usertype=" + usertype
				+ ", email=" + email + ", mobile=" + mobile + ", confirm=" + confirm + "]";
	}

	

	
}