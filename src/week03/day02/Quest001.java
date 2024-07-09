package week03.day02;
/*
1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
*/

import java.util.Scanner;

public class Quest001 {
	public static void main(String[] args) {
		String[] countries = {"Turkiye","Japonya","Mogolistan", "Amerika", "Rusya", "Cin"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a country: ");
		String userInput = sc.nextLine();
		boolean isCountryPresent = false;
		
		for (String item: countries){
			if (item.equals(userInput)){
				isCountryPresent = true;
				break;
			}
		}
		System.out.println(isCountryPresent?"Country exist in array!": "Country does not exist in array!");
	}
}