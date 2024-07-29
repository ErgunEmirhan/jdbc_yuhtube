package week06.day01.interface_sorulari.quest001;

public class Calisan {
	private String isim;
	private String soyIsim;
	private String unvan;
	private double maas;
	
	
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
	
	public String getSoyIsim() {
		return soyIsim;
	}
	
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public String getUnvan() {
		return unvan;
	}
	
	public void setUnvan(String unvan) {
		this.unvan = unvan;
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
	
	@Override
	public String toString() {
		return "Calisan{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\'' + ", unvan='" + getUnvan() + '\'' + ", maas=" + getMaas() + '}';
	}
}