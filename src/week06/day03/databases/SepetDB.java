package week06.day03.databases;

import week06.day03.entities.SepetDetay;

import java.util.ArrayList;
import java.util.List;

public class SepetDB {
	static List<SepetDetay> sepetList = new ArrayList<>();
	
	
	public static void addSepet(SepetDetay sepetUrun) {
		sepetList.add(sepetUrun);
	}
	
	public static List<SepetDetay> sepetListAll() {
		for (SepetDetay sepetUrun : sepetList) {
			System.out.println(sepetUrun);
		}
		return sepetList;
	}
	
	public static SepetDetay findBySepetUrunID(Integer urunID) {
		if (sepetList.isEmpty()) {
			return null;
		}
		for (SepetDetay sepetUrun : sepetList) {
			if (sepetUrun.getUrunID() == urunID) {
				return sepetUrun;
			}
		}
		return null;
	}
	
	
	public static boolean removeSepetUrunBySepetDetayID(Integer sepetID) {
		for (SepetDetay sepetUrun : sepetList) {
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
	
	
	public static boolean sepettenUrunEksilt(SepetDetay sepetUrun, int silAdet) {
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
}