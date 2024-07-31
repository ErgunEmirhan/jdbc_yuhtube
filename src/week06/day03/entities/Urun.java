package week06.day03.entities;


public abstract class Urun {
	static protected int urunIDCount = 0;
	
	protected String urunAdi;
	protected Double fiyat;
	protected Integer stokAdet;
	protected Integer urunID;
	//TODO:Açıklama ekle.
	
	public Urun(Double fiyat, Integer stokAdet, String urunAdi) {
		this.fiyat = fiyat;
		this.stokAdet = stokAdet;
		this.urunAdi = urunAdi;
		this.urunID = ++urunIDCount;
	}
	
	public Integer getUrunID() {
		return urunID;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public Integer getStokAdet() {
		return stokAdet;
	}
	
	public void setStokAdet(Integer stokAdet) {
		this.stokAdet = stokAdet;
	}
	
	public String getUrunAdi() {
		return urunAdi;
	}
	
	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
	
	@Override
	public String toString() {
		return "Urun{" + "fiyat=" + getFiyat() + ", urunAdi='" + getUrunAdi() + '\'' + ", stokAdet=" + getStokAdet() + ", urunID=" + getUrunID() + '}';
	}
}