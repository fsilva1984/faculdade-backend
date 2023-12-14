package staticMethodAttribut;

public class Desconto25 {
	
	
	double preco;
	String nome;
	double total;
	
	final static double desconto(double preco) {
		return (preco * 10) / 100;
	}
			
}
