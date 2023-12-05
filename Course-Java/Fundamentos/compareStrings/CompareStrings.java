package compareStrings;

import javax.swing.JOptionPane;

/*
 * Sempre que for comparar strings
 * nao use o operador de igualdade
 * mas use o .equals()
 * assim evita erros no codigo. 
 * */
public class CompareStrings {
	public static void main(String[] args) {
		
	String animal = JOptionPane.showInputDialog("Digite Macaco: ");
	
	//se colocar assim animal == "Macaco" gera um rsultado impreciso 
	if(animal.equalsIgnoreCase("Macaco")) {//aqui compara sem distincao de case resultado preciso.
		JOptionPane.showInternalMessageDialog(null, "susscces!");
	} else {
		JOptionPane.showInternalMessageDialog(null, "failure!");
	}
	

	}
	
	
}
