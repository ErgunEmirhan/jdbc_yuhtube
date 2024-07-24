package kullanici_kayit_sistemi.original;

class MailDB {
	static MailList mailList = new MailList();
	
	static Mail save(Mail mail) {
		return mailList.add(mail);
	}
	
	static Mail[] saveAll(Mail[] mailArr) {
		return mailList.addAll(mailArr);
	}
	
	public static Mail update(Mail mail) {
		int index = 0;
		for (Mail mailArr : mailList.getMailArray()) {
			if (mail.getId() == mailArr.getId()) {
				return mailList.replace(index, mail);
			}
			index++;
		}
		return null;
	}
	
	static boolean existByID(int id) {
		/*User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getMail().equals(mail)){
				return true;
			}
		}
		return false;*/ //Benim Çözüm
		for (Mail mail : mailList.getMailArray()) {
			if (mail.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	static void list() {
		mailList.list();
	}
	
	
}