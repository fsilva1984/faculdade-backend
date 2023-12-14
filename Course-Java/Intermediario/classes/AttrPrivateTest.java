package classes;

public class AttrPrivateTest {
	
	public static void main(String[] args) {
		
		
		AttrPrivate data = new AttrPrivate();
		
		data.setRendaBruta(6.790833);
		data.setPgFuncionarios(700.826);
		data.setEstoque(2.000276);
		
		
		System.out.printf("Renda Bruta Mensal: %f%n", data.getRendaBruta());
		System.out.printf("Pagamento Funcionarios: %.5f%n", data.getPgFuncionarios());
		System.out.printf("Reposicao: %f", data.getEstoque());

	}
}
