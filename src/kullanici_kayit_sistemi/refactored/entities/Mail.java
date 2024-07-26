package kullanici_kayit_sistemi.refactored.entities;

import java.time.LocalDate;

public class Mail extends Massage{
	private static int mailIndex = 0;
	
	private String title;
	
	public Mail() {
		this.id = mailIndex++;
		this.sentDate = LocalDate.now();
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}