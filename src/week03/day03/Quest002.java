package week03.day03;

import java.util.Arrays;

/*
2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
başka bir diziye atsın ve o diziyi yazdırsın.
 */
public class Quest002 {
	public static void main(String[] args) {
	int [] arryNums = {1,2,3,4,5,6,7,8,9,10};
	System.out.println(Arrays.toString(findOddNumbers(arryNums)));
	}
	private static int sizeOfOddNumbers(int[] arryNums){
		int counter = 0;
		for (int num: arryNums){
			if (num % 2 != 0){
				counter++;
			}
		}
		return counter;
	}
	private static int[] findOddNumbers(int[] arryNums){
		int size = sizeOfOddNumbers(arryNums);
		int [] oddNums = new int[size];
		int counter = 0;
		for (int item : arryNums){
			if (item % 2 != 0){
				oddNums[counter] = item;
				counter++;
			}
		}
		return oddNums;
	}
}