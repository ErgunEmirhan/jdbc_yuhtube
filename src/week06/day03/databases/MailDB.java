package week06.day03.databases;


import week06.day03.entities.*;
import week06.day03.utility.*;


import java.util.ArrayList;
import java.util.List;

public class MailDB extends DatabaseManager<Mail> {
	
	
	public List<Mail> findRecievedMailsByUser(User user) {
		List<Mail> mailList = new ArrayList<>();
		for (Mail mail : arrayList) {
			if (user.equals(mail.getReceiver())) {
				mailList.add(mail);
			}
		}
		return mailList;
	}
	
	public List<Mail> findSentMailsByUser(User user) {
		List<Mail> mailList = new ArrayList<>();
		for (Mail mail : arrayList) {
			if (user.equals(mail.getSender())) {
				mailList.add(mail);
			}
		}
		if (mailList.size() != 0) {
			return mailList;
		}
		else return mailList;
	}
}