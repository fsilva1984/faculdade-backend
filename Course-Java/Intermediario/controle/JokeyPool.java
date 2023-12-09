package controle;

import javax.swing.JOptionPane;
public class JokeyPool {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "JOKEY POOUL");
		String inputUser = JOptionPane.showInputDialog("?");

	String arr[] = {"Papel", "Pedra", "Tesoura"};
		
		int rand = (int)(Math.random() * 3 - 0);
		String choiceRand = arr[rand];
		
		String choice = inputUser;
		int n = 0;
		if(choice.equalsIgnoreCase("tesoura")) {
			n = 2;
			} else if(choice.equalsIgnoreCase("pedra")) {
				n = 1;
				} else {
					n = 0;
				}
		
		int num = 0;
		if(choiceRand.equalsIgnoreCase("tesoura")) {
			num = 2;
			} else if(choiceRand.equalsIgnoreCase("pedra")) {
				num = 1;
				} else {
					num = 0;
				}
		
		//arr[0] > arr[1] && arr[0] < arr[2]
		//arr[1] > arr[2] && arr[1] < arr[0]
		//arr[2] > arr[0] && arr[2] < arr[1] enter.equalsIgnoreCase("tesoura")
		
		
		if(n == 1 && num == 0) {
			// rand vence
			JOptionPane.showMessageDialog(null, "Venceu o SISTEMA "
					+"Papel vence Pedra!");
		} else if(n == 2 && num == 1) {
			JOptionPane.showMessageDialog(null, "Venceu o SISTEMA "
					+"Pedra vence Tesoura!");
			// rand vence
		} else if(n == 0 && num == 2){
			JOptionPane.showMessageDialog(null, "Venceu o SISTEMA "
					+"Tesoura vence Papel!");
			// rand vence
			
			
			
		} else if(n == 0 && num == 1){
			JOptionPane.showMessageDialog(null, "Venceu VOCÊ "
					+"Papel vence Pedra!");
			// choice vence
		} else if (n == 1 && num == 2) {
			JOptionPane.showMessageDialog(null, "Venceu VOCÊ "
					+"Pedra vence Tesoura!");
			// choice vence
		} else if (n == 2 && num == 0) {
			JOptionPane.showMessageDialog(null, "Venceu VOCÊ "
					+"Tesoura vence Papel!");
			// choice vence
		} else {
			JOptionPane.showMessageDialog(null, "Empate tecnico");
			// empate
		}
		// tesoura 2, pedra 1, papel 0
			
		
		System.out.println(n);
		System.out.println(num);
		
		
		
		
		

	}
}
