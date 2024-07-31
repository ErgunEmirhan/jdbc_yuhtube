package assignment.week06;
//Bir String ifadesindeki tüm karakterlerin benzersiz (unique) olup olmadığını kontrol eden bir Java fonksiyonu nasıl yazılır?
public class Quest05 {
	public static void main(String[] args) {
		String word = "Den";
		boolean isRepeating = false;
		
		for (int i = 0; i < word.length(); i++){
			for (int j = i+1; j < word.length(); j++){
				if (word.charAt(i) == word.charAt(j)){
					isRepeating = true;
					break;
				}
			}
		}
		if (isRepeating){
			System.out.println(word+ " has not contains unique chars!");
		}else
		System.out.println(word + " contains unique chars!");
	}

}