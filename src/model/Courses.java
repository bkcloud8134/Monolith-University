package model;

import model.University.schools;

public class Courses {

	private String name;
	private String courseCode;

	public String getName() {
		return name;
	}

	public Courses(String name, String courseCode, int creditHours) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.creditHours = creditHours;
	}

	public Courses(String name, String courseCode, int creditHours, schools school) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.creditHours = creditHours;
		this.school = school;
	}

	public Courses(String name, String courseCode, int creditHours, schools school, Courses courses) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.creditHours = creditHours;
		this.school = school;
		this.courses = courses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	private int creditHours;
	schools school;
	Courses courses;

}
