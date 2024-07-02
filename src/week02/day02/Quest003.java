package week02.day02;

import java.util.Scanner;

public class Quest003 {
	public static void main(String[] args) {
		int number, sum = 1, counter=0;
		double average = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		number = sc.nextInt();
		while (number != 0){
			System.out.print("Bir sayi giriniz: ");
			number = sc.nextInt();
			
			sum +=number;
			counter++;
		}
		
			average = sum/counter;
		
//		else if (number == 0) {
//			sum = 0;
//		}
		
		System.out.println("Girdiginiz sayilarin toplami: "+ sum + " Girdiginiz sayilarin ortalaması: "+ average);
	}
}