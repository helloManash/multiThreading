package com.manash.tripadvisor.client;

import com.manash.tripadvisor.dto.FlightReservationRequest;
import com.manash.tripadvisor.dto.FlightReservationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestClient;

@RequiredArgsConstructor
public class FlightReservationServiceClient {

    private final RestClient client;

    public FlightReservationResponse reserve(FlightReservationRequest request) {
        return this.client.post()
                          .body(request)
                          .retrieve()
                          .body(FlightReservationResponse.class);
    }

}
