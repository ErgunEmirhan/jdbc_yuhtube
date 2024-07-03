package week02.day02;

import java.util.Scanner;
// !Hatali kod tam olarak düzgün çalışmıyor
public class Quest007 {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		number = sc.nextInt();
		if (((number >= 5) && ((number / 5) % 5 == 0)) || number == 5){
			System.out.println("Girdiginiz sayi 5'in kuvveti");
		}else{
			System.out.println("Girdiginiz sayi 5'in kuvveti DEĞİLDİR!");
		}
	}
}