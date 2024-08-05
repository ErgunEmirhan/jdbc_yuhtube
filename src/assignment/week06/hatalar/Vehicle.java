package assignment.week06.hatalar;

	public class Vehicle {
		int wheels;
		Vehicle(int i) {
			 this.wheels = i;
		}
		public static void main(String[] args) {
			Vehicle car = new Vehicle(4);
			System.out.println("Wheels: " + car.wheels);
		}
	}