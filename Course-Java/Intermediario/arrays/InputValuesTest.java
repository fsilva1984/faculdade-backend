package arrays;

import javax.swing.JOptionPane;
public class InputValuesTest {
	public static void main(String[] args) {
		
		// Chamar o construtor
		InputValues data = new InputValues();
		
		//definir uma msg inicial
		JOptionPane.showMessageDialog(null, "Hello");
		
		// variavel de incremento
		int n = 0;
		while(n < 5) {
			// entrada de dados
			String tarefa = JOptionPane.showInputDialog("Tarefa: ");
			
			// verifica sae o dado recebido e uma ordem de sair
			if(!tarefa.equalsIgnoreCase("sair")) {
				
				// datos inceridos no vetor
				data.todo[n] = tarefa;
				// mostra dados do vetor
				System.out.println(data.todo[n]);
				// se a ordem e sair, para o loop 
			} else {
				break;
			}
			// variavel sendo incrementada
			n++;
		}

		
		
	}
}
