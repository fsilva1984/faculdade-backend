package controleIfElseSwith;

import javax.swing.JOptionPane;

public class IfElse {
public static void main(String[] args) {
	

	JOptionPane.showMessageDialog(null,"Digite a nota do aluno");
	String n = JOptionPane.showInputDialog("NOTA");
	
	
	Double num = Double.valueOf(n);
	
	String conceito = "";
	
	if(num >= 9.0) {
		conceito = "A";
	}else if (num >= 8.0 && num < 9.0) {
		conceito = "B";
	}else if(num >= 6.0 && num < 7.0){
		conceito = "C";
	} else if (num >= 5.0 && num <= 6.0) {
		conceito = "D";
	} else {
		conceito = "C";
	}
	
	String msg = String.format("Aluno conceito \'%s\'", conceito);
	JOptionPane.showMessageDialog(null, msg);
	
	
	
	
	
	
	
	
	
}
}