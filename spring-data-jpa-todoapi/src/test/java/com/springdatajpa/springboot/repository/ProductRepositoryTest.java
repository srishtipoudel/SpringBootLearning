package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Srishti
 * @created 2/3/2023: 9:18 PM
 */

@SpringBootTest

class ProductRepositoryTest {

    @Autowired
    private ProductRepository taskRepository;

    @Test
    void saveMethod(){

        //create task
        Product task = new Product();
        task.setName("Task 1");
        task.setDescription("this need to be done by monday");
        task.setC("project");
        task.setStatus(true);


        //save task
        Product savedObject= taskRepository.save(task);

        //display task info
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());

    }

    @Test
    void updateUsingSaveMethod(){
        //find or retrieve an entity by id
        Long id=12L;
        Product task=taskRepository.findById(id).get();

        //update entity information
        task.setName("Updated task 1");
        task.setDescription("updated description");

        //save updated entity
        taskRepository.save(task);
    }
    @Test
    void findByIdMethod(){
        Long id=11L;

        Product task=taskRepository.findById(id).get();

    }

    @Test
    void deleteByIdMethod(){
        Long id=11L;
        taskRepository.deleteById(id);

    }

    @Test
    void deleteMethod(){
        Long id=12L;
        Product task=taskRepository.findById(id).get();


        taskRepository.delete(task);
    }


}