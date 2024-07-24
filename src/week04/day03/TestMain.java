package week04.day03;

public class TestMain {
	public static void main(String[] args) {
		Mail mail1 = new Mail();
		Mail mail2 = new Mail();
		Mail mail3 = new Mail();
//		Mail mail4 = new Mail();
//		mail1.setContent("ljdsakjda");
//		mail1.setReceiver("Alex");
//		mail1.setSender("Joseph");
		MailDB.save(mail1);
		if (!MailDB.existByID(mail1.id)){
			MailDB.saveAll(new Mail[]{mail1, mail2, mail3});
		}else{
			System.out.println("bu zaten var.");
		}
		
		MailDB.list();
		
	}
}