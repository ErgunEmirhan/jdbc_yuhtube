package week02.day01;

import java.util.Scanner;

public class Quest005 {
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