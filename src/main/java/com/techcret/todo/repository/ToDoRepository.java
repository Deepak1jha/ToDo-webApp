package com.techcret.todo.repository;

import com.techcret.todo.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository why we cant use this in this class ?


public interface ToDoRepository extends CrudRepository<ToDo,Integer> {

    //List<ToDo> findAllByIsCompletedEquals(Boolean isCompleted);


}
