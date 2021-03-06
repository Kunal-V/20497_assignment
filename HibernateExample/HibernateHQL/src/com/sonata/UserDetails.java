package com.sonata;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "getUserDetails.byId" , query = "from UserDetails where userId = ?")
@NamedNativeQuery(name = "getUserDetails.byName" , query = "select * from userdetails" , resultClass = UserDetails.class)
public class UserDetails {
	@Id
	private String userName;
	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
