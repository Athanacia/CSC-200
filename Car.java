public class Car {
	private String make;
	private String color;
	private double engineSize;
	private int horsePower;
	private static int count;

	public Car() {
		make = "Nissan";
		color = "White";
		engineSize = 2.5;
		horsePower = 250;
	}
	public Car (String make, String color, int horsePower, double engineSize) {
		this.make = make;
		this.color = color;
		this.engineSize = engineSize;
		this.horsePower = horsePower;
		count++;
	}
	public static int getCount() {
		return count;
	}	
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public double getengineSize() {
		return engineSize;
	}
	public void setengineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public int gethorsePower() {
		return horsePower;
	}
	public void sethorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public String toString() {
		return "Make : " + this.make + " Color: " + this.color + " Engine Size: " + this.engineSize + " Horse Power: " + this.horsePower;
	}
}
