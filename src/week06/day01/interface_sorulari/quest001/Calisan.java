package week06.day01.interface_sorulari.quest001;

public class Calisan {
	private String isim;
	private String soyisim;
	private String unvan;
	private double maas;
	
	{
		CalisanDB.calisanlar.add(this);
	}
	
	public void maasAl(){
		System.out.println("maaş alındı!");
	}
	public void izinAl(){
		System.out.println("izin alindi!");
	}
	public void fazlaMesayiYap(){
		System.out.println("fazla mesai yapildi");
	}
	
	//Getter & Setter
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyIsim) {
		this.soyisim = soyIsim;
	}
	
	public String getUnvan() {
		return unvan;
	}
	
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	
	
	@Override
	public String toString() {
		return "isim='" + getIsim() + '\'' +
				", soyIsim='" + getSoyisim() + '\'' +
				", unvan='" + getUnvan() + '\'' +
				", maas=" + getMaas();
	}
}