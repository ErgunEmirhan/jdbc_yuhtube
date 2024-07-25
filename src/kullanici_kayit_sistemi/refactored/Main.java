//package kullanici_kayit_sistemi.refactored;
//
//import kullanici_kayit_sistemi.refactored.entities.User;
//
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		menu();
//	}
//
//	// kullanıcı giriş/ kayıt menusu
//	public static void menu() {
//		int userInput = -1;
//		System.out.println("\n---Welcome to the program---");
//		do {
//			System.out.println("\n---The Program---");
//			System.out.println("1-sign up");
//			System.out.println("2-sign in");
//			System.out.println("3-Forgot my password");
//			System.out.println("9-list all signed up users");
//			System.out.println("0-Exit");
//			System.out.print("Selection: ");
//			try {
//				userInput = sc.nextInt();
//			}
//			catch (InputMismatchException e) {
//				System.out.println("\nPlease enter a numeric value!");
//				continue;
//			}
//			finally {
//				sc.nextLine();
//			}
//			menuFunctions(userInput);
//
//		} while (userInput != 0);
//
//
//	}
//
//	private static void menuFunctions(int userInput) {
//		switch (userInput) {
//			case 1: {
//				User user = userRegister();
//				break;
//			}
//			case 2: {
//				User user = userLogin();
//				if (user != null){
//					userInterface(user); // kullanıcı başarılı bir şekilde giriş yaparsa bu menü çıkacak
//				}
//				break;
//			}
//			case 3:{
//				changeForgottenPassword();
//				break;
//			}
//			case 8: {
//				generateData();
//				break;
//			}
//			case 9: {
//				showUsers();
//				break;
//			}
//			case 0 : {
//				System.out.println("Please have nice day!");
//				break;
//			}
//			default:
//				System.out.println("Please enter a valid value!");
//		}
//	}
//
//
//
//	// > --- Case 1 : Start --- <
//	private static User userRegister() {
//		LocalDate birthDay;
//		User user;
//		birthDay = askBirthDate();
//		if (!legalAgeCheck(birthDay)) {
//			System.out.println("You are under the legal(+18) age! You cannot register!");
//			return null;
//		}
//		user = new User();
//		user.setBirthDay(birthDay);
//		String[] fullName = askFullName();
//		user.setName(fullName[0]);
//		user.setSurname(fullName[1]);
//		user.setMail(askMail());
//		user.setPhoneNumber(askUserPhoneNumber());
//		user.setTcNo(getUserTcNo());
//		user.setUserName(askUserName());
//		user.setPassword(askPassword());
//		UserDB.save(user);
//		return user;
//	}
//
//	private static LocalDate askBirthDate() {
//		while (true) {
//			System.out.print("Please enter your birth day (yyyy-MM-dd): ");
//			String date = sc.nextLine();
//			try {
//				LocalDate localDate = LocalDate.parse(date);
//				return localDate;
//			}
//			catch (Exception e) {
//				System.out.println("Please enter your birth day in right order as-> yyyy-MM-dd!! ");
//			}
//		}
//	}
//	private static boolean legalAgeCheck(LocalDate birthDay) {
//		int age = Period.between(birthDay, LocalDate.now()).getYears();
//		boolean isLegal = (age < 18) ? false : true;
//		return isLegal;
//	}
//
//	private static String[] askFullName() {
//		String[] fullName = new String[2];
//		System.out.print("Please enter your name: ");
//		fullName[0] = sc.nextLine();
//		System.out.print("Please enter youe Surname: ");
//		fullName[1] = sc.nextLine();
//		return fullName;
//	}
//
//	private static String askMail() {
//		while (true) {
//			System.out.print("Please enter your e-mail address: ");
//			String mail = sc.nextLine();
//			if (!checkMail(mail)) { // @ yoksa aşağıdaki hatayı vericektir!
//				System.out.println("Please enter a valid email address!");
//				System.out.println("E-mail address must contain @ sign!");
//				continue;
//			}
//			if (UserDB.existByEmail(mail)) { // girilen email kayıtlı ise bu hatayı verecektir.
//				System.out.println("Please try another mail address!");
//				System.out.println("Someone has already signed up with this email address!");
//				continue;
//			}
//			return mail;
//
//		}
//	}
//	//TODO: @hotmail.com / @gmail.com için geliştirmeler yap.
//	private static boolean checkMail(String mail) {
//		if (!mail.contains("@")) {
//			return false;
//		}
//		return true;
//	}
//
//	//TODO: kullanıcının sadece numarik ve sadece numara uzunluğunda değer girmesini sağla!
//	private static String askUserPhoneNumber() {
//		System.out.print("Please enter your mobile: +90 ");
//		String phoneNum = sc.nextLine();
//		return phoneNum;
//	}
//
//	private static String getUserTcNo() {
//		String tcno;
//		while (true) {
//			System.out.print("Please enter your TC ID: ");
//			tcno = sc.nextLine();
//			if (!isTcNumeric(tcno)) {
//				System.out.println("The ID number can only contain numeric characters.");
//				continue;
//			}
//			if (tcno.length() != 11) {
//				System.out.println("TC ID has 11 digits! Must entered 11 digits!");
//				continue;
//			}
//			if (UserDB.existByTc(tcno)) {
//				System.out.println("Someone else already has that user ID. Please try another!");
//				continue;
//			}
//			return tcno;
//		}
//	}
//	private static boolean isTcNumeric(String value) {
//		for (int i = 0; i < value.length(); i++) {
//			if (!Character.isDigit(value.charAt(i))) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	private static String askUserName() {
//		String username;
//		while (true) {
//			System.out.print("Please enter username: ");
//			username = sc.nextLine();
//			if (username.length() < 4) {
//				System.out.println("Please enter longer username. min 4 characters!");
//				continue;
//			}
//			else if (username.length() > 16) {
//				System.out.println("Username is to long! max 16 characters!");
//				continue;
//			}
//			if (UserDB.existByUserName(username)) {
//				System.out.println("This username already taken! Please try another!");
//				continue;
//			}
//			return username;
//		}
//	}
//
//	private static String askPassword() {
//		String password;
//		String reEnteredPass;
//		while (true) {
//			System.out.print("Please enter your password: ");
//			password = sc.nextLine();
//			if (password.length() < 8) {
//				System.out.println("Please enter longer password. min 8 characters!");
//				continue;
//			}
//			if (password.length() > 32) {
//				System.out.println("Password is to long! max 32 characters!");
//				continue;
//			}
//			System.out.print("Please re-enter your password: ");
//			reEnteredPass = sc.nextLine();
//			if (password.equals(reEnteredPass)) {
//				return password;
//			}
//			System.out.println("Passwords does not match! Please try again!");
//		}
//	}
//	// > --- Case 1 : End --- <
//
//	// > --- Case 2 : Start --- <
//	private static User userLogin() {
//		System.out.print("Please enter your username: ");
//		String username = sc.nextLine();
//		System.out.print("Please enter your password: ");
//		String password = sc.nextLine();
//		User user = UserDB.findByUsernameAndPassword(username, password);
//		if (user == null){
//			System.out.println("Username and password do not match! One of them is incorrect.");
//			return null;
//		}
//		return user;
//	}
//	private static void userInterface(User user) {
//		int userInput = -1;
//		do {
//			System.out.println("### USER INTERFACE ###");
//			System.out.println("1.Show my information!");
//			System.out.println("7.Change mobile");
//			System.out.println("8.Change email");
//			System.out.println("9.Change password");
//			System.out.println("0-logout");
//			System.out.print("selection: ");
//			try {
//				userInput = sc.nextInt();
//			}
//			catch (Exception e) {
//				System.out.println("\nPlease enter a valid value!");
//			}
//			finally {
//				sc.nextLine();
//			}
//			userInput = userMenuFunctions(userInput, user);
//		}while (userInput != 0);
//
//	}
//	private static int userMenuFunctions(int userInput, User user) {
//		switch (userInput) {
//			case 1: { // profile
//				showUserInfo(user.getId());
//				break;
//			}
//			case 7: { //mobile  değiş
//				changeMobile(user);
//				break;
//			}
//			case 8: { //email  değiş
//				changeEmail(user);
//				break;
//			}
//			case 9: { // şifre değiş
//				if (changePassword(user)){
//					System.out.println("The new password has been set.");
//					return 0;
//				}
//
//				break;
//			}
//			case 0 : {
//				System.out.println("Returning to home page...");
//				break;
//			}
//		}
//		return userInput;
//	}
//
//	// > --- Login Case 1: Start --- <
//	private static void showUserInfo(int id) {
//		User user = UserDB.findById(id);
//		if (user == null){
//			System.out.println(user);
//		}
//	}
//	// > --- Login Case 1: End --- <
//
//	// > --- Login Case 7: Start --- <
//	private static void changeMobile (User user){
//		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
//		System.out.println("### Changing Phone Number");
//		user.setPhoneNumber(askUserPhoneNumber());
//		UserDB.update(user);
//	}
//	// > --- Login Case 7: End --- <
//
//	// > --- Login Case 8: Start --- <
//	private static void changeEmail (User user){
//		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
//		System.out.print("### Changing Email Address ###");
//		user.setMail(askMail());
//		UserDB.update(user);
//	}
//	// > --- Login Case 8: End --- <
//
//	// > --- Login Case 9: Start --- <
//	private static boolean changePassword(User user){
//		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
//		boolean isPasswordChanged =false;
//		System.out.println("### Changing Password ###");
//		System.out.print("Please enter your old password: ");
//		String oldPass = sc.nextLine();
//		if (user.getPassword().equals(oldPass)) {
//			user.setPassword(askPassword());
//			UserDB.update(user);
//			isPasswordChanged = true;
//		}
//		else {
//			System.out.println("The old password entered incorrectly!");
//		}
//		return isPasswordChanged;
//	}
//	// > --- Login Case 9: End --- <
//	// > --- Case 2 : End --- <
//
//	// > --- Case 3 : Start --- <
//	private static User changeForgottenPassword() {
//		System.out.print("Please enter your ID: ");
//		String tc = sc.nextLine();
//		System.out.print("Please enter your e-mail address: ");
//		String mail = sc.nextLine();
//
//		User user = UserDB.findByTcEmail(tc,mail);
//
//		if (user == null){
//			System.out.println("Information you entered are not match!");
//			return null;
//		}
//		user.setPassword(askPassword());
//		if (UserDB.update(user) == null){
//			System.out.println("Something went wrong!");
//			return null;
//		}
//		return user;
//	}
//	// > --- Case 3 : End --- <
//
//	// > --- Case 8 : Start --- <
//	private static void generateData() {
//		for (int i = 1; i< 10; i++){
//			User user = new User();
//			user.setName("user"+ i);
//			user.setSurname("user surname"+ i);
//			user.setMail(user.getName()+ "@gamail.com");
//			user.setPhoneNumber("1122334455"+i);
//			user.setTcNo("1122334455"+i);
//			user.setUserName(user.getName());
//			user.setPassword("12345678");
//			user.setBirthDay(LocalDate.of((1990+i),i,i));
//			UserDB.save(user);
//		}
//	}
//	// > --- Case 8 : End --- <
//
//	// > --- Case 9 : Start --- <
//	private static User[] showUsers() {
//		User[] userArray = UserDB.findAll();
//		if (userArray.length == 0){
//			System.out.println("There are no users logged in yet!");
//		}
//		return userArray;
//	}
//	// > --- Case 9 : End --- <
//	//* >--- kullanıcı giriş / kayıt menu bitiş----<
//
//
//
//
//
//
//
//
//
//
//
//
////	private static void changeForgottenPassword() {
////		int userIndex;
////		String userTcNO;
////		String userUsername;
////		while (true){
////			userTcNO = getUserTcNo();
////			userUsername = askUserName();
////			userIndex = UserDB.findTcNoIndex(userTcNO);
////			if (!UserDB.isRightUser(userIndex,userUsername)){
////				System.out.println("ID and user name do not match");
////			}
////			else{
////				break;
////			}
////		}
////			String newPassword = askPassword();
////		UserDB.updatePasword(newPassword, userIndex);
////	}
//
//
//	}