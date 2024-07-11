package week03.day05.menu_with_methods.turkce;

import week03.day05.menu_with_methods.Menu;
import week03.day05.menu_with_methods.turkce.options.CalculatorMenuTr;
import week03.day05.menu_with_methods.turkce.options.DrawTriangleMenuTr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TurkceMenu {
	public void trMenuOptions() {
		Scanner sc = new Scanner(System.in);
		CalculatorMenuTr calc = new CalculatorMenuTr();
		DrawTriangleMenuTr triangleMenu = new DrawTriangleMenuTr();
		boolean isRuningTr = true;
		int userSelection;
		do {
			System.out.println("\n----Turkce Menu----");
			System.out.println("1-Hesap Makinesi");
			System.out.println("2-Us/Karekok alma");
			System.out.println("3-'*' ile ucgen cizme");
			System.out.println("4-Dil Secimi");
			System.out.println("0-Cikis");
			System.out.print("seceneginiz: ");
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Lutfen gecerli bir sayisal deger giriniz!\n");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userSelection) {
				case 1: { // Hesap Makinesi
					calc.calcTr();
					break;
				}
				case 2: { //  Us/karekök alma
					calc.scientificCalcTr();
					break;
				}
				case 3: { // '*' ile ucgen cizme
					triangleMenu.DrawTriangleTr();
					break;
				}
				case 4: { //Dil seçimine geri don
					Menu.isRuning = true;
					isRuningTr = false;
					break;
				}
				case 0: {
					isRuningTr = false;
					Menu.isRuning = false;
					break;
				}
				default:
					System.out.println("Lutfen gecerli bir deger giriniz!\n");
			}
		} while (isRuningTr);
	}
}