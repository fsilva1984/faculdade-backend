package staticMethodAttribut;

public class Desconto25Test {
	
	public static void main(String[] args) {
		
		Desconto25 tudo25 = new Desconto25();
		
		tudo25.nome = "Notebook";
		tudo25.preco = 2855.00;
		System.out.printf("Produto: %s%n",tudo25.nome );
		System.out.printf("Preco: %.3f%n",tudo25.preco );
		System.out.printf("Desconto: %.2f%n",Desconto25.desconto(tudo25.preco));
		System.out.printf("Total: %.3f%n",
				tudo25.total = tudo25.preco - Desconto25.desconto(tudo25.preco));
		
		System.out.println("");
		
		tudo25.nome = "MacBook";
		tudo25.preco = 10.635;
		System.out.printf("Produto: %s%n",tudo25.nome );
		System.out.printf("Preco: %.3f%n",tudo25.preco );
		System.out.printf("Desconto: %.2f%n",Desconto25.desconto(tudo25.preco));
		System.out.printf("Total: %.3f%n",
				tudo25.total = tudo25.preco - Desconto25.desconto(tudo25.preco));
		
		System.out.println("");
		
		tudo25.nome = "NetBook";
		tudo25.preco = 975.0;
		System.out.printf("Produto: %s%n",tudo25.nome );
		System.out.printf("Preco: %.3f%n",tudo25.preco );
		System.out.printf("Desconto: %.2f%n",Desconto25.desconto(tudo25.preco));
		System.out.printf("Total: %.3f%n",
				tudo25.total = tudo25.preco - Desconto25.desconto(tudo25.preco));
		
	}
}
