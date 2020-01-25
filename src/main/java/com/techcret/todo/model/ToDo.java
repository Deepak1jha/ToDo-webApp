package com.techcret.todo.model;

import com.techcret.todo.commandObject.ToDoCO;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


//@Table(name = "book_category")
@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;





    @ManyToOne
    @JoinColumn(name = "user_name_entity_id")
    private UserNameEntity userNameEntity;


    //private LocalDate dateCreated;
    private LocalDateTime createdDateTime;
   // private Boolean isCompleted = Boolean.FALSE;

    private String title;
   // private Integer userID;

    private String description;
    private String inputUserName;



    public ToDo(){}



   public ToDo(ToDoCO toDoCO){
       this.title = toDoCO.getTitle();
       this.description = toDoCO.getDescription();
       //this.dateCreated=LocalDate.now();
       this.createdDateTime=LocalDateTime.now();
       this.inputUserName=toDoCO.getInputUserName();


   }





    public String getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(String inputUserName) {
        this.inputUserName = inputUserName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
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


    /*public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }*/
}
