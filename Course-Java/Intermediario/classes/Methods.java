package classes;

public class Methods {
	
	//DEFININDO METODOS
	
//  tipo  nome   parametros
	 int soma(int x, int y) {
		return x + y;
	}
	 
// SOBRECARGA
	 // mesmo metodo mas com asinaturas diferentes
	 double sub(double x, double y) {
		 return x - y;
	 }
	 double sub(double x, double y, double z) {
		 return x - y - z;
	 }

// METODO SEM RETORNO
	 String name;
	 void nome(String n) {
		 System.out.println(n.toUpperCase());
	 }

	
	 
	 
}
