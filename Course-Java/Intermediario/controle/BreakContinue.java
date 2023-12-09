package controle;

public class BreakContinue {
	public static void main(String[] args) {
		
		int i = 1;
		for(;i < 6;i++) { // para no 5
			if(i == 5) break;
			System.out.println(i);
		}
		
		System.out.println("");
		
		for(;i <= 10;i++) {// pula o 7
			if(i == 7) continue;
			System.out.println(i);
		}
		
	}
}
