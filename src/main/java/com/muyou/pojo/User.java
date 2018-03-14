package com.muyou.pojo;

import java.io.Serializable;
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5994513031440108816L;

	private String userName;
	private String age;
	private String sal;
	private String clikse;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getClikse() {
		return clikse;
	}
	public void setClikse(String clikse) {
		this.clikse = clikse;
	}
	
	
}
