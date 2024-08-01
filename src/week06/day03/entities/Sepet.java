package week06.day03.entities;

import java.util.ArrayList;
import java.util.List;

public class Sepet{
	static int sepetIDCounter = 0;
	private Integer sepetID;
	List<UrunSepetDetay> sepetDetayList;
	User user;
	private Double toplamFiyat;
	
	public Sepet() {
		this.sepetID = sepetIDCounter++;
	}
	
	public List<UrunSepetDetay> getSepetDetayList() {
		return sepetDetayList;
	}
	
	public void setSepetDetayList(List<UrunSepetDetay> sepetDetayList) {
		this.sepetDetayList = sepetDetayList;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}