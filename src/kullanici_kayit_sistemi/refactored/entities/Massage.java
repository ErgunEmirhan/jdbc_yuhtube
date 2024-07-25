package kullanici_kayit_sistemi.refactored.entities;

import java.time.LocalDate;

public class Massage extends BaseEntity {
	
	protected User receiver;
	protected User sender;
	protected String Content;
	protected LocalDate sentDate;
	
	public String getContent() {
		return Content;
	}
	
	public void setContent(String content) {
		Content = content;
	}
	
	public User getReceiver() {
		return receiver;
	}
	
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
	
	public User getSender() {
		return sender;
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}
	
	public LocalDate getSentDate() {
		return sentDate;
	}
	
	public void setSentDate(LocalDate sentDate) {
		this.sentDate = sentDate;
	}
	
	@Override
	public String toString() {
		return "Massage{" + "Content='" + getContent() + '\'' + ", id=" + getId() + ", receiver=" + getReceiver() + ", sender=" + getSender() + ", sentDate=" + getSentDate() + ", content='" + getContent() + '\'' + '}';
	}
}