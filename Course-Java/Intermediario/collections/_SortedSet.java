package collections;


import java.util.SortedSet;
import java.util.TreeSet;

public class _SortedSet {
	
	public static void main(String[] args) {
		
		SortedSet<Integer> nums = new TreeSet<>();
		
		// os dados serao organizados de forma crescente
		nums.add(23);
		nums.add(69);
		nums.add(56);
		nums.add(43);
		
		System.out.println(nums);
		
		Integer total = 0;
		for(Integer i: nums) {
			total += i;
		}
		System.out.println(total);
	}
}
