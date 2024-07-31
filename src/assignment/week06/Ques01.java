package assignment.week06;
//Bir String içindeki tüm sesli harfleri kaldıran bir Java fonksiyonu nasıl yazılır?
public class Ques01 {
	public static void main(String[] args) {
		String metin = "Sesli harfler yok olacak";
		String sessizMetin= "";
		
		for(int i = 0; i<metin.length(); i++){
			switch(metin.charAt(i)){
				case 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü':
					break;
				default:
				sessizMetin+= metin.charAt(i);
			}
		}
		System.out.println(sessizMetin);
	}
}