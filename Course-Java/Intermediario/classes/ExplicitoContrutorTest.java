package classes;

public class ExplicitoContrutorTest {
	
	public static void main(String[] args) {

		ExplicitoContrutor eC = new ExplicitoContrutor("Silva", 32, 10297345643L);
		System.out.println(eC.nome);
		System.out.println(eC.idade);
		System.out.println(eC.cpf);

	}
	
}
