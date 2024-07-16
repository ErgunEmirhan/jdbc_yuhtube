package week03.day05.menu_with_methods.english.options;

import week03.day05.menu_with_methods.CommonMethods.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenuEng {
	Calculator calc = new Calculator();
	Scanner sc = new Scanner(System.in);
	boolean isRuning = true;
	double resultDb = 0.0;
	int userSelection, result;
	
	public void calcEng() {
		do {
			System.out.println("\n----CALCULATOR----");
			System.out.println("1-Additon");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("0-Return");
			System.out.print("Selection: ");
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter a valid numeric value!\n");
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
					System.out.println("Please enter a valid value!\n");
			}
		} while (isRuning);
	}
	
	public void scientificCalcEng() {
		int num;
		do {
			System.out.println("\n----Scientific Calculator----");
			System.out.println("1-Power of a number");
			System.out.println("2-Square root");
			System.out.println("0-Return");
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
				case 1: { // Us alma
					System.out.print("\nbase number: ");
					num = sc.nextInt();
					System.out.print("power: ");
					int num2 = sc.nextInt();
					resultDb = calc.powerOfNum(num, num2);
					System.out.println("result: " + resultDb);
					break;
				}
				case 2: { // Karekok alma
					System.out.print("\nintra-root value: ");
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
					System.out.println("Please enter a valid value!\n");
			}
		} while (isRuning);
	}
	
	public int[] getNumsFromUser() {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[2];
		System.out.print("\nEnter the first value: ");
		numArr[0] = sc.nextInt();
		System.out.print("Enter the second value: ");
		numArr[1] = sc.nextInt();
		return numArr;
	}
	
	
}