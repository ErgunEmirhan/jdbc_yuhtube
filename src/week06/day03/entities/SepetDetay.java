package week06.day03.entities;

import java.text.DecimalFormat;

//TODO: Biling detaydan extend et.
public class SepetDetay{
	static private Integer sepetDetayIDCounter = 0;
	static DecimalFormat df = new DecimalFormat("#.00");
	
	private Integer sepetDetayID;
	private Integer UrunID;
	private String urunAdi;
	private Integer sepetAdet;
	private Double adetFiyat;
	private Double toplamFiyat;
	
	
	public Integer getSepetDetayID() {
		return sepetDetayID;
	}
	
	public SepetDetay() {
		this.sepetDetayID = sepetDetayIDCounter++;
	}
	
	public Double getAdetFiyat() {
		return adetFiyat;
	}
	
	public void setAdetFiyat(Double adetFiyat) {
		this.adetFiyat = adetFiyat;
	}
	
	public Integer getSepetAdet() {
		return sepetAdet;
	}
	
	public void setSepetAdet(Integer sepetAdet) {
		this.sepetAdet = sepetAdet;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double fiyat, Integer adet) {
		this.toplamFiyat = Double.valueOf(df.format(fiyat*adet));
	}
	
	public String getUrunAdi() {
		return urunAdi;
	}
	
	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
	
	public Integer getUrunID() {
		return UrunID;
	}
	
	public void setUrunID(Integer urunID) {
		UrunID = urunID;
	}
	
	@Override
	public String toString() {
		return "SepetDetay{" + "sepetDetayID=" + sepetDetayID +
				", UrunID=" + getUrunID() +
				", urunAdi='" + getUrunAdi() + '\'' +
				", sepetAdet=" + getSepetAdet() +
				", adetFiyat=" + getAdetFiyat() +
				", toplamFiyat=" + getToplamFiyat() + '}';
	}
}