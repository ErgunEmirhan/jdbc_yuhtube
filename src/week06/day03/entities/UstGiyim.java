package week06.day03.entities;

import week06.day03.utility.EColor;
import week06.day03.utility.ESize;

public class UstGiyim extends Kiyafet{
	public UstGiyim(Double fiyat, Integer stokAdet, String urunAdi, ESize size, EColor color) {
		super(fiyat, stokAdet, urunAdi,size,color);
	}
}