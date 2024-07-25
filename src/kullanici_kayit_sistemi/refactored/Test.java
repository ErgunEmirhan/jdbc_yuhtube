package kullanici_kayit_sistemi.refactored;

import kullanici_kayit_sistemi.refactored.entities.Mail;
import kullanici_kayit_sistemi.refactored.entities.User;

public class Test {
	public static void main(String[] args) {
		User user1 = new User();
		Mail mail1 = new Mail();
		MailDB.save(mail1);
		UserDB.save(user1);
		
		UserDB.list();
		MailDB.list();
	}
}