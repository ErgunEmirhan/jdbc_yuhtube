package week03.day02;
/*
5 - Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
*/
public class Quest005 {
	public static void main(String[] args) {
		int[] nums = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		boolean isEven;
		int sum = 0;
		
		for (int item: nums){
			isEven = false;
			sum += item;
			if (item % 2 == 0){
				isEven = true;
				System.out.println(item+ " is even.");
			}
			else {
				System.out.println(item+ " is odd.");
			}
		}
		System.out.println("summary: "+ sum);
	}
}