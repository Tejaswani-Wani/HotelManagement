package com.MiniProject.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class AdminPannel {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="emailId",nullable=false)
	private String emailId;
	
	@Column(name="number",nullable=false)
	private long  number;
	
	@Column(name="role", nullable=false)
	private String role;
	
	@Column(name="address",nullable = false)
	private String address;

	public AdminPannel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminPannel(long id, String name, String emailId, long number, String role, String address) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.number = number;
		this.role = role;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	}
 