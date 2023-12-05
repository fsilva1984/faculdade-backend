package ternario;

import javax.swing.JOptionPane;
public class Ternario {


		public static void main(String[] args) {
			float base = 6.5F;
			
			String name = JOptionPane.showInputDialog("Nome do Aluno: ");
			Float notaPortu = Float.valueOf(JOptionPane.showInputDialog("Maior nota em portugues: "));
			Float notaMatem = Float.valueOf(JOptionPane.showInputDialog("Maior nota em matematica: "));
			Float notaCienc = Float.valueOf(JOptionPane.showInputDialog("Maior nota em ciencia: "));
			Float notaAmbie = Float.valueOf(JOptionPane.showInputDialog("Maior nota em ambientalizacao: "));
			Float notaFisic = Float.valueOf(JOptionPane.showInputDialog("Maior nota em fisica: "));
			
			
			float sum = notaPortu + notaMatem + notaCienc + notaAmbie + notaFisic;
			float med = sum / 5;
			
			String status = med >= base ? "Aprovado":"Recuperacao";
			String msg = String.format("Aluno(a) %s com nota media %.1f status: %s" , name,med, status);
			
			if(med >= base) {
				JOptionPane.showInternalMessageDialog(null, msg);
			} else {
				JOptionPane.showInternalMessageDialog(null, msg);
			}
			
		}

	}
