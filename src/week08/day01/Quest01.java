package week08.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1- Bir film uygulaması için String kategori tuttuğumuzu düşünün.
 * Kullanıcıdan kategori alıp bu kategoriyi bir collection yapısına ekleyeceğimiz bir metot yazalım.
 * Bu metot, eğer kategori daha önce eklenmemişse başarıyla eklendiğine dair bir mesaj döndürmelidir.
 * Eğer kategori daha önce eklenmişse, bununla ilgili bir uyarı mesajı döndürmelidir.
 * */
public class Quest01 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<String> kategori = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			
			katagoriEkle(kategori);
		}
	}
	
	private static void katagoriEkle(List<String> kategori) {
		System.out.print("Bir kategori giriniz: ");
		String userInput = sc.nextLine();
		for (String item : kategori){
			if (item.equals(userInput)){
				System.out.println("Bu kategori var");
				return;
			}
		}
		kategori.add(userInput);
		System.out.println("Ekleme işlemi başarıyla gerçekleştirildi.");
	}
}