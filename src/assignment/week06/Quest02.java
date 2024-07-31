package assignment.week06;

import java.util.Arrays;

//Bir dizideki maksimum ve minimum değerleri bulan bir Java metodunu nasıl yazarsınız?
public class Quest02 {
	public static void main(String[] args) {
		int minValue, maxValue;
		int[] sayilar = {8,3,13,400,-1,60,9};
		Arrays.sort(sayilar);
		minValue = sayilar[0];
		maxValue = sayilar[sayilar.length-1];
		System.out.println("min: "+minValue);
		System.out.println("max: "+maxValue);
	}
}