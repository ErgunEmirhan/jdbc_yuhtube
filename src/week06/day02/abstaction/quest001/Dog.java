package week06.day02.abstaction.quest001;

public non-sealed class Dog extends PetAnimal {
	
	public Dog(int age, String name) {
		super(age, name);
	}
	
	public void bringTheStick(){
		System.out.println(this.name +" bringing the stick...");
	}
	
	@Override
	public void makeSound() {
		System.out.println("roof roof");
	}
}