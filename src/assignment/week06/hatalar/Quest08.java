package assignment.week06.hatalar;

public class Quest08 {
	public static void main(String[] args) {
		System.out.println(divide(10, 0));
	}
	
	public static int divide(int a, int b) {
		if (b < a){
			return b/a;
		}
		return a / b;
	}
}