package week06.day02.abstaction.quest001;

public abstract sealed class PetAnimal permits Cat, Dog {
	protected String name;
	protected int age;
	
	public PetAnimal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void eat(){
		System.out.println(this.getName() +" eating...");
	}
	
	public abstract void makeSound();
	
	public void sleep(){
		System.out.println(this.getName() + " Sleeping...");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}