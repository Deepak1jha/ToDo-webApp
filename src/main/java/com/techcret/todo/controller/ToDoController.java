package com.techcret.todo.controller;

import com.sun.xml.bind.v2.TODO;
import com.techcret.todo.commandObject.ToDoCO;
import com.techcret.todo.model.ToDo;
import com.techcret.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping(value = "todo")
public class ToDoController {

    private final ToDoRepository toDoRepository;

    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


   @GetMapping(value = "create")
    public String create()
   {
        return "/todo/list";
   }

    @PostMapping(value = "create")
    public String save(ToDoCO toDoCO){

        String description=toDoCO.getDescription();
        String title=toDoCO.getTitle();


        System.out.println("Title = "+title);
        System.out.println("Description = "+description);

        Date date=new Date();
        System.out.println("Current date is"+date);

        ToDo toDoInc=new ToDo(toDoCO);
        toDoRepository.save(toDoInc);



        return "/todo/list";
    }



    /*@GetMapping(value = "list")
    public String list1(){
        toDoRepository.findAllByIsCompletedEquals(Boolean.FALSE);
        return "redirect:/todo/list1";
    }*/


}
