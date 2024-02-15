package model;

import java.util.ArrayList;

public class Professor {

	private String firstName;
	private String lastName;
	private String email;
	private String subject;
	User user;
	
	ArrayList<String> professors = new ArrayList<String>();

	public Professor(String firstName, String lastName, String email, String subject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.subject = subject;
	}

	public Professor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Professor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
