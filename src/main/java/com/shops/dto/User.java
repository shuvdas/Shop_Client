package com.shops.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "sys", name = "USERDATA")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequence")
	@SequenceGenerator(name = "userSequence", sequenceName = "sys.userdata_seq", allocationSize = 1)
	@Column(name = "userid")
	private Long userid;
	
	@Column(name = "name")
	private String username;
	
	@Column(name = "pincode")
	private int pincode;
	
	@Column(name = "emailid")
	private String email;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Long userid, String username, int pincode, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.pincode = pincode;
		this.email = email;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUserid() {
		return userid;
	}
	
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", pincode=" + pincode + ", email=" + email + "]";
	}
	
	
	
	

}
