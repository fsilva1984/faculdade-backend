package comparacao;

import java.util.Date;

public class UsuarioTest {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario();
		Usuario user2 = new Usuario();
		
		user1.name = "flavio";
		user1.email = "fs@gmail.com";
		
		user2.name = "flavio";
		user2.email = "fs@gmail.com";
		
		/* Antes da implementacao na classe pai
		 * essa comparacao retornaria falsa pois
		 * o java compararia os enderecos na memoria */
		System.out.println(user1.equals(user2));
		
		 Date date = new Date();
		System.out.println(user1.equals(date));
	}
	
}
