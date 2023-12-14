package staticMethodAttribut;

public class StaticAttrTest {
	public static void main(String[] args) {
		
		StaticAttr staticProp = new StaticAttr(25, 35);
		
		System.out.println(staticProp.a + staticProp.b);
		
		Double n = StaticAttr.PI;
		System.out.println(n);
		
		
		Double areaCirc = StaticAttr.PI * Math.pow(staticProp.a, 2);
		System.out.println(areaCirc);
	}
}

