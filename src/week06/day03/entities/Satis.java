package week06.day03.entities;

import java.util.ArrayList;
import java.util.List;

public class Satis {
	static int sepetIDCounter = 0;
	private Integer sepetID;
	private String faturaUUID;
	UrunSepetDetay sepetDetayList;
	Integer user;
	private Double toplamFiyat;
	
	public Satis() {
		this.sepetID = sepetIDCounter++;
		
	}
	
	public String getFaturaUUID() {
		return faturaUUID;
	}
	
	public void setFaturaUUID(String faturaUUID) {
		this.faturaUUID = faturaUUID;
	}
	
	public UrunSepetDetay getSepetDetayList() {
		return sepetDetayList;
	}
	
	public void setSepetDetayList(UrunSepetDetay sepetDetayList) {
		this.sepetDetayList = sepetDetayList;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	public Integer getUser() {
		return user;
	}
	
	public void setUser(Integer user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Satis{" + "faturaUUID='" + getFaturaUUID() + '\'' + ", sepetID=" + sepetID + ", sepetDetayList=" + getSepetDetayList() + ", user=" + getUser() + ", toplamFiyat=" + getToplamFiyat() + '}';
	}
}