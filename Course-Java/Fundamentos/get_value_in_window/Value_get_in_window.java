package get_value_in_window;


import javax.swing.JOptionPane;

public class Value_get_in_window {
	
	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Primerio valor: ");
		String n2 = JOptionPane.showInputDialog("Segundo valor: ");
		String op = JOptionPane.showInputDialog("Qual operador?: ");
		String opIsSum = "+";
		String opIsSub = "-";
		String opIsDiv = "/";
		String opIsMult = "x";
		String opIsPow = "^";

		Double sum =  Double.valueOf(n1) + Double.valueOf(n2);
		Double sub =  Double.valueOf(n1) - Double.valueOf(n2);
		Double div =  Double.valueOf(n1) / Double.valueOf(n2);
		Double mult =  Double.valueOf(n1) * Double.valueOf(n2);
		Double pow = Math.pow(Double.valueOf(n1), Double.valueOf(n2));
		
		
		if (op.charAt(0) == opIsSum.charAt(0)) {
			
			String msg = String.format("%s%s%s = %d", n1.toString(),op.toString(), n2.toString(), sum);
			JOptionPane.showInternalMessageDialog(null, msg);
		
			
		} else if(op.charAt(0) == opIsSub.charAt(0)){
			
			String msg = String.format("%s%s%s = %d", n1.toString(),op.toString(), n2.toString(), sub);
			JOptionPane.showInternalMessageDialog(null, msg);
			
		} else if(op.charAt(0) == opIsDiv.charAt(0)){
			
			String msg = String.format("%s%s%s = %d", n1.toString(),op.toString(), n2.toString(), div);
			JOptionPane.showInternalMessageDialog(null, msg);
			
		} else if(op.charAt(0) == opIsMult.charAt(0)){
			
			String msg = String.format("%s%s%s = %d", n1.toString(),op.toString(), n2.toString(), mult);
			JOptionPane.showInternalMessageDialog(null, msg);
			
		} else if(op.charAt(0) == opIsPow.charAt(0)){
			
			String msg = String.format("%s%s%s = %.2f", n1.toString(), op.toString(), n2.toString(), pow);
			JOptionPane.showInternalMessageDialog(null, msg);
			
		} else {
			
			JOptionPane.showMessageDialog(null,"Not valid operation",  "Warning", JOptionPane.ERROR_MESSAGE);
			System.out.println("Not valid operation");
		}
		

	}
}





