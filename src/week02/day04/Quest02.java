package week02.day04;

import java.util.Scanner;
/*2- Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.*/
public class Quest02 {
	public static void main(String[] args) {
		String userInput;
		int stringLength;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir adet cumle giriniz: ");
		userInput = sc.nextLine();
		stringLength = userInput.length();
		int letter_a_counter = 0;
		for (int i = 0; i < stringLength; i++){
			if (userInput.charAt(i) == 'a'){
				letter_a_counter++;
			}
		}
		System.out.println(letter_a_counter+ " adet a harfi var!");
	}
}