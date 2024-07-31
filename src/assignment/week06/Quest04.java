package assignment.week06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// Bir metnin içindeki kelime frekanslarını nasıl hesaplarsınız?
public class Quest04 {
	public static void main(String[] args) {
		Map<String, Integer> wordMap = new HashMap<>();
		ArrayList<String> wordArrList = new ArrayList<>();
		String sentence = """
				Lorem ipsum odor amet, consectetuer adipiscing elit.
				Eleifend lacus aliquet sapien laoreet penatibus.
				Adipiscing dis vehicula interdum inceptos fames torquent.
				Blandit leo porta nascetur congue gravida elit primis.
				""";
		int startIndex = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == ' ') || (sentence.charAt(i) == '\n')) {
				String tmp = "";
				tmp = sentence.substring(startIndex, i);
				if (tmp.contains(".") || tmp.contains(",")) {
					wordArrList.add(sentence.substring(startIndex, i - 1).trim());
					startIndex = i + 1;
					continue;
				}
				wordArrList.add(tmp.trim());
				startIndex = i + 1;
			}
		}
//		System.out.println(wordArrList);
		for (String word: wordArrList){
			Integer freq = wordMap.get(word);
			wordMap.put(word, (freq == null)? 1:++freq);
		}
		System.out.println(wordMap);
	}
}