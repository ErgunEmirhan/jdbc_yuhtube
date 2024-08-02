package week06.day03.entities;

import java.util.ArrayList;
import java.util.List;

public class Satis {
	
	private Integer sepetID;
	private String fatura_uuid;
	private Double toplamSatisFiyat;
	
	public String getFatura_uuid() {
		return fatura_uuid;
	}
	
	public void setFatura_uuid(String fatura_uuid) {
		this.fatura_uuid = fatura_uuid;
	}
	
	public Integer getSepetID() {
		return sepetID;
	}
	
	public void setSepetID(Integer sepetID) {
		this.sepetID = sepetID;
	}
	
	public Double getToplamSatisFiyat() {
		return toplamSatisFiyat;
	}
	
	public void setToplamSatisFiyat(Double toplamSatisFiyat) {
		this.toplamSatisFiyat = toplamSatisFiyat;
	}
	
	@Override
	public String toString() {
		return "Satis{" + "fatura_uuid='" + getFatura_uuid() + '\'' + ", sepetID=" + getSepetID() + ", toplamSatisFiyat=" + getToplamSatisFiyat() + '}';
	}
}