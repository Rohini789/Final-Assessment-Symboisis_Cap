package com.task.TaskSecond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Employee {
	
	
	@NotBlank(message="Name is not blank")
	private String Firstname;
	@NotBlank(message="lastname is not blank")
	private String lastname;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;

	private String department;
	
	@Email(message="email should be valid")
	private String email;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(String firstname, String lastname, int id, String department, String email) {
		super();
		Firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.department = department;
		this.email = email;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [Firstname=" + Firstname + ", lastname=" + lastname + ", id=" + id + ", department="
				+ department + ", email=" + email + "]";
	}
	
	
	
	
	

}
