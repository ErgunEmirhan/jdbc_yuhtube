package week03.day04;
/*
4- Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
int[] array = { 1, 5, -4, 3 };*/
public class Quest004 {
	public static void main(String[] args) {
		int[] array = { 1, 5, -4, 3 };
		findTheMinBetween(array);
	}
	
	private static void findTheMinBetween(int[] array) {
		int minGap = Integer.MAX_VALUE;
		int gap;
		for (int i = 0; i < array.length; i++){
			for (int j = i+1; j < array.length; j++){
				gap =Math.abs(array[i]- array[j]);
				if (gap < minGap){
					minGap = gap;
				}
			}
			
		}
		System.out.println(minGap);
	}
}