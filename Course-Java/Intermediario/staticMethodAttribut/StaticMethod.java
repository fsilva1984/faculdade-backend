package staticMethodAttribut;

public class StaticMethod {
	
	Double raio = 0.0;
	Integer x= 0;
	final static Double PI = 3.1415;
	
	
	public StaticMethod(Double raio, Integer x) {
		this.raio = raio;
		this.x = x;
	}
	
	static Double calArea(Double raio, Integer x) {
		return PI * Math.pow(raio, x);
		
	}
}
