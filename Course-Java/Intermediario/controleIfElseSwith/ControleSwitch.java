package controleIfElseSwith;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class ControleSwitch {
	
	public static void main(String[] args) {
		
		// hora
		LocalTime time = LocalTime.now();
		DateTimeFormatter patternTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String timeFormatted = time.format(patternTime);
		System.out.println(timeFormatted);
		
		
		// data
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter patternDate = DateTimeFormatter.ofPattern("E, dd MMM yyyy");
		String dateNow = date.format(patternDate);
		System.out.println(dateNow);
		


	}

}
