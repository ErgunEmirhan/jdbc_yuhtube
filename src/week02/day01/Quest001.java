package week02.day01;
//1- Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz. bir ürün fiyatım olsun. bu ürün fiyatından ham fiyatını bulalım.
public class Quest001 {
	public static void main(String[] args) {
		final  double TaxRatio = 0.18;
		final  double ProfitRatio = 0.15;
		double price = 100, priceWithOutTax, priceWithoutProfit = 0;
		priceWithOutTax = price -(price*TaxRatio);
		System.out.println("KDV'siz fiyat: "+ priceWithOutTax);
		priceWithoutProfit = priceWithOutTax-(priceWithOutTax*ProfitRatio);
		System.out.println("Ham fiyat: "+priceWithoutProfit);
	}
}