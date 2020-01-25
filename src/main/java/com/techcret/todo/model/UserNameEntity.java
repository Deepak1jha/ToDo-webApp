package com.techcret.todo.model;

import com.sun.tools.javac.comp.Todo;
import com.techcret.todo.commandObject.UserNameCO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class UserNameEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)//ASK
    private Integer id;





    @OneToMany(mappedBy = "userNameEntity")
    private List<ToDo> todoList;



    private String userNameDetail;

    public UserNameEntity()
    {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserNameEntity(UserNameCO userNameCO) {


        this.userNameDetail=userNameCO.getUserNameInfo();
    }



    public String getUserNameDetail() {
        return userNameDetail;
    }

    public void setUserNameDetail(String userNameDetail) {
        this.userNameDetail = userNameDetail;
    }
}
