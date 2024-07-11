package week03.day05.menu_with_methods.CommonMethods;

public class DrawTriangle {
	public void rightTriangle(int size){
		for (int i = 0; i < size; i++){
			for (int j = 0; j <=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void invertedRightTriangle(int size){
		for (int i = 0; i < size; i++){
			for (int j = size; j >i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void equilateralTriangle(int size){
		String star = "";
		for (int i = 0; i < size; i++){
			for (int j = size-1; j >i; j--){
				System.out.print(" ");
			}
			star += "*";
			System.out.println(star);
			star += "*";
		}
	}
	public void invertedEquilateralTriangle(int size) {
		String space = "";
		for (int i = 0; i < size; i++) {
			System.out.print(space);
			space += " ";
			for (int j = size*2-1; j>i*2; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}