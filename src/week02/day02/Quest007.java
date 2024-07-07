package week02.day02;
//7- Girilen sayının 5'in kuvveti olup olmadığını bulan program.

import java.util.Scanner;

public class Quest007 {
	public static void main(String[] args) {
		int userInput, temp, powCheck, powCounter = 1;
		boolean isPowOfFive = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		userInput = sc.nextInt();
		
		temp = userInput;
		if (userInput == 1){
			isPowOfFive = true;
			powCounter = 0;
		}
		else if (userInput == 5) {
			isPowOfFive = true;
		}
		else if (userInput % 5 == 0) {
			while (temp > 5) {
				powCheck = temp /= 5;
				if (powCheck % 5 != 0) {
					isPowOfFive = false;
				}
				else {
					powCounter++;
					isPowOfFive = true;
					
				}
			}
		}
		else {
			isPowOfFive = false;
		}
		
		if (isPowOfFive) {
			System.out.println("5'in " + powCounter + ". kuvveti");
		}
		else {
			System.out.println("5'in kuvveti degil");
		}
	}
}

/*
* int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		number = sc.nextInt();
		if (((number >= 5) && ((number / 5) % 5 == 0)) || number == 5){
			System.out.println("Girdiginiz sayi 5'in kuvveti");
		}else{
			System.out.println("Girdiginiz sayi 5'in kuvveti DEĞİLDİR!");
		}*/