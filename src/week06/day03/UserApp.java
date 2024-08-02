package week06.day03;

import week06.day03.databases.UserDB;
import week06.day03.entities.User;
import  week06.day03.databases.MailDB;
import week06.day03.entities.Mail;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserApp {
	static Scanner sc = new Scanner(System.in);
	static UserDB userDB = new UserDB();
	static MailDB mailDB = new MailDB();
	
	// kullanıcı giriş/ kayıt menusu
	public static User userMenu() {
		int userInput = -1;
		System.out.println("\n---Hosgeldiniz---");
		do {
			System.out.println("\n---Islemler---");
			System.out.println("1-Kayit Ol");
			System.out.println("2-Giris Yap");
			System.out.println("3-Sifremi Unuttum");
			System.out.println("9-Kayitli Kullanicilari Goruntule");
			System.out.println("0-Cikis Yap");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nLutfen numerik bir deger giriniz!");
				continue;
			} finally {
				sc.nextLine();
			}
			switch (userInput) {
				case 1:
					User user = userRegister();
					break;
				case 2:
					user = userLogin();
					return user;
				
				case 3:
					changeForgottenPassword();
					break;
				
				case 8:
					generateData();
					break;
				
				case 9:
					showUsers();
					break;
				
				case 0:
					System.out.println("Iyi Gunler!");
					break;
				
				default:
					System.out.println("Lutfen gecerli bir deger giriniz!");
			}
		} while (userInput != 0);
		
		return null;
	}
	
	// > --- Case 1 : Start --- <
	private static User userRegister() {
		LocalDate birthDay;
		User user;
		birthDay = askBirthDate();
		if (!legalAgeCheck(birthDay)) {
			System.out.println("18 yasindan kucukler uye olamaz!");
			return null;
		}
		user = new User();
		user.setBirthDay(birthDay);
		String[] fullName = askFullName();
		user.setName(fullName[0]);
		user.setSurname(fullName[1]);
		user.setMail(askMail());
		user.setPhoneNumber(askUserPhoneNumber());
		user.setTcNo(getUserTcNo());
		user.setUserName(askUserName());
		user.setPassword(askPassword());
		userDB.save(user);
		return user;
	}
	
	private static LocalDate askBirthDate() {
		while (true) {
			System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd): ");
			String date = sc.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			} catch (Exception e) {
				System.out.println("Lutfen dogum tarihinizi dogru formatla giriniz-> yyyy-MM-dd!! ");
			}
		}
	}
	
	private static boolean legalAgeCheck(LocalDate birthDay) {
		int age = Period.between(birthDay, LocalDate.now()).getYears();
		boolean isLegal = (age < 18) ? false : true;
		return isLegal;
	}
	
	private static String[] askFullName() {
		String[] fullName = new String[2];
		System.out.print("Lutfen isminizi giriniz: ");
		fullName[0] = sc.nextLine();
		System.out.print("Lutfen soyadinizi giriniz: ");
		fullName[1] = sc.nextLine();
		return fullName;
	}
	
	private static String askMail() {
		while (true) {
			System.out.print("Lutfen e-mail adresinizi giriniz: ");
			String mail = sc.nextLine();
			if (!checkMail(mail)) { // @ yoksa aşağıdaki hatayı vericektir!
				System.out.println("Lutfen gecerli bir mail adresi giriniz!");
				System.out.println("E-mail adresi @ icermelidir!");
				continue;
			}
			if (userDB.existByEmail(mail)) { // girilen email kayıtlı ise bu hatayı verecektir.
				System.out.println("Lutfen baska bir mail adresi giriniz!");
				System.out.println("Baska bir kullanici zaten bu mail ile uyelik gerceklestirdi.");
				continue;
			}
			return mail;
			
		}
	}
	
	//TODO: @hotmail.com / @gmail.com için geliştirmeler yap.
	private static boolean checkMail(String mail) {
		if (!mail.contains("@")) {
			return false;
		}
		return true;
	}
	
	//TODO: kullanıcının sadece numarik ve sadece numara uzunluğunda değer girmesini sağla!
	private static String askUserPhoneNumber() {
		System.out.print("Telefon numaranizi giriniz: +90 ");
		String phoneNum = sc.nextLine();
		return phoneNum;
	}
	
	private static String getUserTcNo() {
		String tcno;
		while (true) {
			System.out.print("Lutfen TC Kimlik No giriniz: ");
			tcno = sc.nextLine();
			if (!isTcNumeric(tcno)) {
				System.out.println("Girdiginiz TC No sadece numerik degerlerden olusmalidir.");
				continue;
			}
			if (tcno.length() != 11) {
				System.out.println("Girdiginiz TC No 11 haneli olmalidir!");
				continue;
			}
			if (userDB.existByTc(tcno)) {
				System.out.println("Daha once bu TC No ile uyelik gerceklestirildi. Lutfem baska bir TC giriniz!");
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
	
	private static String askUserName() {
		String username;
		while (true) {
			System.out.print("Lutfen kullanici adinizi giriniz: ");
			username = sc.nextLine();
			if (username.length() < 4) {
				System.out.println("Lutfen daha uzun bir kullanici adi giriniz. Min 4 karakter!");
				continue;
			} else if (username.length() > 16) {
				System.out.println("Girdiginiz kullanici adi cok uzun! Max 16 karakter!");
				continue;
			}
			if (userDB.existByUserName(username)) {
				System.out.println("Bu kullanici adiyla daha once uyelik gerceklestirildi. Lutfen baska bir kullanici adi belirleyiniz.!");
				continue;
			}
			return username;
		}
	}
	
	private static String askPassword() {
		String password;
		String reEnteredPass;
		while (true) {
			System.out.print("Lutfen sifrenizi giriniz: ");
			password = sc.nextLine();
			if (password.length() < 8) {
				System.out.println("Lutfen daha uzun bir sifre giriniz. Min 8 karakter!");
				continue;
			}
			if (password.length() > 32) {
				System.out.println("Girdiginiz sifre cok uzun! Max 32 karakter!");
				continue;
			}
			System.out.print("Sifrenizi tekrar giriniz: ");
			reEnteredPass = sc.nextLine();
			if (password.equals(reEnteredPass)) {
				return password;
			}
			System.out.println("Girdiginiz sifreler eslesmiyor! Tekrar deneyiniz!");
		}
	}
	
	// > --- Case 1 : End --- <
	// > --- Case 2 : Start --- <
	private static User userLogin() {
		System.out.print("Kullanici adi: ");
		String username = sc.nextLine();
		System.out.print("Sifre: ");
		String password = sc.nextLine();
		User user = userDB.findByUsernameAndPassword(username, password);
		if (user == null) {
			System.out.println("Kullanici adi ve sifre eslesmiyor. Tekrar deneyiniz.");
			return null;
		}
		return user;
	}
	
	public static User userInterface(User user) {
		int userInput = -1;
		do {
			System.out.println("### KULLANICI ARAYUZU ###");
			System.out.println("1.Bilgilerimi goruntule!");
			System.out.println("2.Bilgilerimi goruntule!");
			System.out.println("3.Geri Dön");
			System.out.println("7.Telefon numarasi degistir.");
			System.out.println("8.E-Mail degistir.");
			System.out.println("9.Sifre degistir.");
			System.out.println("0-Log-out");
			System.out.print("Seciminiz: ");
			try {
				userInput = sc.nextInt();
			} catch (Exception e) {
				System.out.println("\nGecerli bir deger giriniz!");
			} finally {
				sc.nextLine();
			}
			
			switch (userInput) {
				case 1: // profile
					showUserInfo(user.getId());
					break;
				case 2: // Mail user interface
					mailUserInterface(user);
					break;
				case 3: //ana menuye don
					return user;
				case 7: //mobile  değiş
					changeMobile(user);
					break;
				case 8: //email  değiş
					changeEmail(user);
					break;
				case 9: // şifre değiş
					if (changePassword(user)) {
						System.out.println("Sifreniz degistirildi.");
//						SepetUrunDetayDB.removeAllSepet();
						userInput = 0;
						return null;
					}
					break;
				case 0:
					System.out.println("Ana Menuye donuluyor...");
//					SepetUrunDetayDB.removeAllSepet();
					return null;
			}
		} while (userInput != 0);
		return user;
	}
	
	// > --- Login Case 1: Start --- <
	private static void showUserInfo(int id) {
		User user = userDB.findById(id);
		if (user != null) {
			System.out.println(user);
		} else {
			System.out.println("Bilgileriniz bulunmadi! Bir seyler ters gitti!");
		}
	}
	
	// > --- Login Case 1: End --- <
	// > --- Login Case 2: Start --- <
	private static void mailUserInterface(User user) {
		int userInput = -1;
		do {
			System.out.println("### MAIL APP INTERFACE ###");
			System.out.println("1.Inbox");
			System.out.println("2.Outbox");
			System.out.println("3.Send a mail");
			System.out.println("0-return");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			} catch (Exception e) {
				System.out.println("\nPlease enter a valid value!");
			} finally {
				sc.nextLine();
			}
			userInput = userMailAppFunctions(userInput, user);
		} while (userInput != 0);
	}
	
	private static int userMailAppFunctions(int userInput, User user) {
		switch (userInput) {
			case 1: // inbox
				showInbox(user);
				break;
			case 2: // outbox
				showOutbox(user);
				break;
			case 3: //send a mail
				newMail(user);
				break;
			case 0: {
				System.out.println("Returning to home page...");
				break;
			}
		}
		return userInput;
	}
	
	// > --- Mail Case 1: Start --- <
	private static void showInbox(User user) {
		List<Mail> mailList = mailDB.findRecievedMailsByUser(user);
		if (mailList.size() != 0) {
			listTheMails(mailList);
		} else {
			System.out.println("\nInbox is empty!\n");
		}
		
	}
	
	// > --- Mail Case 1: End --- <
	// > --- Mail Case 2: Start --- <
	private static void showOutbox(User user) {
		List<Mail> mailList = mailDB.findSentMailsByUser(user);
		if (mailList.size() != 0) {
			listTheMails(mailList);
		} else {
			System.out.println("\nOutbox is empty!\n");
		}
	}
	
	// > --- Mail Case 2: End --- <
	private static void listTheMails(List<Mail> mailList) {
		for (Mail mail : mailList) {
			System.out.println("--------------------------------");
			System.out.println("Title: " + mail.getTitle());
			System.out.println("Content ");
			System.out.println(" " + mail.getContent());
		}
		System.out.println("************** End of the list **************");
	}
	
	// > --- Mail Case 3: Start --- <
	private static void newMail(User senderUser) {
		while (true) {
			System.out.print("Please enter a mail address to send: ");
			String receiverMail = sc.nextLine();
			if (receiverMail.equals(senderUser.getMail())) {
				System.out.println("\nThis is your e-mail belongs to yours!");
				continue;
			}
			if (userDB.existByEmail(receiverMail)) {
				User receiverUser = userDB.findByEmail(receiverMail);
				System.out.print("Please enter a title: ");
				String title = sc.nextLine();
				System.out.println("Please enter the mail content to send: ");
				String content = sc.nextLine();
				
				Mail mail = new Mail();
				mail.setReceiver(receiverUser);
				mail.setSender(senderUser);
				mail.setTitle(title);
				mail.setContent(content);
				mailDB.save(mail);
				return;
			} else {
				System.out.println("\nIncorrect e-mail address please try again!");
			}
		}
		
	}
	
	// > --- Mail Case 3: End --- <
	// > --- Login Case 2: End --- <
	// > --- Login Case 7: Start --- <
	private static void changeMobile(User user) {
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		System.out.println("### Telefon numarasi degistirme");
		user.setPhoneNumber(askUserPhoneNumber());
		userDB.update(user);
	}
	
	// > --- Login Case 7: End --- <
	// > --- Login Case 8: Start --- <
	private static void changeEmail(User user) {
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		System.out.print("### Email adresi degistirme ###");
		user.setMail(askMail());
		userDB.update(user);
	}
	
	// > --- Login Case 8: End --- <
	// > --- Login Case 9: Start --- <
	private static boolean changePassword(User user) {
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		boolean isPasswordChanged = false;
		System.out.println("### Sifre degistirme ###");
		System.out.print("Lutfen mevcut sifrenizi giriniz: ");
		String oldPass = sc.nextLine();
		if (user.getPassword().equals(oldPass)) {
			user.setPassword(askPassword());
			userDB.update(user);
			isPasswordChanged = true;
		} else {
			System.out.println("Mevcut sifre dogru girilmedi!");
		}
		return isPasswordChanged;
	}
	
	// > --- Login Case 9: End --- <
	// > --- Case 2 : End --- <
	// > --- Case 3 : Start --- <
	private static User changeForgottenPassword() {
		System.out.print("Kullanici adinizi giriniz: ");
		String tc = sc.nextLine();
		System.out.print("E-mail adresinizi giriniz: ");
		String mail = sc.nextLine();
		
		User user = userDB.findByTcEmail(tc, mail);
		
		if (user == null) {
			System.out.println("Girdiginiz bilgiler eslesmiyor!");
			return null;
		}
		user.setPassword(askPassword());
		if (userDB.update(user) == null) {
			System.out.println("Bir seyler ters gitti!");
			return null;
		}
		return user;
	}
	
	// > --- Case 3 : End --- <
	// > --- Case 8 : Start --- <
	private static void generateData() {
		for (int i = 1; i < 10; i++) {
			User user = new User();
			user.setName("user" + i);
			user.setSurname("user surname" + i);
			user.setMail(user.getName() + "@gamail.com");
			user.setPhoneNumber("1122334455" + i);
			user.setTcNo("1122334455" + i);
			user.setUserName(user.getName());
			user.setPassword("12345678");
			user.setBirthDay(LocalDate.of((1990 + i), i, i));
			userDB.save(user);
		}
	}
	
	// > --- Case 8 : End --- <
	// > --- Case 9 : Start --- <
	private static List<User> showUsers() {
		List<User> userArray = userDB.findAll();
		if (userArray.size() == 0) {
			System.out.println("Giris yapmis kullanici bulunamadi!");
		} else {
			userArray.forEach(System.out::println);
		}
		return userArray;
	}
	// > --- Case 9 : End --- <


}