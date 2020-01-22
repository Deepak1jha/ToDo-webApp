package com.techcret.todo.model;

import com.techcret.todo.commandObject.ToDoCO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)   //ASK
    private Integer id;

    //private LocalDate dateCreated;
    private LocalDateTime createdDateTime;
    private Boolean isCompleted = Boolean.FALSE;

    private String title;

    private String description;



   public ToDo(){}



    public ToDo(ToDoCO toDoCO){
       this.title = toDoCO.getTitle();
       this.description = toDoCO.getDescription();
       //this.dateCreated=LocalDate.now();
       this.createdDateTime=LocalDateTime.now();


   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
