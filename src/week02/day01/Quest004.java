package week02.day01;
//4- Kullanıcıdan önce yaşını, sonrasında da kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını ekrana yazdıralım.

import java.util.Scanner;

public class Quest004 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Yaşınızı giriniz: ");
		int age = sc.nextInt();
		sc.nextLine(); // numeric degerden sonra tekrar bir girdi alabilmek için var.
		System.out.print("Adınızı giriniz: ");
		String name = sc.nextLine();
		System.out.println(name+ " "+ age);
	}
}