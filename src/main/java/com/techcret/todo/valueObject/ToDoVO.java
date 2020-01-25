package com.techcret.todo.valueObject;

import com.sun.tools.javac.comp.Todo;
import com.techcret.todo.model.ToDo;

import java.time.LocalDateTime;

public class ToDoVO {


    private String title;
    private String description;
    private LocalDateTime localDateTime;
    private String inputUserName;


    public ToDoVO(){}

    public ToDoVO(ToDo toDo){

        this.title = toDo.getTitle();
        this.description=toDo.getDescription();
        this.localDateTime=toDo.getCreatedDateTime();
        this.inputUserName=toDo.getInputUserName();

    }

    public String getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(String inputUserName) {
        this.inputUserName = inputUserName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
