package com.bookmyshow.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity(name = "User_Table")
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}
