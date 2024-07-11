package week03.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Menu:
 1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu ve index numaralarını
 yazdırın. Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.
 
 2- Dışarıdan bir kelime giriniz. Daha sonra değiştirmek istediğiniz harfi giriniz ve hangi harfle değiştireceğinizi
 belirtin. Eğer kelimemiz içerisinde o harf varsa değiştirsin.
 
 3- Dışarıdan girilen bir kelimeyi ters çevirip yazdıralım. Ayrıca bu kelimenin bir palindrom olup olmadığını kontrol
  edelim (örneğin: "kek", "iki", "kabak", "saippuakivikauppias").
 
 4- Dışarıdan 5 adet kelime girelim. Her kelimenin a, b veya c ile başlayıp başlamadığını kontrol edelim. Ayrı ayrı
 sayfa açıldığını düşünelim; a ile başlayanlar bir sayfaya, b ile başlayanlar bir sayfaya, c ile başlayanlar bir
 sayfaya yazılsın. Diğer harflerle başlayanlar için ayrı bir sayfa düşünelim. Sonrasında girilen 5 adet kelimeyi
 kontrol ettikten sonra elimizde kaç sayfa olduğunu ekrana yazdıralım.

 0 - Çıkış
 */
public class Quest001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userSelection;
		boolean menuControl = true;
		do {
//			Menu:
			System.out.println();
			System.out.println("-----String Operations------");
			System.out.println("1- Count the letters");
			System.out.println("2- Letter replacement");
			System.out.println("3- Palindrome control");
			System.out.println("4- Pagination");
			System.out.println("0- Exit");
			System.out.print("Choose an option: ");
//			Trying to get right value from the user
			try{
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e){
				System.out.println("Please enter an integer value, do not use letters or big numbers.");
				continue;
			}
			finally {
				sc.nextLine();
			}
			
			switch (userSelection) {
				case 1: {
					System.out.println("\n### Count The Letters ###");
					
					System.out.print("Please enter a word: ");
					String word = sc.nextLine().toLowerCase();
					System.out.print("Please enter a letter: ");
					
					char letter = sc.nextLine().toLowerCase().charAt(0);
					
					int letterCounter = 0;
					if (!word.contains(String.valueOf(letter))){
						System.out.println("There are no kind of letter!");
					}
					for (int i = 0; i <word.length(); i++){
						if (word.charAt(i) == letter){
							letterCounter++;
							System.out.println("There is a "+letterCounter+" letter at the "+letter+" in the word " +
									                   "that you've entered.");
						}
					}
					System.out.println("There are amount of "+letterCounter+" letter "+letter+" in the word that " +
							                   "you've entered.");
					break;
				}
				case 2: {
					System.out.println("\n### Letter Replacement ###");
					
					System.out.print("Please enter a word: ");
					String word = sc.nextLine().toLowerCase();
					System.out.print("Please enter a letter to change: ");
					char oldChar = sc.nextLine().toLowerCase().charAt(0);
					System.out.print("Please enter a letter to replace with: ");
					char newChar = sc.nextLine().toLowerCase().charAt(0);
					
					if (!word.contains(String.valueOf(oldChar))){
						System.out.println("There are no kind of letter!");
					}
					else {
						word = word.replace(oldChar, newChar);
					}
					System.out.println(word);
					break;
				}
				case 3: {
					System.out.println("\n### Palindrome Control ###");
					System.out.print("Please enter a word: ");
					String word = sc.nextLine().toLowerCase();
					String reverse = "";
					for (int i = word.length()-1; i >= 0; i--){
						reverse += word.charAt(i);
					}
					if (word.equals(reverse)){
						System.out.println("The word you entered " + word + " is a palindrome " + reverse);
					}
					else {
						System.out.println("The word you entered " + word + " is not a palindrome " + reverse);
					}
					break;
				}
				case 4: {
					int a= 0,b = 0,c= 04,others = 0;
					System.out.println("\n### Pagination ###");
					System.out.println("Please enter 5 words ");
					
					for (int i = 0; i <5; i++){
						System.out.print("Enter a word: ");
						String word = sc.nextLine().toLowerCase();
						
						if (word.charAt(0) == 'a'){
							a = 1;
						}
						else if(word.charAt(0) == 'b'){
							b = 1;
						}
						else if (word.charAt(0) == 'c'){
							c = 1;
						}
						else{
							others +=1;
						}
					}
					int pageNum = a+b+c+others;
					System.out.println("There is/are "+ pageNum + " page/pages");
					break;
				}
				case 0: {
					System.out.println("See you later!");
					menuControl = false;
					break;
				}
				default:
					System.out.println("0-4 arasinda bir secim yapmalısınız!");
			}
		} while (menuControl);
		
	}
}