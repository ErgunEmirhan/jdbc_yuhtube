package week06.day03.databases;

import week06.day03.entities.AltGiyim;
import week06.day03.entities.Kiyafet;
import week06.day03.entities.Urun;
import week06.day03.entities.UstGiyim;
import week06.day03.utility.EColor;
import week06.day03.utility.ESize;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrunDB{
	static List<Urun> urunList = new ArrayList<>();
	static Random random =new Random();
	static DecimalFormat df = new DecimalFormat("#.00");
	
	
	public static void urunSave(Urun urun){
		urunList.add(urun);
	}
	
	
	public static Urun findByID(int id){
		if (urunList.isEmpty()){
			return null;
		}
		for (Urun urun : urunList){
			if(urun.getUrunID() == id){
				return urun;
			}
		}
		return 	null;
	}
	
	public static void urunListAll() {
		for (Urun urun: urunList){
			System.out.println(urun.getUrunID()+"- "+ urun.getUrunAdi()+ " fiyat: "+ urun.getFiyat());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Urun> generateAltGiyim(int count) {
		String[] names = {"Pantolon", "Kot Pantolon", "Şort", "Mayo", "Etek"};
		ESize[] sizes = ESize.values();
		EColor[] colors = EColor.values();
		
		for (int i = 0; i < count; i++) {
			double price = Double.parseDouble(df.format(50 + (random.nextDouble() * 100))); // 50-150 arası fiyat
			int stockAmount = 1 + random.nextInt(10); // 1-10 arası stok adedi
			String name = names[random.nextInt(names.length)];
			ESize size = sizes[random.nextInt(sizes.length)];
			EColor color = colors[random.nextInt(colors.length)];
			
			urunList.add(new AltGiyim(price, stockAmount, name, size, color));
		}
		
		return urunList;
	}
	
	public static List<Urun> generateUstGiyim(int count) {
		
		String[] names = {"Ceket", "T-shirt", "Kazak", "Gömlek", "Atlet"};
		ESize[] sizes = ESize.values();
		EColor[] colors = EColor.values();
		
		for (int i = 0; i < count; i++) {
			double price = Double.parseDouble(df.format(20 + (random.nextDouble() * 200))); // 20-220 arası fiyat
			int stockAmount = 1 + random.nextInt(10); // 1-10 arası stok adedi
			String name = names[random.nextInt(names.length)];
			ESize size = sizes[random.nextInt(sizes.length)];
			EColor color = colors[random.nextInt(colors.length)];
			
			urunList.add(new UstGiyim(price, stockAmount, name, size, color));
		}
		return urunList;
	}
}