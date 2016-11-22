import javax.swing.JOptionPane;
public class Cardriver2 {
	public static void main(String [] args) {
	
	JOptionPane.showMessageDialog(null, "Enter the information of you car #1");
	String make1 = JOptionPane.showInputDialog("Enter make");	
	String color1 = JOptionPane.showInputDialog("Enter color");
	int horsepower1 = Integer.parseInt(JOptionPane.showInputDialog("Enter horsepower"));
	double enginesize1 = Double.parseDouble(JOptionPane.showInputDialog("Enter enginesize"));

	JOptionPane.showMessageDialog(null, "Enter the information of you car #2");
	String make2 = JOptionPane.showInputDialog("Enter make");	
	String color2 = JOptionPane.showInputDialog("Enter color");
	int horsepower2 = Integer.parseInt(JOptionPane.showInputDialog("Enter horsepower"));
	double enginesize2 = Double.parseDouble(JOptionPane.showInputDialog("Enter enginesize"));

	JOptionPane.showMessageDialog(null, "Enter the information of you car #3");
	String make3 = JOptionPane.showInputDialog("Enter make");	
	String color3 = JOptionPane.showInputDialog("Enter color");
	int horsepower3 = Integer.parseInt(JOptionPane.showInputDialog("Enter horsepower"));
	double enginesize3 = Double.parseDouble(JOptionPane.showInputDialog("Enter enginesize"));

	Car car1 = new Car(make1, color1, horsepower1, enginesize1);
	Car car2 = new Car(make2, color2, horsepower2, enginesize2);
	Car car3 = new Car(make3, color3, horsepower3, enginesize3);
	
	JOptionPane.showMessageDialog(null, "Car created: \n" + car1 + "\n" + car2 + "\n" + car3);
	
	Car car4 = new Car("Nissan", "White", 350, 2.5);
	Car carclone = new Car("Nissan", "White", 350, 2.5);

	if (car4.equals(carclone)) {
		System.out.println("true");
	} else System.out.println("false");

	}
}
