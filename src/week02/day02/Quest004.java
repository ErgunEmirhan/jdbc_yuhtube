package week02.day02;
//4- Kulanıcının girdiği sayının çarpım tablosunu yazdıran program. (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )

import java.util.Scanner;

public class Quest004 {
	public static void main(String[] args) {
		int number, multiply;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		number = sc.nextInt();
		multiply = number;
		for(int i = 1; i <=10; i ++){
			multiply = number * i;
			System.out.println(number+ " X " + i + "= " + multiply);
		}
	}
}