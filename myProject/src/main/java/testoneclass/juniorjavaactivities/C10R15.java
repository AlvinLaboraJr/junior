package testoneclass.juniorjavaactivities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C10R15 {

	public static void main(String[] args) throws ParseException {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("EEEEEEEE MMMMM dd, yyyy hh:mm:ss");
		String strDate = dateFormat.format(date);
		System.out.println("Current date and time: " + strDate);

	}

}
