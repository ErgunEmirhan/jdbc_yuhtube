package week06.day01.interface_sorulari.quest001;

public class Tekniker extends Calisan implements ISahaCalismasiYapabilir{
	
//	public double zamYap(double zamOrani){
//		double maas = getMaas();
//		return maas*zamOrani + 500;
//	}
	
	@Override
	public void sahaCalismasiYap() {
		System.out.println(this.getClass().getSimpleName() + " Saha çalışmasında...");
	}
}