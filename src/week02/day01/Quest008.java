package week02.day01;

import java.util.Scanner;

public class Quest008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fakt = 1;
		System.out.println("Bir sayi giriniz: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++){
			fakt *= i;
		}
		System.out.println(fakt);
	}
}