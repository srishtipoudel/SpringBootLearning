package io.todolist.springbootstarter.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/tasks")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
				
	}
	
	
	@RequestMapping("/tasks/{id}")
	public Task getTask(@PathVariable String id) {
		return taskService.getTask(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/tasks")
	public void addTask(@RequestBody Task task) {
		taskService.addTask(task);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tasks/{id}")
	public void updateTask(@RequestBody Task task, @PathVariable String id) {
		taskService.updateTask(id, task);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tasks/{id}")
	public void deleteTask(@PathVariable String id) {
		taskService.deleteTask(id);
	}


}
