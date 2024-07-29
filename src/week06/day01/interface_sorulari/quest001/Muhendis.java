package week06.day01.interface_sorulari.quest001;

public class Muhendis extends Calisan implements ISahaCalismasiYapabilir,IMaasaGoreUnvanAlabilir{
	public Muhendis(String isim, String soyIsim, double maas) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.setSoyIsim(soyIsim);
		this.setMaas(maas);
		setUnvan(maas);

	}
	
	// Çözüm 1
	/*@Override
	public void setUnvan(String unvan) {
		double maas = this.getMaas();
		if (maas >= 50000){
			this.setUnvan("Uzman muh.");
		}
		else if (maas >= 40000){
			this.setUnvan("Kidemli muh.");
		}
		else if (maas >= 30000) {
			this.setUnvan("mühendis");
		}
		else{
			this.setUnvan("Stajyer muh.");
		}
		super.setUnvan(unvan);
	}*/
	
	// Çözüm 2
	@Override
	public void setUnvan(double maas) {
		if (maas >= 50000){
			this.setUnvan("Uzman muh.");
		}
		else if (maas >= 40000){
			this.setUnvan("Kidemli muh.");
		}
		else if (maas >= 30000) {
			this.setUnvan("mühendis");
		}
		else{
			this.setUnvan("Stajyer muh.");
		}
	}
	
	@Override
	public void sahaCalismasiYap() {
		System.out.println("mühendis saha çalışmasında...");
		
	}
	
	@Override
	public String toString() {
		return "Muhendis{" + "isim='" + getIsim() + '\'' + ", maas=" + getMaas() + ", soyIsim='" + getSoyIsim() + '\'' + ", unvan='" + getUnvan() + '\'' + '}';
	}
}