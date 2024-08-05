package assignment.week06.quest17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int orderId;
	private Customer customer;
	private List<Product> products;
	private Date orderDate;
	
	public Order(int orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.products = new ArrayList<>();
		this.orderDate = new Date();
	}
	
	// Getter ve Setter metotları
	public int getOrderId() {
		return orderId;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	// Bilgi yazdırma metodu
	public void printInfo() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Customer: " + customer.getName());
		System.out.println("Products:");
		for (Product product : products) {
			product.printInfo();
		}
	}
}