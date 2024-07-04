package week02.day04;

import java.util.Scanner;

/*
 Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta yazdıracağım.
 * */
public class Quest01 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String userInput;
   int stringLength;
   System.out.print("İsiminizi giriniz: ");
   userInput = sc.nextLine();
   stringLength = userInput.length();
   for (int i = 0; i<stringLength; i++){
    System.out.println("index: " + i + " letter: "+ userInput.charAt(i));
   }
  }
}