package week02.day01;
//3- İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.
//3.1- bu değişkenleri tek bir çıktıda alt alta yazdıralım.
//3.2- a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.

public class Quest003 {
	public static void main(String[] args) {
		String name = "Alexander J.";
		String surName = "Walker";
		System.out.println("isim: " + name +" soyismi: "+ surName);
		System.out.print(name + '\n' +surName);
		System.out.println();
		char a = 'a';
		char b = 'b';
		System.out.println((int)a +"+"+(int)b +"= "+(a+b));
	}
}