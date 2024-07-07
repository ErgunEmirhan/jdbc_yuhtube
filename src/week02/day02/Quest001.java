package week02.day02;
//1- Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak istiyorum.
//		Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x isleminin sonucu " "
import java.util.Scanner;

public class Quest001 {
	public static void main(String[] args) {
		int base, exponent, power = 1, counter;
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban degerini giriniz: ");
		base = sc.nextInt();
		System.out.print("Üs degerini giriniz: ");
		exponent = sc.nextInt();
		counter = exponent;
		while (counter > 0) {
			power *= base;
			counter--;
		}
		sc.nextLine();
		System.out.print("İsminizi giriniz: ");
		String name = sc.nextLine();
		
		System.out.println("Kulanici ismi: " + name + " " + base + " üzeri " + exponent + " işleminizin sonucu: " + power);
		power = 0;
		power = (int) Math.pow(base, exponent);
		System.out.println("Kulanici ismi: " + name + " " + base + " üzeri " + exponent + " işleminizin sonucu: " + power);
		
	}
}