package com.manash.tripadvisor.controller;

import com.manash.tripadvisor.dto.FlightReservationResponse;
import com.manash.tripadvisor.dto.TripPlan;
import com.manash.tripadvisor.dto.TripReservationRequest;
import com.manash.tripadvisor.service.TripPlanService;
import com.manash.tripadvisor.service.TripReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trip")
@RequiredArgsConstructor
public class TripController {

    private final TripPlanService planService;
    private final TripReservationService reservationService;

    @GetMapping("{airportCode}")
    public TripPlan planTrip(@PathVariable String airportCode){
        return this.planService.getTripPlan(airportCode);
    }

    @PostMapping("reserve")
    public FlightReservationResponse reserveFlight(@RequestBody TripReservationRequest request){
        return this.reservationService.reserve(request);
    }

}
