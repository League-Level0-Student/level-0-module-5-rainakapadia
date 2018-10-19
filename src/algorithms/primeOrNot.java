package algorithms;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("input a number");
		int a = Integer.parseInt(answer);
		boolean prime=true;
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				prime=false;
				
			}
		}
	if (prime=true) {
	JOptionPane.showMessageDialog(null, "not prime");	
	}else {
		JOptionPane.showMessageDialog(null, "is prime");
	}}
}