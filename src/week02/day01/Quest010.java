package week02.day01;

public class Quest010 {
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