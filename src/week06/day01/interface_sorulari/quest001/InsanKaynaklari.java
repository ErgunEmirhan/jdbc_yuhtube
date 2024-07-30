package week06.day01.interface_sorulari.quest001;

public class InsanKaynaklari extends Calisan {
	
	
	public  double zamYap(Calisan calisan, double zamOrani){
		double zamliMaas = 0;
		if (zamOrani <=1){
			zamliMaas = calisan.getMaas() + calisan.getMaas()*getMaas();
		}
		if (zamOrani >= 1){
			zamliMaas = calisan.getMaas() * zamOrani;
		}
		if (calisan instanceof Muhendis){
			zamliMaas += 1000;
		}
		else if (calisan instanceof Tekniker) {
			zamliMaas += 500;
		}
		calisan.setMaas(zamliMaas);
		return zamliMaas;
	}
	public void unvanBelirle(){
		super.setUnvan("Unvan belirlendi");
	}
}