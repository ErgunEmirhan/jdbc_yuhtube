package week07.quest01;

public class Ogrenci {
	private int ogrenciNo;
	private String adi;
	
	public Ogrenci(int ogrenciNo, String adi) {
		this.ogrenciNo = ogrenciNo;
		this.adi = adi;
	}
	
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	
	public String getAdi() {
		return adi;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ogrenciNo=" + getOgrenciNo() + ", adi='" + getAdi() +'}';
	}
}