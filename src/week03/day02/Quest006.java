package week03.day02;
/*
6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti 4 sayısının adetinden büyükse true değilse false yazdıralım.
-> 1,4,5,6,1,1,4,8
*/
public class Quest006 {
	public static void main(String[] args) {
		int[] nums = {1,4,5,6,1,1,4,8};
		int numOneCounter = 0, numFourCounter = 0;
		for (int item:nums){
			if (item == 1){
				numOneCounter++;
			}
			else if(item == 4){
				numFourCounter++;
			}
		}
		System.out.println(
				numOneCounter>numFourCounter? "true":"false"
		);
	}
}