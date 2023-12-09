package controle;

public class BreakRotulado {
	
public static void main(String[] args) {
	
externo: for(int i = 1;i <= 3; i++) {
	
		for(int j = 1;j <= 3; j++) {
			if(i == 3) break externo;
			System.out.printf("[%d %d]", i, j);
		}
		
		
	}
}
}
