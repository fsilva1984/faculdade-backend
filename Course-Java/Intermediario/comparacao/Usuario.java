package comparacao;

public class Usuario {

	String name;
	String email;
	
		/* O metodo aqui implementado 
		 * sabera que , quando for chamado para
		 * comparado objatos dessa mesma classe
		 * sera comparado os valores de seus atributos
		 * que nesse caso sao o nome e o email */
	
	/* construtor da classe equals recebe um parametro
	 * que sera do tipo Object */
	public boolean equals(Object obj) {
		
		
		
		/* se o obj comparado e uma instancia de Usuario
		 * a logica sera usada caso contrario sera retornado false. */
		if (obj instanceof Usuario) {
			
			/* O objeto que o construtor da classe equals
			 * implemetara pertencera a classse Usuario */
			Usuario otherObj = (Usuario) obj;
			
			
			
			/* Agora o equals ao cer chamado para com parar
			 * outro obj dessa mesma classe ele comparara
			 * os valores dos atributos. */
			boolean equalsName = otherObj.name.equals(this.name);
			boolean equalsEmail = otherObj.email.equals(this.email);
			
			return equalsName && equalsEmail;			
			
		} else {
			return false;
		}
	}
}
