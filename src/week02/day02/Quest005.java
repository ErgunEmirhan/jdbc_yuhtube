package week02.day02;

public class Quest005 {
	public static void main(String[] args) {
		int even = 0, odd = 0;
		double ratio ;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even += i;
			}
			else {
				odd +=i;
			}
		}
		System.out.println("Çift olan sayilarin toplami: " +even);
		System.out.println("Tek olan sayilarin toplami: "+ odd);
		ratio = (double) even/odd;
		System.out.println("Çift sayilarin toplamının tek sayilarin toplamına orani a/b: " +ratio);
	}
	
}