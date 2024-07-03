package week02.day03;
/*1- Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim.*/
import java.util.Scanner;

public class Quest01 {
	public static void main(String[] args) {
		int input = 0;
		String day = "";
		Scanner sc = new Scanner(System.in);
		
		
		while (input < 1 || input > 7){
			System.out.print("1 ile 7 arasinda bir değer giriniz: ");
			input = sc.nextInt();
			
			 day = switch (input){
				case 1-> "Monday";
				case 2-> "Tuesday";
				case 3-> "Wednesday";
				case 4-> "Thursday";
				case 5-> "Friday";
				case 6-> "Saturday";
				case 7-> "Sunday";
				default -> "HATA: 1 ile 7 arasında bir değer GİRMEDİNİZ!";
			};
			System.out.println(day);
		}
		
	}
}