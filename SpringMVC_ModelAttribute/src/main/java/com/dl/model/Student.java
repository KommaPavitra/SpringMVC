package com.dl.model;

public class Student {
	private Integer id;
	private String firstName;
	private String lastName;
	private Long contact;
	private String location;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student(Integer id, String firstName, String lastName, Long contact, String location) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.location = location;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact
				+ ", location=" + location + "]";
	}
	

}
