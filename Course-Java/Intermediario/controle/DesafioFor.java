package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		
		// versao  original
		String val1 = "word";
		String val2 = "";
		
		String serquilha = "#";
		
		System.out.println(serquilha);
		
		int n = val2.length();
		for(;n < val1.length(); n++) {
			
		
			System.out.println(serquilha += "#");
		}
		
		
		//versao otimizada
		for(String  i = "#"; !i.equals("########"); i += "#") {
			System.out.println(i);
		}
	}
}
