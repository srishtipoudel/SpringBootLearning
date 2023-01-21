package io.todolist.springbootstarter.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	List<Task> tasks=new ArrayList<>( Arrays.asList(
			new Task("work", "Spring Boot Starter App", "Complete by Monday"),
			new Task("course", "Load Flow Analysis of Gandaki Pradesh", "Complete by Wednesday"),
			new Task("household", "Make space to keep plants", "Complete by weekend")
			));
	
	

	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		List<Task> tasks=new ArrayList<>();
		taskRepository.findAll()
		.forEach(tasks::add);
		return tasks;
	}
	
	public Task getTask(String id) {
		return tasks.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTask(Task task) {
		taskRepository.save(task);
		
	}

	public void updateTask(String id, Task task) {
		for(int i=0; i<tasks.size(); i++) {
			Task t = tasks.get(i);
			if(t.getId().equals(id)) {
				tasks.set(i, task);
				return;
			}
		}
		
	}

	public void deleteTask(String id) {
		
		tasks.removeIf(t->t.getId().equals(id));
	}

	

	

	

}
