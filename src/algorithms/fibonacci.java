package algorithms;

import javax.swing.JOptionPane;

public class fibonacci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	JOptionPane.showMessageDialog(null, a);
	JOptionPane.showMessageDialog(null, b);
	for(int i =0;i<12;i++) {
		int temp= b;
		b=a+b;
		a=temp;
		JOptionPane.showMessageDialog(null, b);


		
	}}}
