package com.techcret.todo.repository;

import com.techcret.todo.model.ToDo;
import com.techcret.todo.model.UserNameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;





public interface ToDoRepository extends CrudRepository<ToDo,Integer> {

    //Iterable<ToDo> findAllByIsCompletedEquals(Boolean isCompleted);

    //List<ToDo> findAllByIdBetween(Integer id, Integer id2);

    List<ToDo> findAllByUserNameEntity(UserNameEntity userNameEntity);


}
