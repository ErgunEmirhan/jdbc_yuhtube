package week04.day03;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		int userInput = -1;
		System.out.println("\n---Welcome to the program---");
		do {
			System.out.println("\n---The Program---");
			System.out.println("1-sign up");
			System.out.println("2-sign in");
			System.out.println("3-Forgot my password");
			System.out.println("4-list all signed up users");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			userSelection(userInput);
			
		} while (userInput != 0);
		
		
	}
	private static void userSelection(int userInput) {
		switch (userInput) {
			case 1: {
				userRegister();
				break;
			}
			case 2: {
				int userIndex = userLogin();
				if (userIndex != -1){
					loginMenu(userIndex); // kullanıcı başarılı bir şekilde giriş yaparsa bu menü çıkacak
				}
				break;
			}
			case 3:{
				changeForgottenPassword();
				break;
			}
			case 4:{
				UserDB.findAll();
				break;
			}
			case 0 : {
				System.out.println("Please have nice day!");
				break;
			}
			default:
				System.out.println("Please enter a valid value!");
		}
	}
	private static void loginMenu(int userIndex) {
		int userInput = -1;
		do {
			System.out.println("1.profile");
			System.out.println("0-logout");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			userSelectionForLogin(userInput, userIndex);
			
		}while (userInput != 0);
		
	}
	private static void userSelectionForLogin(int userInput, int userIndex) {
		switch (userInput) {
			case 1: { // profile
				UserDB.listUser(userIndex);
				break;
			}
			case 0 : {
				System.out.println("Please have nice day!");
				break;
			}
			default:
				System.out.println("Please enter a valid value!");
		}
	}
	
	
	private static void userRegister() {
		LocalDate birthDay;
		User user;
		birthDay = getUserBirthDate();
		if (!legalAgeCheck(birthDay)) {
			System.out.println("You are under the legal(+18) age! You cannot register!");
			return;
		}
		user = new User();
		user.setBirthDay(birthDay);
//		String[] fullName = getFullName();
//		user.setName(fullName[0]);
//		user.setSurname(fullName[1]);
		user.setMail(getUserMail());
//		user.setPhoneNumber(getPhoneNumber());
		user.setPassword(getUserPassword());
		user.setUserName(getFromUserUserName(true));
		user.setTcNo(getUserTcNo(true));
		UserDB.save(user);
	}
	private static int userLogin() {
		String username;
		String password;
		int userIndex;
		username = getFromUserUserName(false);
		userIndex = UserDB.findUsernameIndex(username);
		for (int i = 0; i <3 ; i++){
			System.out.print("Please enter your password: ");
			password = sc.nextLine();
			if (UserDB.isRightUser(password, userIndex)){
				System.out.println("Successfully logged in!");
				return userIndex;
			}
			System.out.println((i+1) +". wrong password!");
		}
		System.out.println("You've had 3 attempts! Unable to log in!");
		return -1;
	}
	private static void changeForgottenPassword() {
		int userIndex;
		String userTcNO;
		String userUsername;
		while (true){
			userTcNO = getUserTcNo(false);
			userUsername = getFromUserUserName(false);
			userIndex = UserDB.findTcNoIndex(userTcNO);
			if (!UserDB.isRightUser(userIndex,userUsername)){
				System.out.println("ID and user name do not match");
			}
			else{
				break;
			}
		}
		String newPassword = getUserPassword();
		UserDB.updatePasword(newPassword, userIndex);
	}
	private static String getUserTcNo(boolean isFirst) {
		String tcno;
		while (true) {
			System.out.print("Please enter your TC ID: ");
			tcno = sc.nextLine();
			if (!isTcNumeric(tcno)) {
				System.out.println("The ID number can only contain numeric characters.");
				continue;
			}
			else if (tcno.length() != 11) {
				System.out.println("TC ID has 11 digits! Must entered 11 digits!");
				continue;
			}
			
			if (isFirst){
				if (UserDB.findTcNo(tcno)){
					System.out.println("Some else already has that user ID. Please try another!");
					continue;
				}
				return tcno;
			}
			if (!UserDB.findTcNo(tcno)){
				System.out.println("Wrong ID number! No such user has the ID in app!");
				continue;
			}
			return tcno;
		}
	}
	private static boolean isTcNumeric(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String getFromUserUserName(boolean isFirst) {
		String username;
		while (true) {
			System.out.print("Please enter username: ");
			username = sc.nextLine();
			if (username.length() < 4) {
				System.out.println("Please enter longer username. min 4 characters!");
				continue;
			}
			else if (username.length() > 16) {
				System.out.println("Username is to long! max 16 characters!");
				continue;
			}
			if (isFirst){
				if (UserDB.findUserName(username)){
					System.out.println("This username already taken! Please try another!");
					continue;
				}
				return username;
			}
			if (!UserDB.findUserName(username)){
				System.out.println("Wrong UserName! No such user has this username!");
				continue;
			}
			return username;
		}
	}
	private static String getUserPassword() {
		String password;
		String reEnteredPass;
		while (true) {
			System.out.print("Please enter your password: ");
			password = sc.nextLine();
			if (password.length() < 8) {
				System.out.println("Please enter longer password. min 8 characters!");
				continue;
			}
			else if (password.length() > 32) {
				System.out.println("Password is to long! max 32 characters!");
				continue;
			}
			else {
				System.out.print("Please re-enter your password: ");
				reEnteredPass = sc.nextLine();
				if (password.equals(reEnteredPass)) {
					return password;
				}
				System.out.println("Passwords does not match! Please try again!");
			}
		}
		
		
	}
	
	private static String getPhoneNumber() {
		System.out.print("Please enter your mobile: +90 ");
		String phoneNum = sc.nextLine();
		return phoneNum;
	}
	
	private static String getUserMail() {
		boolean isMailCorrect = false;
		do {
			System.out.print("Please enter your e-mail address: ");
			String mail = sc.nextLine();
			isMailCorrect = checkMailAddress(mail);
			boolean isMailContains = UserDB.findEmail(mail);
			if (isMailCorrect && !isMailContains){
				return mail;
			}
			if (isMailContains){
				System.out.println("Please try another mail address!");
				System.out.println("Someone has already signed up with this email address!");
				isMailCorrect = false;
			}
			
		}while (!isMailCorrect);
		return null;
	}
	private static boolean checkMailAddress(String mail) {
		if (!mail.contains("@")){
			System.out.println("Please enter a valid email address!");
			System.out.println("E-mail address must contain @ sign!");
			return false;
		}
		return true;
	}
	//kullanıcı mail adresini doğru girdi mi ?
	
	private static String[] getFullName() {
		String[] fullName = new String[2];
		System.out.print("Please enter your name: ");
		fullName[0] = sc.nextLine();
		System.out.print("Please enter youe Surname: ");
		fullName[1] = sc.nextLine();
		return fullName;
	}
	
	private static boolean legalAgeCheck(LocalDate birthDay) {
		int age = Period.between(birthDay, LocalDate.now()).getYears();
		boolean isLegal = (age < 18) ? false : true;
		return isLegal;
	}
	
	private static LocalDate getUserBirthDate() {
		while (true) {
			System.out.print("Please enter your birth day (yyyy-MM-dd): ");
			String date = sc.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			}
			catch (Exception e) {
				System.out.println("Please enter your birth day in right order as-> yyyy-MM-dd!! ");
			}
		}
	}
}