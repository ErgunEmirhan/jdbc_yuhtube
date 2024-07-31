package week06.day03;

import week06.day03.databases.UrunDB;
import week06.day03.entities.AltGiyim;
import week06.day03.entities.Kiyafet;
import week06.day03.entities.Urun;
import week06.day03.entities.UstGiyim;
import week06.day03.utility.EColor;
import week06.day03.utility.ESize;


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
			System.out.println("3.Sepeti Görüntüle");
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
					urunSelectByID();
					
					break;
				}
				case 3: { // Sepet görüntüle
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
	
	private static void urunSelectByID() {
		System.out.print("Ürün sıra numarasını giriniz:");
		int id = sc.nextInt();
		Urun urun = UrunDB.findByID(id);
		if (urun == null){
			System.out.println("Böyle bir ürün yok!");
		}
		
		//TODO: Listeleme sout yap.
	}
	
	
}