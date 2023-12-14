package arrays;

public class IteringList {

	private String names[] = new String[10];
	private Double salary[] = new Double[10];
	private String sector[] = new String[10];
	private Integer id[] = new Integer[10];
	
	String[] getNames() {
		return names;
	}
	void setNames(String[] n) {
		names = n;
	}
	
	String[] getSector() {
		return sector;
	}
	
	
	
	void setSector(String[] n) {
		sector = n;
	}

	Double[] getSalary() {
		return salary;
	}
	
	void setSector(Double[] n) {
		salary = n;
	}
	
	Integer[] getId() {
		return id;
	}
	
	void setId(Integer[] n) {
		id = n;
	}
}
