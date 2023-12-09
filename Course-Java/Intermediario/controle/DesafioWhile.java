package controle;

import javax.swing.JOptionPane;
public class DesafioWhile {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Digite o nome e as Notas do aluno de todo o semestre");
		String nome = JOptionPane.showInputDialog("Nome: ");
		String materia[] = {"Matematica","Geografia","Ciencia","Portugues","Fisica","Historia"};
		
		Double values = 0.0;
		int n = 0;
		while(n < materia.length) {
			String notas = JOptionPane.showInputDialog(materia[n]+" nota: ");
			values += Double.valueOf(notas);
			n++;
		}
		
		Double total = values / 6;
		if(total >= 6.0) {
			String msg = String.format("Aluno: %s, status: APROVADO com media %.1f", nome, total);
			JOptionPane.showMessageDialog(null, msg);
		} else {
			String msg = String.format("Aluno: %s, status: REPROVADO com media %.1f", nome, total);
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
	}
}
