package comparacao;

public class EqualsObjValuesTest {

	public static void main(String[] args) {
		
		EqualsObjValues person1 = new EqualsObjValues();
		EqualsObjValues person2 = new EqualsObjValues();
		
		person1.definePesoa("Abel", 46);
		person2.definePesoa("Abel", 46);
		
		
		// testando os objetos
		Boolean resp1 = person1 == person2;
		
		// testando os valores dos atributos
		Boolean resp2 = person1.idade == person2.idade;
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(" ");
		
		// Cmparacoes tambem podem ser feitas dessa maneira
		
		Boolean resp3 = person1.equals(person2);
		
		Boolean resp4 = person1.nome.equalsIgnoreCase(person2.nome);
		
		
		System.out.println(resp3);
		System.out.println(resp4);
		
		
		
		
		
		
		
	}
}
