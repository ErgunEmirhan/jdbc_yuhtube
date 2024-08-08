package week07.quest01;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class OgrenciMain {
	public static void main(String[] args) {
		List<Ogrenci> studentList = new ArrayList<>();
		
		studentList.add(new Ogrenci(5,"Mehmet Can"));
		studentList.add(new Ogrenci(2,"Alperen İkinci"));
		studentList.add(new Ogrenci(1,"Harun Sakin"));
		studentList.add(new Ogrenci(7,"Mehmet Ertop"));
		studentList.add(new Ogrenci(9,"Alexander Walker"));
		studentList.add(new Ogrenci(10,"Emirhan Can"));
		
		//butun listeyi yazdır.
		System.out.println(studentList);
		System.out.println("###########################################");
		//foreach ile liste elemanlarını teker teker yazdır.
		System.out.println("Foreach ile yazdırma: ");
		for (Ogrenci ogrenci : studentList) {
			System.out.println(ogrenci);
		}
		
		System.out.println("###########################################");
		System.out.println(".get ile belirli indexetki bir ogrenciyi getirme.");
		System.out.println(studentList.get(3));
		
		System.out.println("###########################################");
		System.out.println(".size ile liste boyutu öğrenme: ");
		System.out.println(studentList.size());
		
		System.out.println("###########################################");
		System.out.println(".set ile veri güncelleme: ");
		System.out.println(studentList.set(3, new Ogrenci(studentList.get(3).getOgrenciNo(), "Mehmet Tufan")));
		System.out.println(studentList.get(3));
		
		System.out.println("###########################################");
		System.out.println("isEmpty ile listenin boş olup olmadığına bakma");
//		studentList.clear();
		System.out.println(studentList.isEmpty());
		
		System.out.println("###########################################");
		System.out.println("addAll ile listeye başka bir listeyi ekleyebiliriz.");
		studentList.addAll(List.of(new Ogrenci(13,"Mehmet Ertop"), new Ogrenci(17, "Emine Karabolat")));
		System.out.println(studentList);
		
		System.out.println("###########################################");
		System.out.println("contains ile bir elemanın varlığını sorgulama");
		System.out.println(studentList.contains(new Ogrenci(17, "Emine Karabolat"))); // false döner. Çünkü referans farklı.
		Ogrenci ogrenci = studentList.get(studentList.size()-1);
		System.out.println(studentList.contains(ogrenci));
		
		System.out.println("###########################################");
		System.out.println("Orjinal liste:");
		studentList.forEach(System.out::println);
		System.out.println("Alt liste");
		studentList.subList(3, studentList.size()-1).forEach(System.out::println);
		
		System.out.println("###########################################");
		System.out.println("Listeyi diziye çevirme");
		Ogrenci[] ogrenciArray = studentList.toArray(new Ogrenci[0]);
		for (Ogrenci ogrenciItem : ogrenciArray) {
			System.out.println(ogrenciItem);
		}
		
		System.out.println("###########################################");
		System.out.println("Orjinal liste: ");
		studentList.forEach(System.out::println);
		System.out.println();
		System.out.println("reversed liste");
		Collections.reverse(studentList); // orjinal listenin sırasını bozuyor.
		studentList.forEach(System.out::println);
		Collections.reverse(studentList);
		
		System.out.println("###########################################");
		Collections.sort(studentList, Comparator.comparingInt(Ogrenci::getOgrenciNo));
		studentList.forEach(System.out::println);
		
		System.out.println("###########################################");
		System.out.println("indexOf ile öğrencinin indexini bulma: ");
		System.out.println(studentList.get(studentList.indexOf(ogrenci)));
	}
}