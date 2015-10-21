package doordonote.command;

import java.util.Date;

import doordonote.logic.CommandToController;

public class AddCommand implements Command {
	protected String taskDescription = null;
	protected Date startDate = null;
	protected Date endDate = null;
	protected CommandToController controller = null;
	protected boolean hasExecuted = false;
	
	/**
	 * @param 	taskDescription 
	 * 			the description of the task to be added
	 * @param 	startDate
	 * 			The start date of the event. A null value indicates this task is not an event
	 * @param 	endDate
	 * 			The end date of the event. A null value indicates this task is not a deadline
	 */
	public AddCommand(String taskDescription, Date startDate, Date endDate) {
		// AddHandler should have checked that task is not null and not empty
		assert(taskDescription != null && !taskDescription.isEmpty());
		
		this.taskDescription = taskDescription;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	@Override
	public String execute(CommandToController controller) {
		assert(controller != null);
		this.controller = controller;
		return controller.add(taskDescription, startDate, endDate);
	}
}
