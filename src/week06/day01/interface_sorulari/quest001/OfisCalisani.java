package week06.day01.interface_sorulari.quest001;

public class OfisCalisani extends Calisan implements IMaasaGoreUnvanAlabilir {
	public OfisCalisani(String isim, String soyIsim, double maas) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.setSoyIsim(soyIsim);
		this.setMaas(maas);
		setUnvan(maas);
	}
	
	@Override
	public void setUnvan(double maas) {
		if (maas >= 30000) {
			this.setUnvan("Kidemli Çalişan");
		}
		else if (maas >= 20000) {
			this.setUnvan("Çalışan");
		}
		else {
			this.setUnvan("Stajyer Çalışan");
		}
	}
}