package week02.day02.asal_odev;

import java.util.Scanner;

//Optimize edilmemiş versiyonu
public class AsalSayiHesaplama {
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
		if (num == 2) {
			isPrime = true;
		}
		else {
			for (int i = 3; i < num; i++) {
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