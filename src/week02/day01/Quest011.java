package week02.day01;

import java.util.Scanner;

public class Quest011 {
	public static void main(String[] args) {
		int basamak, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int num = sc.nextInt();
		
		while(num>0){
			basamak = num % 10;
			sum += basamak;
			num /= 10;
		}
		System.out.println(sum);
	}
}