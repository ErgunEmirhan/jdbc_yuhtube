package kullanici_kayit_sistemi.original;

public class UserList {

	private User[] userArray;
	private int arrSize;
	
	UserList() {
		userArray = new User[0];
	}
	
	public User[] getUserArray() {
		return userArray;
	}
	
	public User add(User user){
		User[] copy = new User[this.arrSize + 1];
		for (int i = 0; i < arrSize; i++) {
			copy[i] = userArray[i];
		}
		copy[this.arrSize] = user;
		userArray = copy;
		this.arrSize++;
		return userArray[arrSize - 1];
	}
	public User replace(int index, User user) {
		return userArray[index] = user;
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
			User[] copy = new User[this.arrSize-1];
			for (int i = 0; i< arrSize; i++){
				if (i != indexNum){
					copy[copyIndex] = userArray[i];
					copyIndex++;
				}
				else{
					System.out.println(i+". indexteki veri silindi!");
				}
			}
			this.arrSize--;
			userArray = copy;
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
			for (User user: userArray){
				System.out.println(user);
			}
		}
		
	}
	/*
	*1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize
	* eklesin*/
	public void addAll(User[] userArray) {
		if (this.arrSize == 0){
			this.userArray = userArray;
			this.arrSize = userArray.length;
		}
		else{
			this.arrSize = userArray.length+ this.userArray.length;
			int specialArrCount = 0;
			int userArrCount = 0;
			User[] copy = new User[this.arrSize];
			for (int i = 0; i< arrSize; i++){
				if (i < this.userArray.length){
					copy[i] = this.userArray[specialArrCount];
					specialArrCount++;
				}
				else{
					copy[i] = userArray[userArrCount];
					userArrCount++;
				}
			}
			this.userArray = copy;
		}
	}
	
	
}