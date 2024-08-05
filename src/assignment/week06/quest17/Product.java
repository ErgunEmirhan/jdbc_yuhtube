package assignment.week06.quest17;

public class Product {
	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	// Getter ve Setter metotları
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	// Bilgi yazdırma metodu
	public void printInfo() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
}