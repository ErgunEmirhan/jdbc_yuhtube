package week06.day03;

import week06.day03.databases.SatisDB;
import week06.day03.databases.SepetUrunDetayDB;
import week06.day03.databases.UrunDB;
import week06.day03.entities.*;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class TredyolApp {
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.00");
	
	public static void tredyolMenu() {
		int userInput = -1;
		User user = null;
		do {
			System.out.println("### TREDYOL MENU ###");
			System.out.println("1.Urunleri Listele");
			System.out.println("2.Ürün numarasi ile detaylı Listele");
			System.out.println("3.Sepet Menu");
			if (user == null) {
				System.out.println("4.Kullanici İşlemleri");
			}else if(user != null){
				System.out.println("4.Kullanici Detaylari");
				System.out.println("5.Sipariş Geçmişini Görüntle");
			}
			System.out.println("0.Çıkış");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("\nGeçerli bir değer giriniz!\n");
				continue;
			}
			finally {
				sc.nextLine();
				System.out.println();
			}
			switch (userInput) {
				case 1: { // Urun listele detaysız id-adi-fiyat
					System.out.println("---- Urunlerin listesi ------");
					UrunDB.urunListAll();
					System.out.println("-----------------------------");
					System.out.println();
					break;
				}
				case 2: { // Sepet urun ekleme
					Urun urun = urunSelectByID();
					sepeteEklenme(urun);
					
					break;
				}
				case 3: { // Sepet görüntüle
					user = sepetMenu(user);
					break;
				}
				case 4: { // Sepet görüntüle
					if (user != null){
						user = UserApp.userInterface(user);
					}else if (user == null){
						user = UserApp.userMenu();
					}
					break;
				}
				case 5: {
					if (user != null){
						satisGecmisi(user);
					}
					else {
						System.out.println("\nGeçerli bir değer giriniz!\n");
					}
					break;
				}
				case 6: {
					SatisDB.sepetListAll();
					break;
				}
				case 9:{
					UrunDB.generateAltGiyim(10);
					UrunDB.generateUstGiyim(5);
					break;
				}
				case 0: {
					System.out.println("Gülü gülü!");
					break;
				}
				default:
					System.out.println("\nGeçerli bir değer giriniz!\n");
			}
		} while (userInput != 0);
	}
	
	private static void satisGecmisi(User user) {
		System.out.println("\n----- Satış Geçmişi ------\n");
		int userID = user.getId();
		List<Satis> userSatisList = SatisDB.findSatisByUserID(userID);
		if (userSatisList.isEmpty()){
			System.out.println("Satış geçmişi boş!\n");
		}
		else {
			for (Satis satis : userSatisList){
				System.out.println(satis);
			}
		}
	}
	
	private static User sepetMenu(User user) {
		List<UrunSepetDetay> sepetList = SepetUrunDetayDB.sepetGetAll();
		int userInput = -1;
		do {
			System.out.println("### SEPET MENU ###");
			System.out.println("1.Sepeti Görüntüle");
			System.out.println("2.Ürün çıkar");
			System.out.println("3.Sepetten ürün sil");
			System.out.println("4.Satın al");
			System.out.println("0.Çıkış");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("\nGeçerli bir değer giriniz!\n");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userInput) {
				case 1: { // Sepeti Görüntüle
					System.out.println("---- Sepet İçeriği ------");
					System.out.println();
					if (sepetList.isEmpty()){
						System.out.println("Sepet Boş!");
					}
					else SepetUrunDetayDB.sepetListAll();
					Double toplamSepetFiyat = Double.valueOf(df.format(SepetUrunDetayDB.getToplamSepetFiyat()));
					System.out.println();
					System.out.println("toplam fiyat: "+ toplamSepetFiyat);
					System.out.println();
					break;
				}
				case 2: { // Ürün çıkar
					sepettenUrunSil(2);
					break;
				}
				case 3: { // Sepetten ürün sil
					sepettenUrunSil(3);
					break;
				}
				case 4: {
					
					if (user != null) {
						System.out.println("---- Sepet İçeriği ------");
						System.out.println();
						satinAlMenu(sepetList, user);
						System.out.println();
						return user;
					}
					else {
						System.out.println("Giriş yapmadan devam edemezsiniz");
						System.out.println("1-Giriş Yap/ Kayıt ol");
						System.out.println("0-Çıkış");
						System.out.print("selection: ");
						userInput = sc.nextInt();
						
						if (userInput == 1) {
							user = UserApp.userMenu();
						}
					}
					break;
				}
				case 0: {
					System.out.println("Ana Menüye dönülüyor...");
					break;
				}
				default:
					System.out.println("\nGeçerli bir değer giriniz!\n");
			}
		} while (userInput != 0);
		return user;
	}
	
	private static void satinAlMenu(List<UrunSepetDetay> sepetList, User user) {
		if (sepetList.isEmpty()){
			System.out.println("Sepet Boş!");
			return;
		}
		String uuid = String.valueOf(java.util.UUID.randomUUID());
		int userInput;
		Double toplamSepetFiyat = Double.valueOf(df.format(SepetUrunDetayDB.getToplamSepetFiyat()));
		System.out.println("Fatura Numarası: "+ uuid);
		System.out.println("toplam fiyat: "+ toplamSepetFiyat);
		System.out.println("1- satin alma işlemini gerçekleştir");
		System.out.println("0- iptal");
		System.out.print("selection: ");
		userInput = sc.nextInt();
		if (userInput == 0){
			System.out.println("\ngeri dönülüyor...\n");
		}
		else {
			boolean sattiMi = satinAl(uuid,sepetList ,user, toplamSepetFiyat);
			if (sattiMi){
				System.out.println("Satin alma işlemi gerçekleştirildi...");
				for (UrunSepetDetay sepet: sepetList){
					UrunDB.updateStok(sepet.getUrunID(), sepet.getSepetAdet());
				}
				SepetUrunDetayDB.removeAllSepet();
			}
			else{
				System.out.println("Satin alma işlemi gerçekleştirilemedi!");
			}
		}
		
	}
	
	private static boolean satinAl(String uuid, List<UrunSepetDetay> sepetList, User user, Double toplamSepetFiyat) {
		int userID = user.getId();
		for (UrunSepetDetay sepet: sepetList){
			Satis satis = new Satis();
			satis.setFaturaUUID(uuid);
			satis.setSepetDetayList(sepet);
			satis.setUser(userID);
			satis.setToplamFiyat(toplamSepetFiyat);
			SatisDB.addSatis(satis);
		}
		
		return true;
	}
	
	private static Urun urunSelectByID() {
		int id;
		do {
			System.out.println("0-Geri Dön");
			System.out.print("Ürün numarasını giriniz:");
			
			id = sc.nextInt();
			Urun urun = UrunDB.findByID(id);
			if (urun == null) {
				System.out.println("\nBöyle bir ürün yok!\n");
			}
			else {
				System.out.println();
				System.out.println("----- Ürün Detay ------");
				System.out.println(urun.getUrunID() + "- " + urun.getUrunAdi() + " fiyat: " + urun.getFiyat());
				System.out.println("Stok Adedi: " + urun.getStokAdet() +
						                   " Rengi: " + ((Kiyafet) urun).getColor() + " " +
						                   "Beden: " + ((Kiyafet) urun).getSize());
				System.out.println();
				System.out.println("----- AÇIKLAMA ------");
				addUrunDescription(urun);
				System.out.println();
				return urun;
			}
			
		} while (id != 0);
		return null;
	}
	
	private static void addUrunDescription(Urun urun) {
		Random rand = new Random();
		int x= rand.nextInt(101);
		int y= 100-x;
		int[] options={30,60,90};
		int randomIndex=rand.nextInt(options.length);
		int selectedValue = options[randomIndex];
		urun.setUrunDescription(urun.getUrunAdi()+" %"+x+" polyester" + " %"+y +" pamuktan uretilmistir.\n"+
				                        selectedValue+" derecede yikanmasi uygundur."+" 15 gun icinde " +
				                        "ucretsiz iade edebilirsiniz."+" Incelemis oldugunuz urunun satis " +
				                        "fiyatini satici belirlemektedir.");
		System.out.println(urun.getUrunDescription());
	}
	
	private static void sepeteEklenme(Urun urun) {
		int userInput;
		UrunSepetDetay sepetUrun;
		System.out.println("0-Geri Dön");
		System.out.println("1-Ürünü sepete ekle");
		UrunSepetDetay sepet = new UrunSepetDetay();
		System.out.print("Selection: ");
		userInput = sc.nextInt();
		System.out.println();
		if (userInput == 1) {
			int urunStokAdet = urun.getStokAdet();
			System.out.println("Stok Adedi: " + urun.getStokAdet());
			System.out.println();
			if (urunStokAdet == 0){
				System.out.println("Stok'da ürün tükenmiştir!");
				return;
			}
			do {
				System.out.println("0-Geri Dön");
				System.out.print("Gaç dane: ");
				userInput = sc.nextInt();
				if (urunStokAdet < userInput) {
					System.out.println("\nFazla adet girişi yaptınız!\n");
					continue;
				}
				sepetUrun = SepetUrunDetayDB.findBySepetUrunID(urun.getUrunID());
				Double fiyat = urun.getFiyat();
				if (sepetUrun == null) {
					sepet.setUrunID(urun.getUrunID());
					sepet.setUrunAdi(urun.getUrunAdi());
					sepet.setAdetFiyat(fiyat);
					sepet.setSepetAdet(userInput);
					sepet.setToplamFiyat(fiyat, userInput);
					SepetUrunDetayDB.addSepet(sepet);
					return;
				}
				int toplamAdet = sepetUrun.getSepetAdet() + userInput;
				if (toplamAdet > urunStokAdet) {
					System.out.println("\nStokda yeteri kadar ürün yok.\n");
					continue;
				}
				sepetUrun.setSepetAdet(toplamAdet);
				sepet.setToplamFiyat(fiyat, userInput);
				return;
				
			} while (userInput != 0);
		}
	}
	
	private static void sepettenUrunSil(int userRmSelection) {
		System.out.println("---- Sepet İçeriği ------");
		SepetUrunDetayDB.sepetListAll();
		System.out.println();
		int userInput;
		boolean silindiMi = false;
		
		if (userRmSelection == 2) {
			System.out.print("Eksiltmek istediğiniz ürünün ürünID: ");
			userInput = sc.nextInt();
			UrunSepetDetay sepetUrun = SepetUrunDetayDB.findBySepetUrunID(userInput);
			if (sepetUrun == null) {
				System.out.println("Sepette böyle bir ürün yok!");
			}
			else {
				System.out.print("Eksitmek istediginiz miktar: ");
				userInput = sc.nextInt();
				silindiMi = SepetUrunDetayDB.sepettenUrunEksilt(sepetUrun, userInput);
			}
		}
		else if (userRmSelection == 3) {
			System.out.println("1-Bütün sepeti sil");
			System.out.println("2-Bir ürün sil");
			System.out.print("selection:");
			userInput = sc.nextInt();
			if (userInput == 1) {
				SepetUrunDetayDB.removeAllSepet();
				silindiMi = true;
			}
			else if (userInput == 2) {
				System.out.print("Silmek istediğiniz sepet ID: ");
				userInput = sc.nextInt();
				silindiMi = SepetUrunDetayDB.removeSepetUrunBySepetDetayID(userInput);
			}
		}
		if (silindiMi) {
			System.out.println("silme işlemi gerçekleştirildi!");
		}
		else {
			System.out.println("Sepette böyle bir ürün yok yada girdiğiniz adet miktarı fazla!");
		}
	}
	
}