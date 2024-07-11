package week03.day03;

import java.util.Arrays;

/*
3- int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
Yukarıdaki 2 boyutlu array'i tek boyutlu bir array olarak yazdıran metot.
 */
public class Quest003 {
	public static void main(String[] args) {
		int[][] twoDimensionArr = {
				{ 56, 23, 678, 231, 5 },
				{ 234, 21, 78, 26, 6 },
				{ 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 }
		};
		showArrayValues(twoDimensionArr);
	}
	
	private static int[] twoDimensionArrToOneDimensionArr(int[][] twoDimArr){
//		int [] oneDimArr = new int[twoDimArr.length*twoDimArr[0].length]; //asitmetrik matrix'de çalışmaz.
		int size = 0;
		for (int i = 0; i < twoDimArr.length; i++){
			size += twoDimArr[i].length;
		}
		int [] oneDimArr = new int[size];
		int counter = 0;
		for (int[]row:twoDimArr){
			for (int item : row){
				oneDimArr[counter] = item;
				counter++;
			}
		}
		return oneDimArr;
	}
	private static void showArrayValues(int[][] twoDimArr){
		int[] oneDimArr = twoDimensionArrToOneDimensionArr(twoDimArr);
		for (int item: oneDimArr){
			System.out.print(item +" ");
		}
	}
}