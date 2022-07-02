package com.sda.spriingdemojavaee14.controller.rest;

import com.sda.spriingdemojavaee14.entity.Reservation;
import com.sda.spriingdemojavaee14.entity.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ReservationRestController {

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        log.info("getting all reservations");
        return List.of(
                new Reservation(1L, 12L, LocalDateTime.now(), LocalDateTime.now().plusHours(2),
                        "Wołek", "51124", "m@op.pl", 10, ""),

                Reservation.builder()
                        .id(2L)
                        .tableNumber(12L)
                        .startBookingTime(LocalDateTime.now())
                        .endBookingTime(LocalDateTime.now().plusHours(2))
                        .surname("Pastuszka")
                        .phoneNumber("555 555 555")
                        .email("mariusz@sda.pl")
                        .numberOfPeople(5)
                        .address("Marszałkowska 5")
                        .build()
        );
    }
}