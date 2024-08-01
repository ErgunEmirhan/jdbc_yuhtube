package week06.day03.databases;

import week06.day03.entities.UrunSepetDetay;

import java.util.ArrayList;
import java.util.List;

public class SepetUrunDetayDB {
	static List<UrunSepetDetay> sepetList = new ArrayList<>();
	
	
	public static void addSepet(UrunSepetDetay sepetUrun) {
		sepetList.add(sepetUrun);
	}
	
	public static List<UrunSepetDetay> sepetListAll() {
		for (UrunSepetDetay sepetUrun : sepetList) {
			System.out.println(sepetUrun);
		}
		return sepetList;
	}
	public static List<UrunSepetDetay> sepetGetAll() {
		return sepetList;
	}
	
	public static UrunSepetDetay findBySepetUrunID(Integer urunID) {
		if (sepetList.isEmpty()) {
			return null;
		}
		for (UrunSepetDetay sepetUrun : sepetList) {
			if (sepetUrun.getUrunID() == urunID) {
				return sepetUrun;
			}
		}
		return null;
	}
	
	
	public static boolean removeSepetUrunBySepetDetayID(Integer sepetID) {
		for (UrunSepetDetay sepetUrun : sepetList) {
			if (sepetID == sepetUrun.getSepetDetayID()) {
				sepetList.remove(sepetUrun);
				return true;
			}
		}
		return false;
	}
	
	public static void removeAllSepet() {
		sepetList.removeAll(sepetList);
	}
	
	
	public static boolean sepettenUrunEksilt(UrunSepetDetay sepetUrun, int silAdet) {
		int sepetAdet = sepetUrun.getSepetAdet();
		if (sepetAdet < silAdet){
			return false;
		}
		else if (sepetAdet == silAdet) {
			removeSepetUrunBySepetDetayID(sepetUrun.getSepetDetayID());
			return true;
		}else {
			sepetUrun.setSepetAdet(sepetAdet-silAdet);
			sepetUrun.setToplamFiyat(sepetUrun.getAdetFiyat(), sepetUrun.getSepetAdet());
			return true;
		}
	}
	
	public static Double getToplamSepetFiyat() {
		Double toplamFiyat = 0.0;
		for (UrunSepetDetay sepet: sepetList){
			toplamFiyat += sepet.getToplamFiyat();
		}
		return toplamFiyat;
	}
}