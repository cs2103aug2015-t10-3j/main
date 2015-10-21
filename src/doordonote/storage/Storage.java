package doordonote.storage;

import java.util.Date;

import doordonote.common.Task;

import java.util.ArrayList;
import java.io.IOException;

public interface Storage {
	public void setFile(String location);
	public String add(Task task);
	public String add(String description, Date startDate, Date endDate);
	public String update(Task taskToUpdate, String descirption,
			Date startDate, Date endDate);
	public String update(Task oldTask, Task newTask);
	public String delete(Task taskToDelete);
	public String remove(Task taskToRemove);
	public ArrayList<Task> readTasks() throws IOException;
	public ArrayList<Task> readDeletedTasks() throws IOException;
	public String clear();
	public String undo();
	public String redo();
}