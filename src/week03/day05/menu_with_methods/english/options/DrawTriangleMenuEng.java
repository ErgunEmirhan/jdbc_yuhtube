package week03.day05.menu_with_methods.english.options;

import week03.day05.menu_with_methods.CommonMethods.DrawTriangle;
import week03.day05.menu_with_methods.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrawTriangleMenuEng {
	Scanner sc = new Scanner(System.in);
	public void DrawTriangleEng(){
		boolean isRuning = true;
		int userSelection;
		DrawTriangle optTriangle = new DrawTriangle();
		do {
			System.out.println("\n----Draw a Triangle----");
			System.out.println("1-Right triangle");
			System.out.println("2-Inverted right triangle");
			System.out.println("3-Equilateral triangle");
			System.out.println("4-Inverted equilateral triangle");
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
				case 1: { // Dik ucgen
					optTriangle.rightTriangle(getSizeFromUser());
					break;
				}
				case 2: { //  ters dik ucgen
					optTriangle.invertedRightTriangle(getSizeFromUser());
					break;
				}
				case 3: { // eskenar ucgen
					optTriangle.equilateralTriangle(getSizeFromUser());
					break;
				}
				case 4: { // ters eskenar ucgen
					// !HATA: Çıktı vermiyor?
					optTriangle.invertedEquilateralTriangle(getSizeFromUser());
					break;
				}
				case 0: {
					isRuning = false;
					Menu.isRuning = false;
					break;
				}
				default:
					System.out.println("Please enter a valid value!\n");
			}
		} while (isRuning);
	}
	int getSizeFromUser(){
		System.out.print("Enter the size of a triangle: ");
		return sc.nextInt();
	}
}