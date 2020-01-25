package com.techcret.todo.repository;

import com.techcret.todo.model.ToDo;
import com.techcret.todo.model.UserNameEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserNameEntity,Integer> {
}
