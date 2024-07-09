package week03.day02;
/*
2- En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Quest002 {
	public static void main(String[] args) {
		int[] nums = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int max = nums[0], min = nums[0];
		for (int item: nums){
			if (min > item){
				min = item;
			}
			if (max < item){
				max = item;
			}
		}
		System.out.println("max value: "+ max+ " min value: "+min);
	}
}