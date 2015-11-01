package doordonote.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Util {

	private Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static String removeFirstWord(String input) {
		return input.replace(getFirstWord(input), "").trim();
	}

	public static String getFirstWord(String input) {
		String commandTypeString = input.trim().split("\\s+")[0];
		return commandTypeString;
	}
	
	public static boolean isEmptyOrNull(String input) {
		return (input == null || input.trim().isEmpty());
	}
	
	
	public static boolean isBlankString(String input) {
		return input.trim().isEmpty();
	}
	
	public static String getDateString(Date input) {
		if (input == null) {
			return null;
		} else {
			DateFormat dateFormatter = new SimpleDateFormat();
			return dateFormatter.format(input);
		}
	}
	
}
