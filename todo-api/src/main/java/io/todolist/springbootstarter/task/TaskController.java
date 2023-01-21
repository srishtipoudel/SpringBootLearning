package io.todolist.springbootstarter.task;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@RequestMapping("/tasks")
	public List<Task> getAllTasks() {
		return Arrays.asList(
				new Task("work", "Spring Boot Starter App", "Complete by Monday"),
				new Task("course", "Load Flow Analysis of Gandaki Pradesh", "Complete by Wednesday"),
				new Task("household", "Make space to keep plants", "Complete by weekend")
				
				);
	}

}
