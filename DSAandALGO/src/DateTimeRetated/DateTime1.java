package DateTimeRetated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTime1 {

	public static void main(String[] args) {
		
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
		DateTimeFormatter formated=DateTimeFormatter.ofPattern("dd/MM/yyyy,HH:mm:ss");
		String demo=current.format(formated);
		System.out.println(demo);
		
		
		LocalDate demo1=LocalDate.now();
		System.out.println(demo1);
		
		
		LocalDate demo3=LocalDate.of(2022,Month.APRIL,17);
		System.out.println(demo3);
		
		LocalTime demo4=LocalTime.of(4,25,7);
		System.out.println(demo4);
		LocalTime lt=LocalTime.now();
		System.out.println(lt);

	}

}
