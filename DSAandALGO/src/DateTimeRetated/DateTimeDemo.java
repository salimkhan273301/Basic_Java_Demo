package DateTimeRetated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeDemo obj=new DateTimeDemo();
		obj.function();

	}

	private void function() {
		LocalDateTime current= LocalDateTime.now();
		System.out.println(current);
		
		  LocalDate date1 = current.toLocalDate();
	        System.out.println("Date : " + date1);
	        
	        Month month = current.getMonth();
	        int day = current.getDayOfMonth();
	        int seconds = current.getSecond();

	        System.out.println("Month : " + month);
	        System.out.println("Day : " + day);
	        System.out.println("Seconds : " + seconds);
	        
	        LocalDateTime date2 = current.withDayOfMonth(17).withYear(2018);
	        System.out.println("Date : " + date2);
	        

	        //Prints 17 May 2018
	        LocalDate date3 = LocalDate.of(2018, Month.MAY, 17);
	        System.out.println("Date : " + date3);

	        //Prints 04 hour 45 minutes
	        LocalTime date4 = LocalTime.of(4, 45);
	        System.out.println("Date : " + date4);

	        // Convert to a String 
	        LocalTime date5 = LocalTime.parse("20:15:30");
	        System.out.println("Date : " + date5);
	        
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	        String demo = current.format(format);  
	        System.out.println("After Formatting: " + demo);  

	}

}
