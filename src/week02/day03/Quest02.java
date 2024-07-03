package week02.day03;

import java.util.Scanner;

/*
* 2- Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre bur. hesabı yapan program









*/
public class Quest02 {
	public static void main(String[] args) {
		int dayOfMonth, month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dogdugunuz ayi giriniz (1-12): ");
		month = sc.nextInt();
		
		System.out.print("Dogdugunuz ayin gununu giriniz (1-30):");
		dayOfMonth = sc.nextInt();
		
		String sign = switch(month){
			case 1->{
				if (dayOfMonth < 22 ){ // Oğlak Burcu : 22 Aralık - 21 Ocak
					yield "Oğlak burcu";
				}
				else{
					yield "Kova burcu";
				}
			}
			case 2->{
				if (dayOfMonth < 20 ){ //Kova Burcu : 22 Ocak - 19 Şubat
					yield "Kova burcu";
				}
				else{
					yield "Balık burcu";
				}
			}
			
			case 3->{
				if (dayOfMonth < 21 ){ // Balık Burcu : 20 Şubat - 20 Mart
					yield "Balık burcu";
				}
				else{
					yield "Koç burcu";
				}
			}
			case 4->{
				if (dayOfMonth < 21 ){ // Koç Burcu : 21 Mart - 20 Nisan
					yield "Koç burcu";
				}
				else{
					yield "Boğa burcu";
				}
			}
			case 5->{
				if (dayOfMonth < 22 ){ // Boğa Burcu : 21 Nisan - 21 Mayıs
					yield "Boğa burcu";
				}
				else{
					yield "İkizler burcu";
				}
			}
			case 6->{
				if (dayOfMonth < 23 ){ // İkizler Burcu : 22 Mayıs - 22 Haziran
					yield "İkizler burcu";
				}
				else{
					yield "Yengeç burcu";
				}
			}
			case 7->{
				if (dayOfMonth < 23 ){ // Yengeç Burcu : 23 Haziran - 22 Temmuz
					yield "Yengeç burcu";
				}
				else{
					yield "Aslan burcu";
				}
			}
			case 8->{
				if (dayOfMonth < 23 ){ // Aslan Burcu : 23 Temmuz - 22 Ağustos
					yield "Aslan burcu";
				}
				else{
					yield "Başak burcu";
				}
			}
			case 9->{
				if (dayOfMonth < 23 ){ // Başak Burcu : 23 Ağustos - 22 Eylül
					yield "Başak burcu";
				}
				else{
					yield "Terazi burcu";
				}
			}
			case 10->{
				if (dayOfMonth < 23 ){ // Terazi Burcu : 23 Eylül - 22 Ekim
					yield "Terazi burcu";
				}
				else{
					yield "Akrep burcu";
				}
			}
			case 11->{
				if (dayOfMonth < 22 ){ // Akrep Burcu : 23 Ekim - 21 Kasım
					yield "Akrep burcu";
				}
				else{
					yield "Yay burcu";
				}
			}
			case 12->{
				if (dayOfMonth < 22 ){ // Yay Burcu : 22 Kasım - 21 Aralık
					yield "Yay burcu";
				}
				else{
					yield "Oğlak burcu";
				}
			}
			
			default -> throw new IllegalStateException("Unexpected value: " + month);
		};
		System.out.println(sign);
	}
}