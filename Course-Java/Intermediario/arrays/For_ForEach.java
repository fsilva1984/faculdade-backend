package arrays;

import java.util.Arrays;

public class For_ForEach {
	
	public static void main(String[] args) {
		
		String[] name = new String[5];
		
		String[] names = {"Renato","Mota","Naum","Cyquem","Tales"};
		
		// print array no console
		System.out.println(Arrays.toString(names));
		
		// for normal
		for(int i = 0; i < name.length; i++){
			name[i] = names[i];
			System.out.println(name[i]);
		}
		
		//forEach
		for(String i: names) {
			System.out.println("Sr. "+i);
		}
		
	}
}
