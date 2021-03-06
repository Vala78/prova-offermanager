package it.worldpay.vale.offermanagertest.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtilsImpl implements DateUtils{
	
	SimpleDateFormat simpleDataFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	Calendar calendar;

	public Date parseStringToDate(String stringDate) {
		
		return manageParsingDataException(stringDate);
	}

	
	public Date manageParsingDataException(String dataString) {
		Date date = null;
		
		try {
			date = simpleDataFormat.parse(dataString);
		} catch (ParseException pe) {
			System.out.println("parsing error,please check the format of the string to be parsed ");
		}
		
		return date;
	}

	public Date addDates(Date startingDate, int validityPeriod) {
		
		setCalendar(startingDate,validityPeriod);
		
		return calendar.getTime();
	}
	
	private Calendar setCalendar(Date date,int validityPeriod){
		
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, validityPeriod);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
		
	}

}
