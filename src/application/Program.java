package application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date(511);
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.MILLISECOND);
		
		System.out.println(week);
		

		
	}

}
