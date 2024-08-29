package self_work.multilevel_inheritance;

public class Child extends Parent implements Interface1, Interface2 {
	@Override
	public void thisIsAMethod() {
		System.out.println("Çalışıyor. Interface conflict");
	}
	
}