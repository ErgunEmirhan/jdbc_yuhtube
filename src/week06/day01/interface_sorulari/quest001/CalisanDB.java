package week06.day01.interface_sorulari.quest001;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CalisanDB {
	static ArrayList<Calisan> calisanlar= new ArrayList<>();
	
	static void list(){
		calisanlar.forEach(System.out::println);
	}
	
	static void listMaasUnvanaGore(){
		for (Calisan calisan : calisanlar){
			if (calisan instanceof IMaasaGoreUnvanAlabilir){
				System.out.println(calisan);
			}
			
		}
	}
	static void listMaasUnvanaGoreDegil(){
		for (Calisan calisan : calisanlar){
			if (!(calisan instanceof IMaasaGoreUnvanAlabilir) && !(calisan instanceof ISahaCalismasiYapabilir)){
				System.out.println(calisan);
			}
			
		}
	}
	
}