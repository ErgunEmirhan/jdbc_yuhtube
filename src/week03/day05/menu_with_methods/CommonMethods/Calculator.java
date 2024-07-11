package week03.day05.menu_with_methods.CommonMethods;

public class Calculator {
	public int addition(int[] numsFromUser) {
		return numsFromUser[0]+numsFromUser[1];
	}
	
	public int subtraction(int[] numsFromUser) {
		return numsFromUser[0]-numsFromUser[1];
	}
	
	public int multiplication(int[] numsFromUser) {
		return numsFromUser[0]*numsFromUser[1];
	}
	
	public double division(int[] numsFromUser) {
		if (numsFromUser[1] == 0){
			return 0.0;
		}
		else {
			return (double) numsFromUser[0]/numsFromUser[1];
		}
	}
	
	public double powerOfNum(int num, int num2) {
		return Math.pow(num,num2);
	}
	
	public double sqrtOfNum(int num) {
		return Math.sqrt(num);
	}
}