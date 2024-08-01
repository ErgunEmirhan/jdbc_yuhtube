package week06.day03.databases;

import week06.day03.entities.Satis;
import week06.day03.entities.UrunSepetDetay;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Satis> findSatisByUserID(int userID) {
		ArrayList<Satis> userSatisArrayList = new ArrayList<>();
		for (Satis satis : satisArrayList) {
			if (satis.getUser() == userID){
				userSatisArrayList.add(satis);
			}
		}
		return userSatisArrayList;
	}
}