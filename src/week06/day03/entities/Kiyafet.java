package week06.day03.entities;

import week06.day03.utility.EColor;
import week06.day03.utility.ESize;

public class Kiyafet extends Urun{
	
	ESize size;
	EColor color;
	
	public Kiyafet(Double fiyat, Integer stokAdet, String urunAdi, ESize size, EColor color) {
		super(fiyat, stokAdet, urunAdi);
		this.size = size;
		this.color = color;
	}
	
	public EColor getColor() {
		return color;
	}
	
	
	public ESize getSize() {
		return size;
	}
	
	
	@Override
	public String toString() {
		return "Kiyafet{" + "color=" + color + ", size=" + size + super.toString()+ '}';
	}
}