package week03.day01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Menu:
 1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu ve index numaralarını
 yazdırın. Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.
 TODO: harf hassasiyetini kaldır. try catch ekle. İngilizce çıktıları grammer olarak düzelt.
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
			System.out.println();
			System.out.println("-----String Operations------");
			System.out.println("1- Count the letters");
			System.out.println("2- Letter replacement");
			System.out.println("1- Palindrome control");
			System.out.println("1- Pagination");
			System.out.println("0- Exit");
			System.out.print("Choose an option: ");
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
					String userString, charCheck;
					char userChar;
					int charCounter = 0;
					boolean isThereChar = false;
					System.out.println("\n ### Count The Letters ###");
					
					System.out.print("Please enter a word: ");
					String word = sc.nextLine();
					System.out.print("Please enter a letter: ");
					char letter = sc.nextLine().charAt(0);
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
					
					break;
				}
				case 3: {
					break;
				}
				case 4: {
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