package week03.day02;
/*
9- 2 Boyutlu Array'de çarpım tablosunu yazdıralım.
*/
public class Quest009 {
	public static void main(String[] args) {
		int[][] nums = new int[10][10];
		
		for(int i = 0; i < nums.length; i++){
			System.out.println((i+1) +". sayinin carpim tablosu:");
			for (int j = 0; j < nums[i].length; j++){
				nums[i][j] = ((i+1)*(j+1));
				System.out.println((i+1)+ "x"+ (j+1)+ "= "+ (nums[i][j]));
			}
			System.out.println();
		}
	}
}