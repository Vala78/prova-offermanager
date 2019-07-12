package it.worldpay.vale.offermanagertest.utils;

import java.util.Date;

public interface DateUtils {
	
	public Date parseStringToDate(String stringDate);
	
	public Date manageParsingDataException(String dataString);
	
	public Date addDates(Date startingDate, int validityPeriod);
	
}
