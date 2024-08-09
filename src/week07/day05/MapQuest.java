package week07.day05;

import java.util.HashMap;
import java.util.Map;

/*
* Map<k,Map<k,v>> yapsinda icerideki mapin icerdigi degerleri yazdiralim.*/
public class MapQuest {
	public static void main(String[] args) {
		Map<String,Map<String,Map<Integer,String>>> mapMapMap = new HashMap<>();
		mapMapMap.put("Mutfak",
		              new HashMap<>(Map.of("Beyaz Eşya",
		                                   new HashMap<>(Map.of(1,"buz dolabı",2,"bulaşık makinesi",3,"ocak")))));
		mapMapMap.put("Tatlı",
		              new HashMap<>(Map.of("Baklava",
		                                   new HashMap<>(Map.of(1,"şerbet",2,"yufka",3,"antep fıstık")))));
		for (Map.Entry<String, Map<String, Map<Integer,String>>> stringEntryEntry: mapMapMap.entrySet()){
			System.out.println(stringEntryEntry.getKey());
			for (Map.Entry<String,Map<Integer,String>> lowerEntry: stringEntryEntry.getValue().entrySet()){
				System.out.println(lowerEntry.getKey());
				for (Map.Entry<Integer,String> lowlowerEnty : lowerEntry.getValue().entrySet()){
					System.out.println(lowlowerEnty);
				}
			}
		}
		mapMapMap.forEach((outerKey, innerMap)
				                  -> innerMap.forEach((innerKey, innerValue)
						                                      -> System.out.println(outerKey + " -> " + innerKey + " -> " + innerValue))
		);
	}
}