package week02.day03;

import java.util.Scanner;

/*3- Girilen sayının mükemmel sayı olup olmadığını gösteren program.*/
// TODO: Yukarıdaki soruyu çöz!
public class Quest03 {
	public static void main(String[] args) {
		int userInput, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		userInput = sc.nextInt();
		for (int i = userInput; i >1; i--){
			if (userInput % i == 0 ){
				result = result + (userInput/i);
			}
			
		}
		if (result == userInput){
			System.out.println("Muk sayi!");
		}
		else {
			System.out.println("Muk sayi degil!");
		}
	}
}