package com.sda.spriingdemojavaee14.controller.rest;


import com.sda.spriingdemojavaee14.entity.Reservation;
import com.sda.spriingdemojavaee14.service.ReservationService;
import com.sda.spriingdemojavaee14.entity.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ReservationRestController {

    private com.sda.spriingdemojavaee14.service.ReservationService reservationService = null;

    public ReservationRestController(com.sda.spriingdemojavaee14.service.ReservationService) {
        this.reservationService = ReservationService;
    }


    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        log.info("getting all reservations");

        return reservationService.findAllReservations();
    }


    @GetMapping("/reservations/{id}")
// /reservations/1234
// /reservations/998
// @PathVariable("id") get id value from url and use for reservationId
// 200 if there is result and 404 if wrong url was used by client
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") Long reservationId) {
        log.info("trying to find reservation by id: [{}]", reservationId);

        //return reservationService.findReservationById(reservationId);
        var responseBody = ReservationService.findReservationById(reservationId);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(responseBody);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(responseBody);


        ResponseEntity<Reservation> result = ResponseEntity.notFound().build();
        if (responseBody != null) {
            result = ResponseEntity.ok(responseBody);
        }
        return ResponseEntity.ok(responseBody);
    }
}
