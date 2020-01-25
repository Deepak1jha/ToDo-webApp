package com.techcret.todo.controller;

import com.techcret.todo.commandObject.UserNameCO;
import com.techcret.todo.model.ToDo;
import com.techcret.todo.model.UserNameEntity;
import com.techcret.todo.repository.ToDoRepository;
import com.techcret.todo.repository.UserRepository;
import com.techcret.todo.valueObject.ToDoVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "userControl")

public class UserNameController {




    private final UserRepository userRepository;

    public UserNameController(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @GetMapping(value = "create")
    public String create()
     {
        return "/todo/index";
    }

    @PostMapping(value = "create")
    public String save(UserNameCO userNameCO)
    {


        UserNameEntity userNameEntityIns=new UserNameEntity(userNameCO);
        userRepository.save(userNameEntityIns);






        return "/todo/displayData";

    }



    @GetMapping(value = "list")
    public String list1(Model model)
    {
        /*Iterable<ToDo> toDoIterable =  userRepository.findAll();//ByIsCompletedEquals(Boolean.FALSE);
        List<ToDo> toDoList = (List<UserNameCO>) userRepository.findAll();
        System.out.println(toDoList);
        List<ToDoVO> toDoVOList = new ArrayList<>();



        for(ToDo todo: toDoList)
        {

            toDoVOList.add(new ToDoVO(todo));


        }


        model.addAttribute("toDoVOList",toDoVOList);
        //return "redirect:/todo/displayData";*/
        return "/todo/list";
    }

















}

