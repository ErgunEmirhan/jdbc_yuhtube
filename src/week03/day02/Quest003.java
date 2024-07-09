package week03.day02;

import java.util.Arrays;

/*
3- Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
* */
public class Quest003 {
	public static void main(String[] args) {
		int[] nums = {120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		int max = nums[0], max2 = nums[0];
		
		for (int i = 0; i<nums.length; i++){
			if(nums[i] > max){
				max = nums[i];
			}
		}
		for (int item: nums){
			if(item != max && item > max2){
				max2 = item;
			}
		}
		
		System.out.println("max deger: "+ max+ " max2 deger: "+ max2);
	}
}

/* Hüseyin Tatar'ın çözümü
public static void main(String[] args) {
	int[] numbers = {1300, 135, 125, -256, 16, 1258, 81, 14};
	int max1 = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	
	for(int number : numbers){
		if(number>max1){
			max2=max1;
			max1=number;
		}else if(number > max2 && number != max1){
			max2=number;
		}
	}
	System.out.println("Dizideki en buyuk ikinci sayi: " + max2);
}
}
*/