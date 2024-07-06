package week02.day04;

import java.util.Scanner;

/*"Java,React,Spring" String degerinden bir for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.*/
public class Quest03 {
	public static void main(String[] args) {
		String mainValue = "Java,React,Spring", output;
		int mainValueLength = mainValue.length(), startIndex = 0;
		for (int i = 0; i < mainValueLength; i++) {
			if (mainValue.charAt(i) == ',') {
				output = mainValue.substring(startIndex, i);
				startIndex = i +1;
				System.out.println(output);
			}
		}
		System.out.println(mainValue.substring(startIndex)+ "\n");
		
//		Çözüm 2
		for (int i = 0; i < mainValueLength; i++){
			if (mainValue.charAt(i) == ','){
				System.out.println();
			}
			else {
				System.out.print(mainValue.charAt(i));
			}
		}
//	Çözüm 3
		System.out.println("\n");
		mainValue = mainValue.replace(",", "\n");
		System.out.println(mainValue);
	
	}
}