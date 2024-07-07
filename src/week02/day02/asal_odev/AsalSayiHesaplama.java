package week02.day02.asal_odev;

import java.util.Scanner;

//Optimize edilmemiş versiyonu
public class AsalSayiHesaplama {
	public static void main(String[] args) {

//		MAX VALUE : 2147483647, 555555571159, 1000000016531
		//Değişken ve Nesne tanımlama
		Scanner sc = new Scanner(System.in);
		long num;
		boolean isPrime = true;
		long timerStart = 0, timerEnd = 0, timer;
		
		// Kullanıcıdan girdi alma.
		System.out.print("Bir sayi giriniz: ");
		num = sc.nextLong();
		
		// Asal sayıyı bulma işlemini yapan bölüm.
		if(num <=1){
			System.out.println(num + "asal sayi degildir.");
		}
		else if (num == 2) {
			isPrime = true;
		}
		else {
			 timerStart = System.nanoTime(); // Zaman tanımlayıcı - başlama
			for (long i = 3; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				else {
					isPrime = true;
				}
			}
			 timerEnd = System.nanoTime();// Zaman tanımlayıcı - bitiş
		}
		
		// Asal sayı ve zaman çıktısını alan bölüm.
		if (isPrime) {
			System.out.println("Girdiginiz sayi asaldir!");
		}
		else {
			System.out.println("Girdiginiz sayi asal degildir!");
		}
		
		
		timer = (timerEnd - timerStart) /1000000;
		System.out.println("Geçen süre: " + timer);
	}
}