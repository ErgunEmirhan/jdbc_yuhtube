package week02.day01;
//2- Türk Lirasınını dolara cevirelim.
public class Quest002 {
	public static void main(String[] args) {
		double tlAmount= 100.0;
		double dolarExchageRate = 32.68;
		double exchange = tlAmount/ dolarExchageRate;
		
		System.out.println(exchange+"$");
	}
}