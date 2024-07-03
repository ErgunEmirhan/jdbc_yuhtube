package week02.day03;

import java.util.Scanner;

/*4- Klavyeden 0 ile 100 arasında (0-100 dahil) 5 adet sayıyı kullanıcıdan alacağım. Aldığım sayılardan en büyük ve
en küçük olanları yazdıran program.*/
public class Quest04 {
	public static void main(String[] args) {
		int num, i = 1;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		
		while (i <= 5) {
			System.out.print("0 ile 100 arasında " + i + ". sayiyi giriniz: ");
			num = sc.nextInt();
			if (num >= 0 && num <=100){
				if (num > max) {
					max = num;
				}
				else if (num < min) {
					min = num;
				}
				i++;
			}else{
				System.out.println("girdiğiniz sayi 0 ile 100 arasında DEĞİL!");
			}
		}
		System.out.println("En buyuk deger: " + max + " En kucuk değer: " + min);
	}
}