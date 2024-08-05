package assignment.week06.quest17;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	private String name;
	private String email;
	private List<Order> orders;
	
	public Customer(int customerId, String name, String email) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.orders = new ArrayList<>();
	}
	
	// Getter ve Setter metotları
	public int getCustomerId() {
		return customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	// Bilgi yazdırma metodu
	public void printInfo() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}
}