package week06.day03.databases;

import week06.day03.entities.Sepet;

import java.util.ArrayList;

public class SepetDB {
	static ArrayList<Sepet> sepetArrayList = new ArrayList<>();
	
	public static Integer SepetIDSetter(){
		if (sepetArrayList.isEmpty()){
			return 1;
		}
		return sepetArrayList.getLast().getSepetID()+1;
	}
}