package PlacementPrograms;

import java.util.*;
import java.time.*;
import java.text.*;

public class PrintingDate {

	public static void main(String[] args) {
		System.out.println("Using Date Class");
		Date ssDate=new Date();
		System.out.println(ssDate);
		System.out.println("Using SimpleDateFormat");
		String string=new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new Date());
		System.out.println(string);
		String dateString=new SimpleDateFormat("hh:mm:ss dd-MM-YYYY").format(new Date());
		System.out.println(dateString);
		System.out.println("Using Calender Class");
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println("Using LocalDateTime");
		LocalDateTime aaDateTime=LocalDateTime.now();
		System.out.println(aaDateTime);
	}
}

