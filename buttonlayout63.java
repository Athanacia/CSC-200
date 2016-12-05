import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;


public class buttonlayout63 extends JFrame {
	public buttonlayout63() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextField [] textarray = new JTextField[4];
		for(int i=0; i<textarray.length; i++) {
			textarray[i] = new JTextField(10);
			panel.add(textarray[i]);
		}
		//panel.add(textarray[0], BorderLayout.NORTH);
		//panel.add(textarray[1], BorderLayout.SOUTH);	
		//panel.add(textarray[2], BorderLayout.EAST);
		

		setSize(200,75);
		setTitle("Too many Text Fields O.o");
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new buttonlayout63();
	}
}
