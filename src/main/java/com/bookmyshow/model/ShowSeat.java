package com.bookmyshow.model;

import com.bookmyshow.model.constants.ShowSeatStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.STRING) // Create Table for the Enum
    private ShowSeatStatus showSeatStatus;
}
/* ShowSeat : Show
       1    :  1
       M    :  1
   ShowSeat : Show -> M : 1

ShowSeat : Seat
    1    :  1
    M    :  1
ShowSeat : Seat -> M : 1 */