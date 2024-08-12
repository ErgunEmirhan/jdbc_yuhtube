package week08.day01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 2-  Disaridan bir String deger alacagiz.
* Bu String degerdeki her bir harfi kontrol edecegiz.
* Tekrar edenleri bir sete ,tekrar etmeyenleri ise baska bir sete atalım.
* .*/
public class Quest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> tekrarEden = new HashSet<>();
		Set<Character> tekrarEtmeyen = new HashSet<>();
		System.out.print("bir kelime giriniz: ");
		String userInput = sc.nextLine().toLowerCase();
		
		for (int i = 0; i < userInput.length(); i++) {
			char currentChar = userInput.charAt(i);
			if (tekrarEtmeyen.contains(currentChar)) {
				tekrarEden.add(currentChar);
				tekrarEtmeyen.remove(currentChar);
			} else if (!tekrarEden.contains(currentChar)) {
				tekrarEtmeyen.add(currentChar);
			}
		}
		System.out.println("Tekrar eden karakterler:");
		tekrarEden.forEach(System.out::println);
		
		System.out.println("Tekrar etmeyen karakterler:");
		tekrarEtmeyen.forEach(System.out::println);
	}
}