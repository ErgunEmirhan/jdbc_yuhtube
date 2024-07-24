package week04.day03;

public class MailList {
	private Mail[] mailArray;
	private int arrSize;
	
	MailList() {
		mailArray = new Mail[0];
	}
	
	public Mail[] getMailArray() {
		return mailArray;
	}
	
	public Mail add(Mail mail){
		Mail[] copy = new Mail[this.arrSize + 1];
		for (int i = 0; i < arrSize; i++) {
			copy[i] = mailArray[i];
		}
		copy[this.arrSize] = mail;
		mailArray = copy;
		this.arrSize++;
		return mailArray[arrSize - 1];
	}
	public Mail replace(int index, Mail mail) {
		return mailArray[index] = mail;
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
			Mail[] copy = new Mail[this.arrSize-1];
			for (int i = 0; i< arrSize; i++){
				if (i != indexNum){
					copy[copyIndex] = mailArray[i];
					copyIndex++;
				}
				else{
					System.out.println(i+". indexteki veri silindi!");
				}
			}
			this.arrSize--;
			mailArray = copy;
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
			for (Mail mail: mailArray){
				System.out.println(mail);
			}
		}
		
	}
	/*
	 *1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize
	 * eklesin*/
	public Mail[] addAll(Mail [] mailArray) {
//		if (this.arrSize == 0){
//			this.mailArray = mailArray;
//			this.arrSize = mailArray.length;
//		}
//		else{
			this.arrSize = mailArray.length+ this.mailArray.length;
			int specialArrCount = 0;
			int userArrCount = 0;
			Mail[] copy = new Mail[this.arrSize];
			for (int i = 0; i< arrSize; i++){
				if (i < this.mailArray.length){
					copy[i] = this.mailArray[specialArrCount];
					specialArrCount++;
				}
				else{
					copy[i] = mailArray[userArrCount];
					userArrCount++;
				}
			}
			this.mailArray = copy;
//		}
		return mailArray;
	}
	
	
}