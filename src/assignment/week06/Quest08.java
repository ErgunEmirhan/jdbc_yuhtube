package assignment.week06;

import java.util.Locale;

/*
* Bir String ifadesinin palindrom (tersi de aynı olan kelime) olup olmadığını kontrol eden bir Java fonksiyonu yazın.
* Fonksiyonunuz büyük/küçük harf duyarlılığını ve boşlukları göz ardı etmelidir.
*/
public class Quest08 {
	public static void main(String[] args) {
		String text = "  Ada ";
		text = text.trim();
		String palindrom = "";
		for (int i = text.length()-1; i >= 0; i--){
			palindrom += text.charAt(i);
		}
		if (palindrom.equalsIgnoreCase(text)){
			System.out.println(palindrom.toUpperCase() +" palindrom bir kelimedir!");
		}
		else {
			System.out.println("palindrom değildir. " + palindrom.toLowerCase());
		}
	}
}