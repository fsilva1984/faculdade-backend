package desafioPessoa;

public class Pessoa {
	/*
	 * classe pessoa tem nome peso e um
	 * metodo para somar o seu peso 
	 * cada vez que recebe u  bouble por parametro */
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	double MyPeso(double comida) {
		return this.peso += comida;
	}
	
}
