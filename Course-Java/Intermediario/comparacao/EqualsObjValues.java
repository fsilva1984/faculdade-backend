package comparacao;

public class EqualsObjValues {
	
	/*	Se comparar-mos dois elementos como 2.0 == 2.0
	 * o retorno sera true, mas se comparar-mos dois 
	 * objetos instanciados da mesma classe com os mesmos
	 * atributos e metodos, o retorno sera false,  !!. ??
	 * O porque diso ?, Acontece que quando comparamos objetos
	 * estamos comparando o seu endereco na memoria
	 * como como cada um tera enderecos distintos entao o
	 * retorno sera false. 
	 * 
	 * */
	
	String nome;
	int idade;
	
	void definePesoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	String pessoa(){
		String p = String.format("Sr(a) %s : Idade: %d", nome, idade);
		return p;
	}
}
