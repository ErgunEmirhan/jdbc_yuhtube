package week02.day01;
//9- 1 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın. en son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.

public class Quest009 {
	public static void main(String[] args) {
		int counter =1, sum = 0;
		while(sum <= 50){
			sum += counter;
			
			if(sum > 50){
				break;
			}
			counter++;
		}
		System.out.println("Toplam: " + sum + " counter: " + counter);
	}
}