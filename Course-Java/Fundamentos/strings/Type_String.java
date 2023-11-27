package strings;

public class Type_String {
	
	// Algumas funcionalidades da String
	
	public static void main(String[] args) {
		
		String fraseDia = "Bom dia";
		String juntoA = "!!";
		
		// concat method
		System.out.println(fraseDia.concat(juntoA));
		
		// geram valores boolean
		Boolean s = fraseDia.startsWith("Bom");
		Boolean e = fraseDia.endsWith("tarde");
		Boolean i = fraseDia.equals("Boa tarde");
		Boolean y = fraseDia.equalsIgnoreCase("bom dia");
		Boolean j = fraseDia.contains("Bom");
		
		System.out.println(s+"\n"+e+"\n"+i+"\n"+y+"\n"+j+"\n");
		
		// usando o printf
		var nome = "Rafael";
		var idade = 32;
		var prof = "Programador";
		var salario = 6_718.32;
		
		System.out.printf(" Nome: %S \n Idade: %d \n Profissao: %s \n Salario: %.2f\n\n",
				nome, idade, prof, salario);
		
		// Usando o .format
		String funcionario = String.format(" Nome: %S \n Idade: %d \n Profissao: %s \n Salario: %.2f\n",
				nome, idade, prof, salario);
		
		System.out.println(funcionario);
		
		// indice do primeiro caractere fornecido
		int idx = fraseDia.indexOf("ia");
		
		System.out.println(idx);
		
		
	}
}
