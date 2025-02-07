package com.bookmyshow.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity // The Class becomes a table in the Database
public class Actor extends BaseModel{ // If you don't give any name then the class name is taken as the table name
    private String name;
}
