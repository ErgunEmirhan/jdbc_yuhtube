package week03.day04;

import java.util.Scanner;

/*
2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
*/
public class Quest002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many input value would you like to enter? ");
		System.out.print("Please select 2 or 3 : ");
		int inputSize = sc.nextInt();
		
		int result;
		switch (inputSize){
			case 2:{
				result = additionOfNumbers();
				System.out.println("Addition of two number you entered is: "+ result);
				break;
			}
			case 3: {
				System.out.println("Please enter first value: ");
				int num = sc.nextInt();
				System.out.println("Please enter second value: ");
				int num1 = sc.nextInt();
				System.out.println("Please enter third value: ");
				int num2 = sc.nextInt();
				result = additionOfNumbers(num, num1, num2);
				System.out.println("Addition of three number you entered is: "+ result);
				break;
			}
			default:
				System.out.println("number that you enter is not valid one!");
		}
	}
	
	private static int additionOfNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first value: ");
		int num = sc.nextInt();
		System.out.println("Please enter second value: ");
		int num1 = sc.nextInt();
		int result = num+num1;
		return result;
	}
	private static int additionOfNumbers(int num, int num1, int num2) {
		int result = num+num1+num2;
		return result;
	}
}