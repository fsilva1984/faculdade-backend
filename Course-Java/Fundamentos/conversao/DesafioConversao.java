package fundamentos2;

import javax.swing.JOptionPane;

public class DesafioConversao {

public static void main(String[] args) {
	
	
	// caixa de mensagem simples
	JOptionPane.showMessageDialog(null, "Digite o valor dos tres ultimos salarios");
	
	// variaveis para usar no while
	int n = 0;
	Double subTotal = 0.0;
	//Double converting = 0.0;
	
	// O while lanca a caixa 3 vezes ate sua condicao ser satisfeita
	while(n < 3) {
		
		//caixa de dialogo, ecebe entrada de us
		String sal = JOptionPane.showInputDialog("Valor: ");
		
		// trocando padrao  
		sal = sal.replace(",", ".");
		
		// total recebe converte e soma os valores digitados na caixa de dialogo 
		subTotal += subTotal.valueOf(sal);
		n++;
	}
	
	double total =  subTotal / 3;
	String formated = String.format("Media dos tres ultimos salarios: %.5f", total);

	JOptionPane.showMessageDialog(null, formated);

}







}
