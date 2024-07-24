package kullanici_kayit_sistemi.refactored;

import kullanici_kayit_sistemi.original.Entities;

abstract class DataBase<T extends Entities> {
	static DynamicArray dataBaseArray = new DynamicArray();
	
	public static <T> T save(T arrItem) {
		return (T) dataBaseArray.add(arrItem);
	}
	
	public static <T> T[] saveAll(T[] arrList) {
		return (T[]) dataBaseArray.addAll(arrList);
	}
	
	public static <T extends Entities> T update(T arrItem) {
		int index = 0;
		for (T item : (T[]) dataBaseArray.getTypeArray()) {
			if (item.getId() == arrItem.getId()) {
				return (T) dataBaseArray.replace(index, arrItem);
			}
			index++;
		}
		return null;
	}
	
	public static<T extends Entities> T findById(int id) {
		for (T item : (T[]) dataBaseArray.getTypeArray()) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
		
	}
	
	static <T> T[] findAll() {
		T[] typeArray = (T[]) dataBaseArray.getTypeArray();
		for (T item : typeArray) {
			System.out.println(item);
		}
		return typeArray;
	}
	
	public static <T> void list() {
		dataBaseArray.list();
	}
	
}