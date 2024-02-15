package model;

import java.util.ArrayList;

import model.University.schools;

public class Course {

	private String courseName;
	private int creditHours;
	schools school;
	Course course;

	ArrayList<String> courses = new ArrayList<String>();

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	private String name;
	private String courseCode;

	public String getName() {
		return name;
	}

	public Course(String name, String courseCode, int creditHours) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.creditHours = creditHours;
	}

	public Course(String name, String courseCode, int creditHours, schools school) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.creditHours = creditHours;
		this.school = school;
	}

	public Course(String name, String courseCode, int creditHours, schools school, Course course) {
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
