package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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
        task.setDescription("this need to be done by sunday");
        task.setC("internship");
        task.setStatus(true);


        //save task
        Product savedObject= taskRepository.save(task);

        //display task info
        System.out.println(savedObject);
        System.out.println(savedObject.toString());

    }

}