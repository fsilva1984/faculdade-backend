package classes;

public class DateConstructorTest {
	
	public static void main(String[] args) {
		DateConstructor date = new DateConstructor();
		
		System.out.printf("Data default: %s%n", date.fullDate());
		
		date.day = 18;
		date.moth = 05;
		date.yes = 1984;
		String myDate = String.format("%d/%d/%d",date.day, date.moth, date.yes);
		System.out.println("MyDate: "+myDate);
	
		
	}
}
