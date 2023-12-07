package fundamentos2;

import javax.swing.JOptionPane;
public class Calculadora {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Digite o Operador em seguida o(os) Operando(os), se raiz digite R");
		
		String op = JOptionPane.showInputDialog("Operador: ");
		String num1 = JOptionPane.showInputDialog("Operando: ");
		String num2 = JOptionPane.showInputDialog("Operando: ");
		
		num1 = num1.replace(",", ".");
		int i1 = num1.indexOf(".");
		
		//bloco da raiz quadrada
		boolean r = op.equalsIgnoreCase("R");
		if (r) {	
			
			if(i1 == -1) {
				Integer n1 = Integer.valueOf(num1);
				int sqrt = (int) Math.sqrt(n1);
				String msg = String.format("Resultado: %d",sqrt);
				JOptionPane.showMessageDialog(null, msg);
				
			} else {
				Double n1 = Double.valueOf(num1);
				Double sqrt = Math.sqrt(n1);
				String msg = String.format("Resultado: %.2f",sqrt);
				JOptionPane.showMessageDialog(null, msg);
			}
		}
		
		// bloco dos operadores ( + - * ^ / )
		switch(op) {
		
		case "+":
			if(i1 == -1) {
				Integer adic = Integer.valueOf(num1) + Integer.valueOf(num2);
				String msg = String.format("Resultado: %d", adic);
				JOptionPane.showMessageDialog(null, msg);
				break;
			} else {
				Double adic = Double.valueOf(num1) + Double.valueOf(num2);
				String msg = String.format("Resultado: %.2f", adic);
				JOptionPane.showMessageDialog(null, msg);
				break;
			}
			
			
		case "-":
			if(i1 == -1) {
				
				Integer sub = Integer.valueOf(num1) - Integer.valueOf(num2);
				String msg = String.format("Resultado: %d", sub);
				JOptionPane.showMessageDialog(null, msg);
				break;
				
			} else {
				Double sub = Double.valueOf(num1) - Double.valueOf(num2);
				String msg = String.format("Resultado: %.2f", sub);
				JOptionPane.showMessageDialog(null, msg);
				break;
			}
			
		case "x":
			if(i1 == -1) {
				Integer mult = Integer.valueOf(num1) * Integer.valueOf(num2);
				String msg = String.format("Resultado: %d", mult);
				JOptionPane.showMessageDialog(null, msg);
				break;
				
			} else {
				Double multDouble = Double.valueOf(num1) * Double.valueOf(num2);
				String msg = String.format("Resultado: .2f", multDouble);
				JOptionPane.showMessageDialog(null, msg);
				break;
			}
			
		case "/":
			if(i1 == -1) {
				Integer div = Integer.valueOf(num1) / Integer.valueOf(num2);
				Double rest = Double.valueOf(num1) % Double.valueOf(num2);
				String result = String.format("Resultado: %d Resto: %.2f", div, rest);
				JOptionPane.showMessageDialog(null,result);
				break;
				
			} else {
				Double div = Double.valueOf(num1) / Double.valueOf(num2);
				Double rest = Double.valueOf(num1) % Double.valueOf(num2);
				String result = String.format("Resultado: %.2f Resto: %.2f", div, rest);
				JOptionPane.showMessageDialog(null,result);
				break;
			}
		case "^":
	
				Double n1 = Double.valueOf(num1);
				Double n2 = Double.valueOf(num2);
				Double pow =  Math.pow(n1, n2);
				String result = String.format("Resultado: %.2f", pow);
				JOptionPane.showMessageDialog(null,result);
				break;


		} 
	}
}
