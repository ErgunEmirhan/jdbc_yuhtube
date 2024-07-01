package week02.day01;

public class Quest010 {
	public static void main(String[] args) {
		int counter =0, sum = 0;
		while(counter <= 50){
			sum += counter;
			counter++;
		}
		System.out.println("Toplam: " + sum + " counter: " + counter);
	}
}