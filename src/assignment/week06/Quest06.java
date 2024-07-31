package assignment.week06;

import java.util.Arrays;
public class Quest06 {
	public static void main(String[] args) {
		int[] numbersArr = {1,2,6,1,3,4,4,10,6,2,7,8};
		int nonRepatingSize= 0;
		int arrSize = numbersArr.length;
		Arrays.sort(numbersArr);
		int index = 0;
		System.out.println(Arrays.toString(numbersArr));
		for (int i = 0; i< arrSize-1; i++){
			if (numbersArr[i] != numbersArr[i+1]){
				nonRepatingSize++;
			}
		}
		if (numbersArr[arrSize-1] != numbersArr[arrSize-2]){
			nonRepatingSize++;
		}
		int[] tmp = new int[nonRepatingSize];
		for (int i = 0; i< arrSize-1; i++){
			if (numbersArr[i] != numbersArr[i+1]){
				tmp[index++] = numbersArr[i];
				
			}
		}
		if (numbersArr[arrSize-1] != numbersArr[arrSize-2]){
			tmp[tmp.length-1] = numbersArr[arrSize-1];
		}
		numbersArr = tmp;
		System.out.println(Arrays.toString(numbersArr));
	}
}