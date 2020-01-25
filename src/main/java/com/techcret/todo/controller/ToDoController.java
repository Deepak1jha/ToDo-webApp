package com.techcret.todo.controller;

import com.sun.tools.javac.comp.Todo;
import com.sun.xml.bind.v2.TODO;
import com.techcret.todo.commandObject.ToDoCO;
import com.techcret.todo.commandObject.UserNameCO;
import com.techcret.todo.model.ToDo;
import com.techcret.todo.model.UserNameEntity;
import com.techcret.todo.repository.ToDoRepository;
import com.techcret.todo.valueObject.ToDoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

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


        //UserNameEntity userNameEntity=new UserNameEntity();

        ToDo toDoInc=new ToDo(toDoCO);
        toDoRepository.save(toDoInc);


        return "redirect:/todo/list";
    }



    @GetMapping(value = "list")
    public String list1(Model model){
       Iterable<ToDo> toDoIterable =  toDoRepository.findAll();//ByIsCompletedEquals(Boolean.FALSE);
        List<ToDo> toDoList = (List<ToDo>) toDoRepository.findAll();
        System.out.println(toDoList);
        List<ToDoVO> toDoVOList = new ArrayList<>();



        for(ToDo todo: toDoList)
                {

            toDoVOList.add(new ToDoVO(todo));


        }


        model.addAttribute("toDoVOList",toDoVOList);
            //return "redirect:/todo/displayData";
        return "/todo/displayData";
    }




}
