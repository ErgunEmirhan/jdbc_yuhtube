package week06.day03.entities;

public class Sepet {
	private Integer userID;
	private Integer sepetID;
	private Urun urun;
	private Integer urunAdet;
	private Double adetFiyat;
	private Double toplamUrunFiyat;
	
	public Double getAdetFiyat() {
		return adetFiyat;
	}
	
	public void setAdetFiyat(Double adetFiyat) {
		this.adetFiyat = adetFiyat;
	}
	
	public Integer getSepetID() {
		return sepetID;
	}
	
	public void setSepetID(Integer sepetID) {
		this.sepetID = sepetID;
	}
	
	public Double getToplamUrunFiyat() {
		return toplamUrunFiyat;
	}
	
	public void setToplamUrunFiyat(Double toplamUrunFiyat) {
		this.toplamUrunFiyat = toplamUrunFiyat;
	}
	
	public Urun getUrun() {
		return urun;
	}
	
	public void setUrun(Urun urun) {
		this.urun = urun;
	}
	
	public Integer getUrunAdet() {
		return urunAdet;
	}
	
	public void setUrunAdet(Integer urunAdet) {
		this.urunAdet = urunAdet;
	}
	
	public Integer getUserID() {
		return userID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
	@Override
	public String toString() {
		return "Sepet{" + "adetFiyat=" + getAdetFiyat() + ", userID=" + getUserID() + ", sepetID='" + getSepetID() + '\'' + ", urun=" + getUrun() + ", urunAdet=" + getUrunAdet() + ", toplamUrunFiyat=" + getToplamUrunFiyat() + '}';
	}
}