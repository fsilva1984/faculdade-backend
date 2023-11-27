
package notacao_ponto;

public class Point_notation {

	public static void main(String[] args) {
	// notação de ponto indica que temos a disposição
	// um metodo ou propriedade
		
		String nome = "Flavio F Silva";
		String user = "Nome: X";
		
		nome = nome.toUpperCase();
		System.out.println(user.replace("X", nome)+", Tem "+nome.length()+""+" letras");
	}
}

