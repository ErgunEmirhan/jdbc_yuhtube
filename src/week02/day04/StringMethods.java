package week02.day04;

import org.w3c.dom.ls.LSOutput;

public class StringMethods {
	public static void main(String[] args) {
		String value = " Value of string ";
		String value2 = "Value of string";
		System.out.println(value.charAt(2));
		System.out.println(value);
		System.out.println(value.trim()); //white space'leri siler.
		System.out.println(value.trim().charAt(2));
		System.out.println(value.length());
		System.out.println(value.indexOf('a')); // a harfinin ilk indexi verir.
		System.out.println(value.lastIndexOf('a'));
		System.out.println(value.substring(5));
		System.out.println(value.substring(0,5)); // 0 ile 5 indexleri arasında olanları alır. 5 dahil değil
		System.out.println(value.equals(value2));
		System.out.println(value == " Value of string ");
		System.out.println(value.trim() == value2);
		System.out.println(value.trim().equals(value2));
	}
}