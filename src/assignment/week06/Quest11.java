package assignment.week06;
/*
* 9.Bir metot içerisinde tanımlanan bir değişkenin scope'u (erişim alanı) nedir ve
* bu değişkenin metot dışından erişilebilirliği hakkında ne söyleyebilirsiniz?
*/
public class Quest11 {
	static int sayi = 0;
	
	private int method(){
		return sayi +1;
	}
	
	public static void main(String[] args) {
		Quest11 quest11 = new Quest11();
		int sayi = quest11.method();
		System.out.println(sayi);
	}
	
	
}