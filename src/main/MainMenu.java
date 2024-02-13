package main;

import java.util.Scanner;

import model.User;

public class MainMenu {
	
	protected MainMenu mainMenu;
	static Scanner scan = new Scanner(System.in);
	
	public MainMenu() {
		this.mainMenu = mainMenu;
	}
	
	/*
	 * The main menu to the application. 
	 * 	Starts off with greeting, then prompts user to log in, or register if new user.
	 */
	public  void startMainMenu() {
		initiateGreeting();
		signIn();
	}
	
	// A greeting to the user accessing the application.
	public void initiateGreeting () {
		System.out.println("Welcome to Monolith University");
	}
	
	// Gathers data from user and proceeds to next screen.
	public void signIn() {
		System.out.println("Sign in or register if you are new");
		System.out.println("1)Sign in " + "\n" + "2)New User");
		int userOption = scan.nextInt();
		
		switch(userOption) {
		
		case 1 : logIn(null);
		break;
			
		case 2:  createUser();   	
		break;
		
		case 3: exit();
		break;
		
		}
		
	}
	
	/*
	 * Takes in user credentials, authenticates, then commences according to userType (based on user creds).
	 * 	Need to add authentication for user; 
	 * 		If Student User -> studentMenu() , 
	 * 		If Employee User -> employeeMenu()
	 */
	public User logIn(User user) {
		System.out.println("Username:");
		String username = scan.next();
		System.out.println("Password:");
		String password = scan.next();
		studentMenu(user);
		return user;
		
	}
	
	// Allows new user to register for an account.
	public void createUser() {
		
	}
	
	public void studentMenu(User user) {
//		System.out.println("Welcome to the Student Portal " + User.getFirstName() + " what would you like to do?" );
		System.out.println("Welcome to the Student Portal, what would you like to do?" );
		System.out.println("1)View classes" + "\n" + "2)Register for classes" + "\n" +
		"3)withdraw from classes" + "\n" + "Request transcript");
	}
	
	// Closes the application
	public void exit() {
		
		System.exit(0);
		scan.close();
		
	}

	
}
