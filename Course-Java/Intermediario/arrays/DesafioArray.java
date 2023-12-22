package arrays;

import java.util.Arrays;

import javax.swing.*;

public class DesafioArray {

	public static void main(String[] args) {
		
		String nNotas = JOptionPane.showInputDialog("info. quantidade de notas");
		
		Integer nNotasParsead = Integer.valueOf(nNotas);
		
		double[] notas =  new double[nNotasParsead];
		
		
		for(int i = 0; i < notas.length; i++) {
			String n = JOptionPane.showInputDialog("info nota");
			Double y = Double.valueOf(n); 
			notas[i] = y;
		}
		
		double total = 0.0;
		for(double i: notas) {
			double sum = i += i;
			total = sum / nNotasParsead;		
					
		}
		
		String msg = String.format("Media das notas: %.1f ", total);
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		System.out.println(Arrays.toString(notas));
	}
}
