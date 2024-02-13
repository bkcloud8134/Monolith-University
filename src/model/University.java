package model;

import java.util.ArrayList;

public interface University {

	public ArrayList<String> viewStudents();

	public ArrayList<String> viewProfessors();

	public ArrayList<String> viewSchools();

	public ArrayList<String> viewMajors();

	public ArrayList<String> viewClasses();
	
	public enum schools {Medicine, Engineering, Law};

}
