package week02.day02;

public class Quest002 {
	public static void main(String[] args) {
		char letter;
		
		for (int i = 97; i <= 122; i++){
			letter = (char) i;
			System.out.print(letter+ " ");
		}
		System.out.println("");
		for (char begin = 'a'; begin <= 'z'; begin++){
			System.out.print(begin+ " ");
		}
	}
}