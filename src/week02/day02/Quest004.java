package week02.day02;

import java.util.Scanner;

public class Quest004 {
	public static void main(String[] args) {
		int number, multiply;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		number = sc.nextInt();
		multiply = number;
		for(int i = 1; i <=10; i ++){
			multiply = number * i;
			System.out.println(number+ " X " + i + "= " + multiply);
		}
	}
}