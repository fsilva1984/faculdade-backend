package conversao_explicita;

public class Converting {
	public static void main(String[] args) {
		/*
		 *  Deve se ter em mente que 
		 * na conversao pode haver perda de infomacao.
		 * no exemplo: convertendo o numero 1.293046278459 para float
		 * perderemos 44 casas decimais pois o float nao suporta
		 * a quantidade de bytes do numero, pois quem tem maor capacidade
		 * de bytes e o doble que suporta 8 bytes e o float 4
		 * 
		 * */
		
		// conversao implicita (CAST) nao se faz nessecario
		double numD = 100;
		
		//duas maneiras de converter explicitamente (CAST)
		float numF1 = (float) 1.8347695;// ou a baixo
		float numF2 =  1.8347695F;// com F no final
		
		//conversao explicita.
		double f = 12.990;
		int e = (int) f;//decimais ignorados gerando uma posivel perda

		
		System.out.printf(
				" %f %n %f %n %f %n %d",
				numF1, numF2, numD, e
				);

		
	}
}
