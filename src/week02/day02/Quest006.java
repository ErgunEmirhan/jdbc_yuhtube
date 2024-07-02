package week02.day02;

import java.util.Scanner;

public class Quest006 {
	public static void main(String[] args) {
		final int smsCode = 10, mailCode = 30;
		int smsInput, mailInput;
		Scanner sc = new Scanner(System.in);
		System.out.print("SMS kodunuzu giriniz: ");
		smsInput = sc.nextInt();
		System.out.print("E-mail kodunuzu giriniz: ");
		mailInput = sc.nextInt();
		
		if (mailCode == mailInput && smsCode == smsInput) {
			System.out.println("Başarıyla giriş yaptınız!");
		}
		else if (mailCode != mailInput && smsCode == smsInput) {
			System.out.println("E-mail kodunuzu yanlış girdiniz!");
			
		}
		else if (mailCode == mailInput && smsCode != smsInput) {
			System.out.println("SMS kodunuzu yanlış girdiniz!");
			
		}
		else {
			System.out.println("İki kod da hatalı!");
		}
	}
}