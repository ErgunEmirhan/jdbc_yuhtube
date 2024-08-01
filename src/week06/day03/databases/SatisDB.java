package week06.day03.databases;

import week06.day03.entities.Satis;
import week06.day03.entities.UrunSepetDetay;

import java.util.ArrayList;

public class SatisDB {
	static ArrayList<Satis> satisArrayList = new ArrayList<>();
	
	public static void addSatis(Satis satis) {
		satisArrayList.add(satis);
	}
	
	public static void sepetListAll() {
		for (Satis satis : satisArrayList) {
			System.out.println(satis);
		}
	}
}