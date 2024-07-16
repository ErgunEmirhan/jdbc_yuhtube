package week03.day05.menu_with_methods;

import week03.day05.menu_with_methods.english.EngMenu;
import week03.day05.menu_with_methods.turkce.TurkceMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static boolean isRuning;
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int userSelection;
		do {
			System.out.println("Hosgeldiniz!/Welcome!");
			System.out.println("Lutfen dil seciniz/Please choose a language");
			System.out.println("1-Turkce");
			System.out.println("2-English");
			System.out.println("0-Exit");
			System.out.print("selection: ");
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				System.out.println("Lutfen gecerli bir sayisal deger giriniz!\n");
				isRuning = true;
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userSelection) {
				case 1: {
					TurkceMenu tr = new TurkceMenu();
					tr.trMenuOptions();
					break;
				}
				case 2: {
					EngMenu eng = new EngMenu();
					eng.engMenuOptions();
					break;
				}
				case 0: {
					isRuning = false;
					break;
				}
				default:
					System.out.println("\nPlease enter a valid value!");
					System.out.println("Lutfen gecerli bir deger giriniz!\n");
					isRuning = true;
			}
		} while (isRuning);
		
		
	}
}