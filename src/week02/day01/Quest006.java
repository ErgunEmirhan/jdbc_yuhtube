package week02.day01;
//6- Dışarıdan 2 adet tam sayı değeri alalım. iki sayının toplamı çift ise true, değil ise false yazdıralım. Bu değerlerin bir de ortalamasını alalım ve yazdıralım.

import java.util.Scanner;

public class Quest006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		int num1 = sc.nextInt();
		System.out.println("İkinci sayiyi giriniz: ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		
		boolean isEven = sum % 2 == 0;
		System.out.println(isEven ? "Çift":"Tek");
		
		System.out.println("Girdiğiniz sayilarin ortalamasi: " + (num1+num2)/2);
	}
}