package imports;

import java.util.Date;
public class Imports {
	 public static void main(String[] args) {
		 Date date = new Date();
		 var hour = date.getHours();
		 var min = date.getMinutes();
		 var sec = date.getSeconds();
		 
		 
		 System.out.println(date);
		 System.out.println(hour+":"+min+":"+sec);
		 
	}
}
