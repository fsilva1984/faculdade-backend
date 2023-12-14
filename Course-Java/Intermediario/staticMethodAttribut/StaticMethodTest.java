package staticMethodAttribut;

public class StaticMethodTest {
	
	public static void main(String[] args) {
		StaticMethod methodCalArea = new StaticMethod(6.0, 2);
		double n = methodCalArea.raio;
		int r = methodCalArea.x;
		
	Double result =	StaticMethod.calArea(n, r);
	
	System.out.printf("Area total: %.3f",result);
	}
}
