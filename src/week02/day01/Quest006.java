package week02.day01;

import java.util.Scanner;

public class Quest006 {
	public static void main(String[] args) {
		System.out.println("Dairenin yarıçap degerini giriniz: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int alan = (int)(Math.PI * r*r);
		int cevre = (int)(Math.PI*2*r);
		System.out.println("Alan: " + alan + " Çevre: " + cevre);
	}
}