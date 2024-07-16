package week03.day05.menu_with_methods.english;

import week03.day05.menu_with_methods.Menu;
import week03.day05.menu_with_methods.english.options.CalculatorMenuEng;
import week03.day05.menu_with_methods.english.options.DrawTriangleMenuEng;


import java.util.InputMismatchException;
import java.util.Scanner;

public class EngMenu {
	public void engMenuOptions() {
		Scanner sc = new Scanner(System.in);
		CalculatorMenuEng calc = new CalculatorMenuEng();
		DrawTriangleMenuEng triangleMenu = new DrawTriangleMenuEng();
		boolean isRuningTr = true;
		int userSelection;
		do {
			System.out.println("\n----English Menu----");
			System.out.println("1-Calculator");
			System.out.println("2-Scientific Calculator");
			System.out.println("3-Draw triangle with \"*\"");
			System.out.println("4-Language");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter a numeric value!\n");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userSelection) {
				case 1: { // Hesap Makinesi
					calc.calcEng();
					break;
				}
				case 2: { //  Us/karekök alma
					calc.scientificCalcEng();
					break;
				}
				case 3: { // '*' ile ucgen cizme
					triangleMenu.DrawTriangleEng();
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
					System.out.println("Please enter a valid value!\n");
			}
		} while (isRuningTr);
	}
}