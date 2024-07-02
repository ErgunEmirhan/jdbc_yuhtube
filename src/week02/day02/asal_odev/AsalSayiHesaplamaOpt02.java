package week02.day02.asal_odev;

import java.util.Scanner;

public class AsalSayiHesaplamaOpt02 {
	public static void main(String[] args) {
		long timerStart = System.currentTimeMillis(); // Zaman tanımlayıcı
		
		//Değişken ve Nesne tanımlama
		Scanner sc = new Scanner(System.in);
		int num;
		boolean isPrime = false;
		
		// Kullanıcıdan girdi alma.
		System.out.print("Bir sayi giriniz: ");
		num = sc.nextInt();
		
		// Asal sayıyı bulma işlemini yapan bölüm.
		if (num < 2){
			isPrime = false;
		}
		if (num == 2) {
			isPrime = true;
		}
		else if (num % 2 == 0){
			isPrime= false;
		}
		else {
			double root = Math.sqrt(num);
			for (int i = 3; i < root; i+=2) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				else {
					isPrime = true;
				}
			}
		}

		// Asal sayı ve zaman çıktısını alan bölüm.
		if (isPrime) {
			System.out.println("Girdiginiz sayi asaldir!");
		}
		else {
			System.out.println("Girdiginiz sayi asal degildir!");
		}
		
		long timerEnd = System.currentTimeMillis();
		long timer = timerEnd - timerStart;
		System.out.println("Geçen süre: " + timer);
	}
	
}