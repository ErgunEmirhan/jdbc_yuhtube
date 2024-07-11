package week03.day05.menu_with_methods.turkce.options;

import week03.day05.menu_with_methods.CommonMethods.DrawTriangle;
import week03.day05.menu_with_methods.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrawTriangleMenuTr {
	Scanner sc = new Scanner(System.in);
	public void DrawTriangleTr(){
		boolean isRuning = true;
		int userSelection;
		DrawTriangle optTriangle = new DrawTriangle();
		do {
			System.out.println("\n----Ucgen Ciz----");
			System.out.println("1-Dik ucgen");
			System.out.println("2-Ters Dik ucgen");
			System.out.println("3-Eskenar ucgen");
			System.out.println("4-Ters eskenar ucgen");
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
					System.out.println("Lutfen gecerli bir deger giriniz!\n");
			}
		} while (isRuning);
	}
	int getSizeFromUser(){
		System.out.print("Ucgenin boyutunu giriniz: ");
		return sc.nextInt();
	}
}