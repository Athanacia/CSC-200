import javax.swing.JOptionPane;
public class enum36 { 
	public enum months {January, February, March, April, May, June, July, August, September, October, November, December}
		public static void main(String[] args) { 
		months[] choices = {months.January, months.February, months.March, months.April, months.May, months.June, months.July, months.August, months.September, months.October, months.November, months.December}; 
		months input = (months) JOptionPane.showInputDialog(null,"Select month", "month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
		switch(input) {
			case January:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;

			case February:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;
			case March:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case April:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case June:
				JOptionPane.showMessageDialog(null, "It is summer time.");
				break;
			case July:
				JOptionPane.showMessageDialog(null, "It is summer time.");
				break;
			case August:
				JOptionPane.showMessageDialog(null, "It is summer time.");
				break;
			case September:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case October:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case December:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Select a month plz");


		}
      } 
   }
