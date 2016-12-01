import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class numsum62 extends JFrame {
	
	public numsum62() {
	
		JLabel label = new JLabel("Enter 2 numbers that you want to sum: ");
		JPanel panel = new JPanel();
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JButton button = new JButton("Add");
	
		panel.add(label);
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number1 = num1.getText();
			String number2 = num2.getText();
			JOptionPane.showMessageDialog(null, "The result is: " + (Double.parseDouble(number1)+Double.parseDouble(number2)));

			}
		});

		add(panel);
		setSize(500, 100);
		setVisible(true);

	}
	public static void main(String[] args) {
		new numsum62();
	}
}
