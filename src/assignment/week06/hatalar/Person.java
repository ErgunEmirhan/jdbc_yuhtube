package assignment.week06.hatalar;

/*
* Hatalı kod
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        name = name;
        age = age;
    }

    public void printInfo() {
        System.out.println("Ad: " + name + ", Soyad: " + age);
    }

    public static void main(String[] arg) {
        Person person = new Person("Berk", 30);
        person.printInfo();
    }
}
* */
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Ad: " + name + ", Soyad: " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person("Berk", 30);
		person.printInfo();
	}
}