package week08.day01;

import java.util.*;

/*
* 4- Aşağıdaki öğrencileri, notlar ile çaprazlayalım.
* String[] ogrenci = { "Ayse", "Ece", "Mahmut" };
* int[][] notlar = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } }
* */
public class Quest04 {
	public static void main(String[] args) {
		String[] ogrencilerArr = { "Ayse", "Ece", "Mahmut" };
		int[][] notlarArr = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } };
		Map<String, List<Integer>> ogrenciNotlarMap = new LinkedHashMap<>();
		for (int i = 0; i< ogrencilerArr.length; i++){
			String ogrenci = ogrencilerArr[i];
			List<Integer> notlar = new ArrayList<>();
			for (int not : notlarArr[i]){
				notlar.add(not);
			}
			ogrenciNotlarMap.put(ogrenci,notlar);
		}
		for (Map.Entry<String,List<Integer>> entry: ogrenciNotlarMap.entrySet()){
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
	}
}