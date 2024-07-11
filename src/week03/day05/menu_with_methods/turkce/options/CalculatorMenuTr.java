package week03.day05.menu_with_methods.turkce.options;

import week03.day05.menu_with_methods.CommonMethods.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenuTr {
	Calculator calc = new Calculator();
	Scanner sc = new Scanner(System.in);
	boolean isRuning = true;
	double resultDb = 0.0;
	int userSelection, result;
	
	public void calcTr() {
		do {
			System.out.println("\n----Hesap Makinesi----");
			System.out.println("1-Toplama");
			System.out.println("2-Cikarma");
			System.out.println("3-Carpma");
			System.out.println("4-Bolme");
			System.out.println("0-Geri don");
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
				case 1: { // Toplama
					result = calc.addition(getNumsFromUser());
					System.out.println("result: " + result);
					break;
				}
				case 2: { // Cikarma
					result = calc.subtraction(getNumsFromUser());
					System.out.println("result: " + result);
					break;
					
				}
				case 3: { // Carpma
					result = calc.multiplication(getNumsFromUser());
					System.out.println("result: " + result);
					break;
				}
				case 4: { // Bolme
					resultDb = calc.division(getNumsFromUser());
					System.out.println("result: " + resultDb);
					break;
				}
				case 0: {
					isRuning = false;
					break;
				}
				default:
					System.out.println("Lutfen gecerli bir deger giriniz!\n");
			}
		} while (isRuning);
	}
	
	public void scientificCalcTr() {
		int num;
		do {
			System.out.println("\n----Bilimsel Hesap Makinesi----");
			System.out.println("1-Us alma");
			System.out.println("2-Karekok alma");
			System.out.println("0-Geri don");
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
				case 1: { // Us alma
					System.out.print("\nTaban degerini giriniz: ");
					num = sc.nextInt();
					System.out.print("Us degerini giriniz: ");
					int num2 = sc.nextInt();
					resultDb = calc.powerOfNum(num, num2);
					System.out.println("result: " + resultDb);
					break;
				}
				case 2: { // Karekok alma
					System.out.print("\nkok ici degerini giriniz: ");
					num = sc.nextInt();
					resultDb = calc.sqrtOfNum(num);
					System.out.println("result: " + resultDb);
					break;
					
				}
				case 0: {
					isRuning = false;
					break;
				}
				default:
					System.out.println("Lutfen gecerli bir deger giriniz!\n");
			}
		} while (isRuning);
	}
	
	public int[] getNumsFromUser() {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[2];
		System.out.print("\nIlk degeri giriniz: ");
		numArr[0] = sc.nextInt();
		System.out.print("Ikinci degeri giriniz: ");
		numArr[1] = sc.nextInt();
		return numArr;
	}
	
	
}