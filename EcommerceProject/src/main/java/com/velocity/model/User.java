package com.velocity.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String realName;
	private String password;
	private String gender;
	private Date birthday;
	private String userType;
	
	 @OneToMany(mappedBy = "userId")
		private List<Orders> orderlist;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public List<Orders> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(List<Orders> orderlist) {
		this.orderlist = orderlist;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", realName=" + realName + ", password=" + password
				+ ", gender=" + gender + ", birthday=" + birthday + ", userType=" + userType + "]";
	}
	
	



}
