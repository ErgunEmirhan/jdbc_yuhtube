package week04.day02;

import java.util.Arrays;

public class OzelListe {
	/*
	*1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
	*/
	private int[] specialArr;
	private int arrSize = 0;
	/*
	*1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
	*int türünde sayiyi alacak ve sayi dizimize ekleyecek
	*/
	public void add(int userNumber){
		if (this.arrSize == 0){
			specialArr = new int[1];
			specialArr [0] = userNumber;
			this.arrSize = 1;
		}
		else {
			int[] copy = new int[this.arrSize +1];
			for (int i = 0; i< arrSize; i++){
				copy[i] = specialArr[i];
			}
			copy[this.arrSize] = userNumber;
			specialArr = copy;
			this.arrSize++;
		}
		
		System.out.println("Veri eklemesi yapıldı!");
	}
	/*
	*1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak
	* verdiği index'i silecek.*/
	public void remove(int indexNum){
		if (this.arrSize == 0){
			System.out.println("Silinecek veri yok");
		}
		else {
			int copyIndex = 0;
			int[] copy = new int[this.arrSize-1];
			for (int i = 0; i< arrSize; i++){
				if (i != indexNum){
					copy[copyIndex] = specialArr[i];
					copyIndex++;
				}
				else{
					System.out.println(i+". indexteki veri silindi!");
				}
			}
			this.arrSize--;
			specialArr = copy;
		}
	}
	/*
	*1.3 - list isimli bir metot daha yazalım. Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül
	*  problemini de çözelim. */
	public void list() {
		if (this.arrSize == 0){
			System.out.println("Listelenecek veri yok");
		}
		else {
			System.out.print("{");
			for (int i = 0; i< specialArr.length; i++){
				if (specialArr.length-1 == i){
					System.out.print(specialArr[i]);
				}
				else{
					System.out.print(specialArr[i]+ ", ");
				}
			}
			System.out.println("}");
		}
		
	}
	/*
	*1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize
	* eklesin*/
	public void addAll(int [] userArray) {
		if (this.arrSize == 0){
			specialArr = userArray;
			this.arrSize = userArray.length;
		}
		else{
			this.arrSize = userArray.length+specialArr.length;
			int specialArrCount = 0;
			int userArrCount = 0;
			int[] copy = new int[this.arrSize];
			for (int i = 0; i< arrSize; i++){
				if (i < specialArr.length){
					copy[i] = specialArr[specialArrCount];
					specialArrCount++;
				}
				else{
					copy[i] = userArray[userArrCount];
					userArrCount++;
				}
			}
			specialArr = copy;
		}
	}
}