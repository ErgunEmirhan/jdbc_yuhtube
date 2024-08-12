package week08.day01.lucy_numbers;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	static Random rnd = new Random();
	public static void main(String[] args) {
		Map<Integer, Integer> tekrarEdenSayilarLinkedMap = new LinkedHashMap<>();
		List<Integer> sayilarList = new ArrayList<>();
		generateRandomNumber(tekrarEdenSayilarLinkedMap);
		addAllToList(sayilarList, tekrarEdenSayilarLinkedMap);
		List<Integer> lucyNumbersList = selectRandomFromList(sayilarList);
		listAllLucyNumbers(lucyNumbersList);
		List<Integer> BiggerThanFiftyList = lucyNumbersList.stream().filter(o -> o > 50).toList();
		listIfBiggerThanFifty(BiggerThanFiftyList);
		
		// Tüm şanslı sayıların toplamı sayıların toplamı
		Optional<Integer> reduce = lucyNumbersList.stream().reduce(Integer::sum);
		System.out.print("Tüm şanslı sayıların toplamı: ");
		reduce.ifPresent(System.out::println);
		//----
		// 50'den büyük olan sayıların toplamı
		Optional<Integer> total = BiggerThanFiftyList.stream().reduce(Integer::sum);
		System.out.print("50'den büyük olan sayıların toplamı: ");
		total.ifPresent(System.out::println);
		
	}
	
	private static void listIfBiggerThanFifty(List<Integer> lucyNumbersList) {
		System.out.print("50'den büyük olan tüm şanslı sayılar: ");
		String lucyNumsString  = lucyNumbersList.stream()
		                                        .map(String::valueOf)
		                                        .collect(Collectors.joining(" - ", "[ ", " ]"));
		System.out.println(lucyNumsString);
	}
	
	private static void listAllLucyNumbers(List<Integer> lucyNumbersList) {
		System.out.print("Tüm şanslı sayılar: ");
		String lucyNumsString = lucyNumbersList.stream().map(String::valueOf).collect(Collectors.joining(" - ", "[ ", " ]"));
		System.out.println(lucyNumsString);
	}
	
	private static List<Integer> selectRandomFromList(List<Integer> sayilarList) {
		List<Integer> lucyNumbersList = new ArrayList<>();
		while (lucyNumbersList.size() < 10 && !sayilarList.isEmpty()) {
			int randomIndex = rnd.nextInt(sayilarList.size());
			Integer randomNumber = sayilarList.get(randomIndex);
			if (!lucyNumbersList.contains(randomNumber)) {
				lucyNumbersList.add(randomNumber);
			}
		}
		return lucyNumbersList;
	}
	
	private static void addAllToList(List<Integer> sayiarList, Map<Integer, Integer> tekrarEdenSayilarLinkedMap) {
		for (Map.Entry<Integer,Integer> entry: tekrarEdenSayilarLinkedMap.entrySet()){
			for (int i = 0; i< entry.getValue(); i++){
				sayiarList.add(entry.getKey());
			}
		}
	}
	
	static private void  generateRandomNumber(Map<Integer, Integer> tekrarEdenSayilarLinkedMap){
		
		for (int i = 0; i < 10_000; i++){
			Integer randomNumber =  rnd.nextInt(1,101);
			tekrarEdenSayilarLinkedMap.put(randomNumber, tekrarEdenSayilarLinkedMap.getOrDefault(randomNumber, 0) + 1);
		}
	}
}