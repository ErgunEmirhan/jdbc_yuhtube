package week03.day03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 1- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece
    çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
*/
public class Quest001 {
	public static void main(String[] args) {
		// userMenu
		calculatorSelectionMenu();
	}
	
	private static void calculatorSelectionMenu() {
		boolean isRuning = true;
		Scanner sc = new Scanner(System.in);
		int userSelection;
		do {
			System.out.println("\n----CALCULATOR----");
			System.out.println("1- Addition");
			System.out.println("2- Subtraction");
			System.out.println("3- Division");
			System.out.println("4- Multiplication");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter numeric value for the menu selection!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userSelection) {
				case 1: { //Addition
					System.out.println("## Addition ##");
					getAddition(getTwoNumbersFromUser());
					break;
				}
				case 2: { // Subtraction
					System.out.println("## Subtraction ##");
					getSubtraction(getTwoNumbersFromUser());
					break;
				}
				case 3: { // Division
					System.out.println("## Division ##");
					getDivision(getTwoNumbersFromUser());
					break;
				}
				case 4: { //Multiplication
					System.out.println("## Multiplication ##");
					getMultiplication(getTwoNumbersFromUser());
					break;
				}
				case 0: {
					System.out.println("Have nice day!");
					isRuning = false;
					break;
				}
				default:
					System.out.println("Please enter valid value for menu selection!(1-4)/0->exit");
			}
			
		} while (isRuning);
	}
	
	private static int[] getTwoNumbersFromUser(){
		int[] inputNumArr= new int[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the first value: ");
		inputNumArr[0] = sc.nextInt();
		System.out.print("Please enter the second value: ");
		inputNumArr[1] = sc.nextInt();
		return inputNumArr;
	}
	
	private static void getAddition(int[] numArr) {
		int num = numArr[0];
		int num1 = numArr[1];
		int result = num + num1;
		System.out.println("result: "+ result);
		
	}
	
	private static void getSubtraction(int[] numArr) {
		int num = numArr[0];
		int num1 = numArr[1];
		int result = num-num1;
		System.out.println("result: "+ result);
	}
	
	private static void getDivision(int[]numArr) {
		int num = numArr[0];
		int num1 = numArr[1];
		
		if (num1 == 0){
			System.out.println("\nThere cannot be a divisor of 0");
		}
		else{
			double result = (double)num/num1;
			System.out.println("result: "+ result);
		}
		
	}
	
	private static void getMultiplication(int[]numArr) {
		int num = numArr[0];
		int num1 = numArr[1];
		int result = num*num1;
		System.out.println("result: "+ result);
	}
}