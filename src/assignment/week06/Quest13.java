package assignment.week06;
/*
* 13.Bir diziyi (Array) parametre olarak alan ve dizideki tüm elemanların ortalamasını hesaplayıp
* geri döndüren bir Java metodunu nasıl yazarsınız?
*/
public class Quest13 {
	public static void main(String[] args) {
		int[] sayilar = {2,3,5,7,10,3,7};
		double ortalama = arrOrt(sayilar);
		System.out.println(ortalama);
	}
	private static double arrOrt(int[] sayilar){
		int toplam = 0;
		for (int sayi: sayilar){
			toplam += sayi;
		}
		return (double) toplam / sayilar.length;
	}
}