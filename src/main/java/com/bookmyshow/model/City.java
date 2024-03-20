package com.bookmyshow.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class City extends BaseModel{
    @Column(name = "CityName")
    private String name;
}
