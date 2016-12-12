public class daydriver72 {
	public static void main(String [] args) {
		day presentday = new day("Wednesday");
		System.out.println(presentday.nextDay());
		System.out.println(presentday.previousDay());
		System.out.println(presentday.calculateDay(-1));
	}
}
