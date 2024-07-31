package assignment.week06;

import java.util.Arrays;

public class Quest07 {
	//Bir dizideki çift ve tek sayıları, sırasını koruyarak iki farklı diziye ayıran bir Java metodunu nasıl yazarsınız?
	public static void main(String[] args) {
		int [] sayilar = {10,23,42,321,553,65,1,23,7,54,32};
		int [] even = new int[0];
		int[] odd = new int[0];
		int evenSize = 0, oddSize =0;
		for (int i = 0; i< sayilar.length; i++){
			if (sayilar[i] % 2 == 0){
					++evenSize;
					int []tmp = new int[evenSize];
					for (int j = 0; j < evenSize-1; j++){
						tmp[j] = even[j];
					}
					tmp[evenSize-1] = sayilar[i];
					even = tmp;
			}
			else {
				++oddSize;
				int []tmp = new int[oddSize];
				for (int j = 0; j < oddSize-1; j++){
					tmp[j] = odd[j];
				}
				tmp[oddSize-1] = sayilar[i];
				odd = tmp;
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
}