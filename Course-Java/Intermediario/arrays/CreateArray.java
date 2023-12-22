package arrays;

public class CreateArray {
	
	public static void main(String[] args) {
		
		// criar e inicializar um array com 5 posicoes
		double[] notas = new double[5];
		
		// criar e inicializar um array com  valores
		double[] n = {7.1, 5.3, 4.5, 8.6, 7.2};
		
		String[] materia = {"Portugues","Matematica","Ciencia","Historia","Goegrafia"};
		System.out.println(n.length);
		
		n[2] = 9.0;
		System.out.println(n[0]);
		System.out.println(n.length);
		System.out.println("");
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = n[i];
			System.out.println("Nota: "+notas[i]+" = "+materia[i]);
		}
	}
}
