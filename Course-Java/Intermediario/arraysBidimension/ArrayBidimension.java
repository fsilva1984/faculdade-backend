package arraysBidimension;

import java.util.Arrays;

//import javax.swing.JOptionPane;

public class ArrayBidimension {
	
	public static void main(String[] args) {
		
		
		String[][] nome = new String[2][5];
//		
//		nome[0][0] = "Antonio";// indice 0 do array 0 recebe Antonio
//		nome[1][0] = "Mateus";// indice 1 do array 0 recebe Mateus
//		nome[2][0] = "Algustos";//indice 2 do array 0 recebe Agustos
//		nome[3][0] = "Julia";// assim por diante
//		nome[4][0] = "Maria";
//		
//		nome[0][1] = "Marcos";// serve tambem para o array de inidce 1
//		nome[1][1] = "Gibe";
//		nome[2][1] = "Cesar";
//		nome[3][1] = "Moraes";
//		nome[4][1] = "Policarpo";
		
		
		//System.out.println(nome[4][0]+" "+nome[4][1]);
		
		nome[0][0] = "nome1";
		nome[0][1] = "nome2";
		nome[0][2] = "nome3";
		nome[0][3] = "nome4";
		nome[0][4] = "nome5";
		
		nome[1][0] = "nome6";
		nome[1][1] = "nome7";
		nome[1][2] = "nome8";
		nome[1][3] = "nome9";
		nome[1][4] = "nome10";
		
		System.out.println(Arrays.toString(nome[0]));
		System.out.println(Arrays.toString(nome[1]));
		System.out.println(nome.length);
		
		System.out.println("");
		
		for(int i = 0; i < nome.length; i++) {//verifica tamanho do array
			System.out.println("");
			System.out.println(Arrays.toString(nome[i]));
			for(int j = 0; j < nome[0].length; j++) {//verifica o tamanho do indice zero do array
				
				//Traz todo que tem no indice zero
				System.out.println(nome[0][j]);
			}
		}
		

		
		
	}
}
