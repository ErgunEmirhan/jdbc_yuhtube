package week02.day01;
//5- Dairenin alanını ve çevresini bulalım. (Çap ya da yarıçap input olarak gelsin).

import java.util.Scanner;

public class Quest005 {
	public static void main(String[] args) {
		System.out.println("Dairenin yarıçap degerini giriniz: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int calculatedArea = (int)(Math.PI * r*r);
		int circumference = (int)(Math.PI*2*r);
		System.out.println("Alan: " + calculatedArea + " Çevre: " + circumference);
	}
}