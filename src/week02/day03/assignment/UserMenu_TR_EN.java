package week02.day03.assignment;

import java.util.Scanner;

public class UserMenu_TR_EN {
	public static void main(String[] args) {
		int userMenuSelection = -1, langSelection;
		boolean isLangTrue = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hosgeldiniz! / Welcome!\n" +
				                   "Lutfen goruntuleme dilini seciniz. / Please select display language.");
		while (isLangTrue){
			System.out.println("1 -- Turkce(TR)");
			System.out.println("2 -- English(EN)");
			langSelection = sc.nextInt();
			if (langSelection == 1){
				isLangTrue = false;
				while (userMenuSelection != 0) {
					System.out.println("0 -- Çıkış yap");
					System.out.println("1 -- Merhaba Dünya yazdır.");
					System.out.println("2 -- Faktöriyel hesapla.");
					System.out.println("3 -- Asal sayi kontrolü yap.");
					userMenuSelection = sc.nextInt();
					
					switch (userMenuSelection) {
						case 0:
							System.out.println("Iyi gunler");
							break;
						case 1:
							System.out.println("Merhaba Dunya!\n");
							break;
						case 2: {
							int factorialOf, result = 1;
							System.out.print("Bir sayi giriniz: ");
							factorialOf = sc.nextInt();
							if (factorialOf < 0){
								System.out.println("Pozitif bir deger giriniz!\n");
							}
							else {
								for (int i = 1; i <= factorialOf; i++) {
									result *= i;
								}
								System.out.println("Girdiginiz sayinin faktoriyeli: " + result + "\n");
							}
						}
						break;
						case 3: {
							int primeCheck;
							boolean isPrime = true;
							System.out.print("Bir sayi giriniz: ");
							primeCheck = sc.nextInt();
							if (primeCheck <= 1) {
								isPrime = false;
							}
							else if (primeCheck == 2) {
								isPrime = true;
							}
							else if (primeCheck % 2 == 0) {
								isPrime = false;
							}
							else {
								int sqrtOfPrime = (int) Math.sqrt(primeCheck);
								for (int i = 3; i <= sqrtOfPrime; i += 2) {
									if (primeCheck % i == 0) {
										isPrime = false;
										break;
									}
								}
							}
							if (isPrime) {
								System.out.println("Girilen sayi asaldir!\n");
							}
							else {
								System.out.println("Girilen sayi asal degildir!\n");
							}
						}
						break;
					}
				}
			}
			else if (langSelection == 2) {
				isLangTrue = false;
				while (userMenuSelection != 0) {
					System.out.println("0 -- Exit");
					System.out.println("1 -- Print Hello World!");
					System.out.println("2 -- Calculate factorial of a number.");
					System.out.println("3 -- Check prime number.");
					userMenuSelection = sc.nextInt();
					
					switch (userMenuSelection) {
						case 0:
							System.out.println("Have good day!");
							break;
						case 1:
							System.out.println("Hello World!\n");
							break;
						case 2: {
							int factorialOf, result = 1;
							System.out.print("Please enter a number: ");
							factorialOf = sc.nextInt();
							if (factorialOf < 0){
								System.out.println("The number must be a positive value!\n");
							}
							else {
								for (int i = 1; i <= factorialOf; i++) {
									result *= i;
								}
								System.out.println("Number of factorials you entered: " + result + "\n");
							}
						}
						break;
						case 3: {
							int primeCheck;
							boolean isPrime = true;
							System.out.print("Please enter a number: ");
							primeCheck = sc.nextInt();
							if (primeCheck <= 1) {
								isPrime = false;
							}
							else if (primeCheck == 2) {
								isPrime = true;
							}
							else if (primeCheck % 2 == 0) {
								isPrime = false;
							}
							else {
								int sqrtOfPrime = (int) Math.sqrt(primeCheck);
								for (int i = 3; i <= sqrtOfPrime; i += 2) {
									if (primeCheck % i == 0) {
										isPrime = false;
										break;
									}
								}
							}
							if (isPrime) {
								System.out.println("The number of user input is prime!\n");
							}
							else {
								System.out.println("The number of user input is not prime!\n");
							}
						}
						break;
					}
				}
			}else {
				System.out.println("Something went wrong! Please try again.");
			}
		}
		
		
	}
}