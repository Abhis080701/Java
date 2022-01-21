import javax.swing.*;

public class SwingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp; // Temporary storage for input.
		temp = JOptionPane.showInputDialog(null, "Firstnumber");
		int a = Integer.parseInt(temp); // String to int
		temp = JOptionPane.showInputDialog(null, "Second number");
		int b = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog(null, "Third number");
		int c = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Average is " + (a + b + c) / 3);
	}

}
