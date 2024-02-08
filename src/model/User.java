package model;

public class User {

	private User userType;
	private String userName;
	
	public User getUserType() {
		return userType;
	}
	public void setUserType(User userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
}
