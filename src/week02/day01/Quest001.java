package week02.day01;
//! Hatali kod
public class Quest001 {
	public static void main(String[] args) {
		double price = 100;
		final double KDV = price * 0.18;
		final double KAR = price * 0.15;
		System.out.println(price-KDV-KAR);
	}
}