package com.User.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uid;
	private String fullname;
	private String email;
	private Long mobileno;
	private String username;
	private String password;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(int uid, String fullname, String email, Long mobileno, String username, String password) {
		super();
		this.uid = uid;
		this.fullname = fullname;
		this.email = email;
		this.mobileno = mobileno;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fullname=" + fullname + ", email=" + email + ", mobileno=" + mobileno
				+ ", username=" + username + ", password=" + password + "]";
	}
	
}