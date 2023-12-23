package hasCode;

public class Hash {
	/* Implementando o equals e o hasCode
	 * para fins de igualdedades comparativas */
	private String name;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
	/* Aqui declaramos que a propriedade nome
	 * da class Hash terao os hasCodes iguais,
	 * tendo como base o comprimento do valor
	 * da propriedade nome */
	public int hashCode() {
		return this.name.length();
	}
	
	
	/* relembrando a aula de comparacaoes
	 * aqui declaramos que toda instancia
	 * da super class que nesse caso e a Hash,
	 * sera comparados os valores definidos nas
	 * propriedades */
	public boolean equals(Object obj) {
		
		if(obj instanceof Hash) {
			Hash objHash = (Hash) obj;
			boolean equalsName = objHash.name.equals(this.name);
			return equalsName;
			
		} else {			
			return false;
		}
		
		
		
	}	
		
	
	
}
