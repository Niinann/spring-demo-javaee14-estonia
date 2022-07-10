package com.sda.spriingdemojavaee14.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor // Hibernate needs this to do his job
@AllArgsConstructor
@Entity //for mapping class to database table(for creating connection with database)(by default @Entity uses class name as table name
@Table(name = "RESERVATIONS")  // for overriding default table name
public class Reservation {
    @Id //primary key
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long tableNumber;

    LocalDateTime startBookingTime;

    LocalDateTime endBookingTime;

    String surname;

    String phoneNumber;

    String email;

    int numberOfPeople;

    String address;
}