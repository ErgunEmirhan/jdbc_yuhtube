package week06.day02.abstaction.quest001;

public non-sealed class Cat extends PetAnimal {
	
	
	public Cat(int age, String name) {
		super(age, name);
	}
	
	public void playWithWoolBall(){
		System.out.println(this.name +" playing with wool ball");
	}
	
	@Override
	public void makeSound() {
		System.out.println("meow");
	}
}