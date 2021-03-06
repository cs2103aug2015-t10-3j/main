package doordonote.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//@@author A0131436N

public final class Util {

	private Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static String removeFirstWord(String input) {
		return input.replaceFirst(getFirstWord(input), "").trim();
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
			DateFormat dateFormatter = new SimpleDateFormat("d MMM ''yy H:mm");
			return dateFormatter.format(input);
		}
	}
	
	
	//@@author A0131716M	
	public static Task createTask(String description, Date startDate, Date endDate){
		Task task = null;

		if(description!=null && startDate==null && endDate==null){
			task = new FloatingTask(description);
		} else if(description!=null && startDate==null && endDate!=null){
			task = new DeadlineTask(description, endDate);
		} else if(description!=null && startDate!=null && endDate!=null){
			task = new EventTask(description, startDate, endDate);
		} else {
			assert (task != null):"Invalid Task parameters";
		}

		return task;
	}
}
