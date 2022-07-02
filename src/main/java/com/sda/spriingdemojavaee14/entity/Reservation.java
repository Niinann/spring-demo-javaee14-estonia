package com.sda.spriingdemojavaee14.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Reservation {
    Long id;

    //long
    Long tableNumber;

    LocalDateTime startbookingTime;

    LocalDateTime endBookingTime;

    String surname;

    String phonenumber;

    String email;

    int numberOfPeople;

    String address;

}
