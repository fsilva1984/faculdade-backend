package controle;

public class ForAninhado {

	public static void main(String[] args) {
		 	 
		int i = 1;
		for(;i <= 5; i++) {
			System.out.println(i);
			
			for(;i <= 10; i++) {
				System.out.println(i);
				
				for(;i <= 15; i++) {
					System.out.println(i);

					}
				}
			}
	}
}
