package week07.day05;

import java.util.Scanner;
import java.util.Stack;

/*
2- Disaridan bir metin girelim. Girdigimiz metni bir stack'e bir metot araciligiyla atayalim.
Stack<> stack = new Stack();
ihtiyacimiz olacak stack metotlari;
.pop
.push
metotlarin nasil kullanildigini dokumantasyon araciligiyla ogrenebilirsiniz.
sonra girilen kelimenin palindrom kontrolu icin isPalindrome metoduna kelimeyi gonderelim ve stack kullanarak palindrom kontrolümüzü gerceklestirelim.
* */
public class StackQuest {
	static  Stack<Character> stack = new Stack<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("bir kelime giriniz: ");
		String userInput = sc.nextLine();
		stackOlustur(userInput);
		 if (isPalindrome(userInput)){
			 System.out.println(userInput + " is Palindrome");
		 }
		 else{
			 System.out.println(userInput + " is not Palindrome");
		 }
	}
	
	private static boolean isPalindrome(String userInput) {
		for (int i = 0; i< userInput.length()/2; i++){
			if (userInput.charAt(i) != stack.pop()){
				return false;
			}
		}
		return true;
	}
	
	private static void stackOlustur(String userInput) {
		for (int i = 0; i<userInput.length(); i++){
			stack.push(userInput.charAt(i));
		}
	}
}