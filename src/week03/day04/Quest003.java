package week03.day04;

import java.util.Scanner;

/*
3- Kullanici disaridan bir sayi girecek.

Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim
*/
public class Quest003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a numeric value: ");
		int userInput = sc.nextInt();
		double result = decreaseByOneAndHalf(userInput);
		System.out.println(result);
	}
	private  static double decreaseByOneAndHalf(int userInput){
		return stepFour(stepThree(stepTwo(stepOne(userInput))));
	}
	private static int stepOne(int userInput) {
		return userInput +50;
	}
	
	private static int stepTwo(int stepOneValue) {
		return (stepOneValue*30);
	}
	
	private static int stepThree(int stepTwoValue) {
		return stepTwoValue -40;
	}
	
	private static double stepFour(int stepThreeValue) {
		return stepThreeValue /20.0;
	}
}