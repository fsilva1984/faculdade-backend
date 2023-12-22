package arraysList;

import java.util.ArrayList;
import java.util.List;
public class ArrayListsInteger {
	
	public static void main(String[] args) {
		
		Integer rand = (int) (Math.random() * ( 55 - 10) + 10);
		Double randDouble = (double) (Math.floor(Math.random()) * ( 55 - 10) + 10);
		
		List<Integer> num = new ArrayList<>();
		List<Double> doub = new ArrayList<>();
		
		int n = 0;
		int i = 0;
		for(;i <= 5; i++) {
			n += rand;
			num.add(n);
			
		}
		
		double d = 0.0;
		int j = 0;
		for(;j <= 5; j++) {
			d += randDouble;
			doub.add(d);
			
		}

		System.out.println(num);
		System.out.println(doub);
		
	}
}
