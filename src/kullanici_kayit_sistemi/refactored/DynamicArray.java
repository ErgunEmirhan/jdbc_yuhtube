package kullanici_kayit_sistemi.refactored;
class DynamicArray<T> {
	private T[] typeArray;
	private int arrSize;
	
	DynamicArray(){
		typeArray = (T[]) new Object[0];
	}
	
	public T[] getTypeArray() {
		return typeArray;
	}
	
	public T add(T arrItem){
		T[] tmp = (T[]) new Object[this.arrSize + 1];
		for (int i = 0; i < arrSize; i++) {
			tmp[i] = typeArray[i];
		}
		tmp[this.arrSize] = arrItem;
		typeArray = tmp;
		this.arrSize++;
		return typeArray[arrSize - 1];
	}
	public T replace(int index, T arrItem) {
		return typeArray[index] = arrItem;
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
			T[] tmp = (T[]) new  Object[this.arrSize-1];
			for (int i = 0; i< arrSize; i++){
				if (i != indexNum){
					tmp[copyIndex] = typeArray[i];
					copyIndex++;
				}
				else{
					System.out.println(i+". indexteki veri silindi!");
				}
			}
			this.arrSize--;
			typeArray = tmp;
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
			for (T item: typeArray){
				System.out.println(item);
			}
		}
		
	}
	/*
	 *1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize
	 * eklesin*/
	public T[] addAll(T[] arrItem) {
		for (int i = 0; i < arrItem.length; i++){
			add(arrItem[i]);
		}
		return arrItem;
	}
}