package week03.day02;

/*
8- String'i parçalara ayıralım, bir array'e kaydedelim. Sonra aşağıdaki örnek çıktıyı almaya çalışalım;

"Adana şehrinin plaka kodu : 01"

Aşağdaki şehirler tek bir String degerdir.
-> 01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;
42-Konya
*/
public class Quest008 {
	public static void main(String[] args) {
		String rawString =
				"01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;" +
						"10-Balıkesir;42-Konya";
		int LengthOfString = rawString.length();
		int startIndex = 0, inputCounter = 0;
		String[] inputs = new String[11];
		for (int i = 0; i < rawString.length(); i++) {
			if (rawString.charAt(i) == ';') {
				inputs[inputCounter] = rawString.substring(startIndex, i);
				startIndex = i + 1;
				System.out.println(inputs[inputCounter]);
				inputCounter++;
			}
		}
		inputs[inputCounter] = rawString.substring(startIndex);
		System.out.println(inputs[inputCounter]);
	}
}