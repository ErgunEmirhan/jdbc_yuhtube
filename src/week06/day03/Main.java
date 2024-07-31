package week06.day03;

import week06.day03.databases.SepetDB;
import week06.day03.databases.UrunDB;
import week06.day03.entities.Kiyafet;
import week06.day03.entities.SepetDetay;
import week06.day03.entities.Urun;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		AltGiyim alt1 = new AltGiyim(100.98, 1, "patolon", ESize.LARGE, EColor.BLUE);
//		AltGiyim alt2 = new AltGiyim(103.74, 2, "Kot patolon", ESize.MEDIUM,EColor.RED);
//		AltGiyim alt3 = new AltGiyim(131.5, 3, "Şort", ESize.SMALL,EColor.GREEN);
//		AltGiyim alt4 = new AltGiyim(156.11, 4, "Mayo", ESize.LARGE,EColor.RED);
//		UrunDB.urunSave(alt1);
//		UrunDB.urunSave(alt2);
//		UrunDB.urunSave(alt3);
//		UrunDB.urunSave(alt4);
//
//
//		UstGiyim ust1 = new UstGiyim(100.98, 1, "Ceket", ESize.LARGE, EColor.BLUE);
//		UstGiyim ust2 = new UstGiyim(130.98, 3, "T-shirt", ESize.SMALL, EColor.RED);
//		UstGiyim ust3 = new UstGiyim(132.98, 2, "kazak", ESize.MEDIUM, EColor.GREEN);
//		UstGiyim ust4 = new UstGiyim(101.0, 4, "Gömlek", ESize.MEDIUM, EColor.GREEN);
//		UstGiyim ust5 = new UstGiyim(12.00, 6, "atlet", ESize.LARGE, EColor.BLUE);
//
//		UrunDB.urunSave(ust1);
//		UrunDB.urunSave(ust2);
//		UrunDB.urunSave(ust3);
//		UrunDB.urunSave(ust4);
//		UrunDB.urunSave(ust5);
		tredyolMenu();
	}
	
	private static void tredyolMenu() {
		int userInput = -1;
		do {
			System.out.println("### TREDYOL MENU ###");
			System.out.println("1.Urunleri Listele");
			System.out.println("2.ID ile detaylı Listele");
			System.out.println("3.Sepet Menu");
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
				case 1: { // Urun listele detaysız id-adi-fiyat
					System.out.println("---- Urunlerin listesi ------");
					UrunDB.urunListAll();
					System.out.println();
					break;
				}
				case 2: { // Sepet urun ekleme
					/*
					* Urunleri listele id - tür - adi - ürün adedi - fiyati
					* id seçimi ile sepete kaç tane ürün eklememiz gerektiğini soracak
					* ekleme işlemini sepetDB içerisine ArrayList ile gerçekleştir.
					* Ekleme işlemi ürün adet
					* SepetAdet = ürün adetlerin toplami
					* toplamFiyat = ürün fiyatlarin toplami
					* */
					Urun urun = urunSelectByID();
					sepeteEklenme(urun);
					
					break;
				}
				case 3: { // Sepet görüntüle
					sepetMenu();
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
	
	private static void sepetMenu() {
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
					SepetDB.sepetListAll();
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
					System.out.println("---- Sepet İçeriği ------");
					SepetDB.sepetListAll();
					System.out.println();
					
				}
				case 0: {
					System.out.println("Ana Menüye dönülüyor...");
					break;
				}
				default:
					System.out.println("\nGeçerli bir değer giriniz!\n");
			}
		} while (userInput != 0);
	}
	
	
	
	private static Urun urunSelectByID() {
		int id;
		do {
			System.out.println("Geri Dönmek için 0");
			System.out.print("Ürün sıra numarasını giriniz:");
			
			id = sc.nextInt();
			Urun urun = UrunDB.findByID(id);
			if (urun == null) {
				System.out.println("Böyle bir ürün yok!");
			}
			else {
				System.out.println(urun.getUrunID() + "- " + urun.getUrunAdi() + " fiyat: " + urun.getFiyat());
				System.out.println("Stok Adedi: " + urun.getStokAdet() + " Rengi: " + ((Kiyafet) urun).getColor() + " " +
						                   "Beden: " + ((Kiyafet) urun).getSize());
				return urun;
			}
			
		} while (id != 0);
		return null;
	}
	
	private static void sepeteEklenme(Urun urun) {
		int userInput;
		SepetDetay sepetUrun;
		System.out.println("Geri Dönmek için 0");
		System.out.println("Ürünü sepete eklemek için 1");
		SepetDetay sepet = new SepetDetay();
		System.out.print("Selection: ");
		userInput = sc.nextInt();
		if (userInput == 1) {
			int urunStokAdet = urun.getStokAdet();
			System.out.println("Stok Adedi: " + urun.getStokAdet());
			do {
				System.out.println("Geri Dönmek için 0");
				System.out.print("Kaç tane eklensin: ");
				userInput = sc.nextInt();
				if (urunStokAdet < userInput) {
					System.out.println("\nFazla adet girişi yaptınız!\n");
					continue;
				}
				sepetUrun = SepetDB.findBySepetUrunID(urun.getUrunID());
				Double fiyat = urun.getFiyat();
				if (sepetUrun == null) {
					sepet.setUrunID(urun.getUrunID());
					sepet.setUrunAdi(urun.getUrunAdi());
					sepet.setAdetFiyat(fiyat);
					sepet.setSepetAdet(userInput);
					sepet.setToplamFiyat(fiyat, userInput);
					SepetDB.addSepet(sepet);
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
		SepetDB.sepetListAll();
		System.out.println();
		int userInput;
		boolean silindiMi = false;
		
		if (userRmSelection == 2) {
			System.out.print("Eksiltmek istediğiniz ürünün ürünID: ");
			userInput = sc.nextInt();
			SepetDetay sepetUrun = SepetDB.findBySepetUrunID(userInput);
			if (sepetUrun == null) {
				System.out.println("Sepette böyle bir ürün yok!");
			}
			else {
				System.out.println("Eksitmek istediginiz miktar: ");
				userInput = sc.nextInt();
				silindiMi = SepetDB.sepettenUrunEksilt(sepetUrun, userInput);
			}
		}
		else if (userRmSelection == 3) {
			System.out.println("1-Bütün sepeti sil");
			System.out.println("2-Bir ürün sil");
			System.out.print("selection:");
			userInput = sc.nextInt();
			if (userInput == 1) {
				SepetDB.removeAllSepet();
				silindiMi = true;
			}
			else if (userInput == 2) {
				System.out.print("Silmek istediğiniz sepet ID: ");
				userInput = sc.nextInt();
				silindiMi = SepetDB.removeSepetUrunBySepetDetayID(userInput);
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