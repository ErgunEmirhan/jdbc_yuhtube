package assignment.week06.quest17;

public class Main {
	public static void main(String[] args) {
		// Customer nesnesi oluşturma
		Customer customer1 = new Customer(1, "Alice", "alice@example.com");
		
		// Product nesneleri oluşturma
		Product product1 = new Product(101, "Laptop", 1500.0);
		Product product2 = new Product(102, "Smartphone", 800.0);
		
		// Order nesnesi oluşturma
		Order order1 = new Order(1001, customer1);
		
		// Ürünleri siparişe ekleme
		order1.addProduct(product1);
		order1.addProduct(product2);
		
		// Siparişi müşteriye ekleme
		customer1.addOrder(order1);
		
		// Bilgileri yazdırma
		customer1.printInfo();
		order1.printInfo();
	}
}