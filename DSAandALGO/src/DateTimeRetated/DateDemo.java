package DateTimeRetated;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date obj=new Date();
		SimpleDateFormat demo=new SimpleDateFormat("dd:MM:yyyy");
		
		System.out.println(demo.format(obj));
		
		
		Date ld=new Date();
		System.out.println(ld);

	}

}
