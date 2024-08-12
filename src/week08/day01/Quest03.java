package week08.day01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
* 3- Bir kelime içerisindeki harflerin kaç kez tekrar ettiğini bulmanızı sağlayacak bir program yazalım.
* Kullanıcıdan bir kelime girmesini isteyin. Kullanıcının girdiği bu kelime, harf frekanslarını bulacağınız kelime olacak.
* "merhaba" String'i için örnek çıktı aşağıdaki gibi olmalıdır;
* m = 1; e = 1; r = 1; h = 1; a = 2; b = 1;
* uygulama case sensitive olmamalıdır.
* */
public class Quest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> frekans = new LinkedHashMap<>();
		
		System.out.print("Bir kelime giriniz: ");
		String userInput = sc.nextLine().toLowerCase();
		
		for (char c : userInput.toCharArray()){
			frekans.put(c, frekans.getOrDefault(c, 0)+1);
		}
		frekans.forEach((k,v)-> System.out.println(k +": " +v));
	}
}