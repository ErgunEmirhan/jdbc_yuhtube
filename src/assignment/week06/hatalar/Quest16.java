package assignment.week06.hatalar;

public class Quest16 {
	public static void main(String[] args) {
		System.out.println(divideNumbers(10.0, 0.0));
	}
	
	public static double divideNumbers(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Sıfıra bölünemez");
			return 0;
		}
		return num1 / num2;
	}
}