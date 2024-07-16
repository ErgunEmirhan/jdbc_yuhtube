package week03.day02;
/*
4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
*/
public class Quest004 {
	public static void main(String[] args) {
		int[] nums = {2, -256, 2, 1258, 2,2};
		boolean isReapting = false;
		for (int i = 0; i < nums.length-1; i++){
			if (nums[i] == nums[i+1]){
				isReapting = true;
			}
		}
		System.out.println(isReapting? "Tekrar ediyor!": "Tekrar etmiyor");
	}
}