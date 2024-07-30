package week06.day02.abstaction.quest001;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat(1,"kedy");
		Dog dog = new Dog(2, "köpke");
		cat.makeSound();
		dog.makeSound();
		System.out.println();
		
		cat.playWithWoolBall();
		dog.bringTheStick();
		System.out.println();
		
		cat.sleep();
		dog.sleep();
		System.out.println();
		
		cat.eat();
		dog.eat();
	}
	
}