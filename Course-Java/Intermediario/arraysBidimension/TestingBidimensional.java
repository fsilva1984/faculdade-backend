package arraysBidimension;

public class TestingBidimensional {
	
	public static void main(String[] args) {
		
		int[][] num1 = new int[2][3];
		
		//  [ [ 0, 0, 0 ], [ 0, 0, 0 ] ]
		num1[0][0] = 9;
		num1[0][1] = 4;
		num1[0][2] = 6;
		
		num1[1][0] = 9;
		num1[1][1] = 2;
		num1[1][2] = 6;
		
		int total = 0;
		
		for(int i = 0; i < num1.length; i++) {
	
			int f = 0;
			for(int j = 0; j < num1[i].length; j++) {

				total += num1[i][f];
				
				f++;
			}
		
			}
		System.out.println(total);
		

		
		String[][] nomes = new String[2][4];
		
		nomes[0][0] = "Flavio";
		nomes[0][1] = "Francisco";
		nomes[0][2] = "Da";
		nomes[0][3] = "Silva";
		
		nomes[1][0] = "Jaqueline";
		nomes[1][1] = "Reis";
		nomes[1][2] = "Moraes";
		nomes[1][3] = "Silva";
		
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.println(" ");

			for(int j = 0; j < nomes[i].length; j++) {
				
				System.out.println(nomes[i][j]);

			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
