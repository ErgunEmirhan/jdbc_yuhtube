package week04.day03;

import java.time.LocalDate;

public class Massage {
	protected int id;
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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
}