package io.todolist.springbootstarter.task;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, String>{

}
