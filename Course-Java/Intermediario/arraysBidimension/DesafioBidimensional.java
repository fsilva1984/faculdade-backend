package arraysBidimension;


import javax.swing.*;
public class DesafioBidimensional {
	
	public static void main(String[] args) {
		
			/* Quantos alunos serão avaliados vai gerar um numero
			 *  interio para definir o tamanho do array principal.
			 */
			String qtAluno = JOptionPane.showInputDialog("Quantos Aluno avaliados");
			Integer nAluno = Integer.valueOf(qtAluno);
			
			/* Quantas notas serão avaliadas, vai gerar um numero
			 *  interio para definir o tamanho dos sub-arrays.
			 */
			String qtNotas = JOptionPane.showInputDialog("Quantas notas avaliadas");
			Integer nNotas = Integer.valueOf(qtNotas);
			

			
				// construcao do array		
			Double[][] totalAlunosNotas = new Double[nAluno][nNotas];
			
			
			
			
			/* O primeiro for itera indice a indice 
			 * do array principal
			 * chamando o seguinte cada  vez que o segundo for 
			 * acabe de iterar os valores do indice atual
			 */
			for(int y = 0; y < totalAlunosNotas.length; y++) {
				
				
			
			/* O segundo for vai iterar o sub-array
			 * para receber os valores de entrada*/
			int i = 0;
			for(int x = 0; x < totalAlunosNotas[y].length; x++) {
							
				String msg = String.format("Aluno: %d nota %d", y+1, i+1);
				
				String notas = JOptionPane.showInputDialog(msg);
				Double n = Double.valueOf(notas);
				
				totalAlunosNotas[y][i] = n;
			
				i++;
			}
			}
			
			
			/* construimos um array que vai receber as notas somadas
			 * de cada aluno*/
			Double[][] avalNotas = new Double[nAluno][1]; 
			
						
			/* Somamos as notas de cada aluno e guardamos 
			 * no array avalNotas */
			for(int j = 0;j < totalAlunosNotas.length; j++) {
				
				double z = 0.0;
				int a = 0;
				for(int s = 0; s <  totalAlunosNotas[j].length; s++) {

					z += totalAlunosNotas[j][a];
					avalNotas[j][0] = z;
					a++;

				}
				
			}
			
			
			/* Pegamos as notas somadas de cada aluno e 
			 * calculamos a media aritimetica,
			 * retornamos o alubo avaliado e sua pontuacao media */
			int b = 1;
			int k = 0;
			while(k < totalAlunosNotas.length) {
				
				Double total = avalNotas[k][0] / totalAlunosNotas[k].length;
				String resultFinal = String.format("Aluno %d Media %.2f", b, total);
				JOptionPane.showMessageDialog(null, resultFinal);
				b++;
				k++;
			}
			

	}
}
