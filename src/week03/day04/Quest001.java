package week03.day04;

import java.util.Scanner;

/*
1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
 
Örnegin;

Çadır - > Cadir
* */
public class Quest001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an turkish word with contains turkish letter: ");
		String userInput = sc.nextLine();
		Quest001 methods = new Quest001();
		String englishLetter = methods.convertToEngLetter(userInput);
		System.out.println(englishLetter);
	}
	
	 String convertToEngLetter(String userInput) {
		 String[] engChar = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		 String[] trChars = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		 for (int i = 0; i<trChars.length; i++){
			 userInput = userInput.replace(trChars[i],engChar[i]);
		 }
		 return userInput;
	}
}