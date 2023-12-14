package desafioPessoa;

public class Jantar {
	
	public static void main(String[] args) {
		
		/* Aqui a classe Pessoa vai
		 * desfrutar de tudo o que a classe Comer
		 * tem a oferecer. */
		
		Pessoa cliente = new Pessoa("Welingthon", 82);
		

		String clienteEntra = String.format("%n Sr: %s peso: %.2f %n", cliente.nome, cliente.peso);
		System.out.println(clienteEntra);
		
		
		Comer menu = new Comer();
		menu.arroz = 0.270;
		menu.feijao = 0.345;
		menu.carne = 0.232;
		menu.salada = 0.156;
		menu.bebida = 0.320;
		menu.sobremesa = 0.155;
		
		double somaPratos = menu.arroz
				+ menu.feijao
				+ menu.carne
				+ (menu.bebida * 2)
				+ menu.salada
				+ menu.sobremesa;
		
		double novoPeso = cliente.MyPeso(somaPratos);
		String clienteSaida = String.format("%n Sr: %s peso: %.2f %n", cliente.nome, novoPeso);
		System.out.println(clienteSaida);
	}
}
