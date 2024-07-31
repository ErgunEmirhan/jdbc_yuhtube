package week06.day03.utility;


import week06.day02.abstaction.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager<T extends BaseEntity> implements ICRUD<T> {
	
	protected static ArrayList<BaseEntity> arrayList = new ArrayList<>();
	
	@Override
	 public T save(T t) {
		if (arrayList.add(t)){
			return t;
		}
		return null;
	}
	
	@Override
	public List<T> saveAll(List<T> t) {
		return List.of();
	}
	
	
	@Override
	public T update(T t) {
		int index = arrayList.indexOf(t);
		return (T) arrayList.set(index, t);
	}
	
	@Override
	public List<T> findAll() {
		return (List<T>) arrayList;
	}
	
	public T findByID(int id) {
		for (BaseEntity entity : arrayList ){
			if(entity.getId() == id){
				return (T) entity;
			}
		}
		return null;
	}
}