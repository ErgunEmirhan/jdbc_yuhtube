package kullanici_kayit_sistemi.refactored;

public class Test {
	public static void main(String[] args) {
		User user1 = new User();
		Mail  mail1 = new Mail();
		MailDB.save(mail1);
		UserDB.save(user1);
		
		UserDB.list();
		MailDB.list();
	}
}