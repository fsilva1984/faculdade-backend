package controle;

import javax.swing.JOptionPane;

public class StringIgnoreCase {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Tente adivinhar qual e o animal!");
		String animal = JOptionPane.showInputDialog("Animal e");
		
		String anim = "Galinha";
	
			
			if(anim.equalsIgnoreCase(animal)) {
				JOptionPane.showMessageDialog(null, "Na mosca!!");
			} else {
				JOptionPane.showMessageDialog(null, "Não foi desa vez :(");
			}
			
	
			
			
		}
		
		
}
	
