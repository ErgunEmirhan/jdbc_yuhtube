package week02.day01;
//8- 1'den başlayarak, kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların 1 fazlasının toplamını ekrana yazdıran program.

import java.util.Scanner;

public class Quest008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Bir sayi giriniz: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++){
			sum = sum +(i+1);
		}
		System.out.println(sum);
	}
}