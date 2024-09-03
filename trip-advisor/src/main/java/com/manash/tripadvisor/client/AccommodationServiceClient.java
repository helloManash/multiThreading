package com.manash.tripadvisor.client;

import com.manash.tripadvisor.dto.Accommodation;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;

import java.util.List;

@RequiredArgsConstructor
public class AccommodationServiceClient {

    private final RestClient client;

    public List<Accommodation> getAccommodations(String airportCode) {
        return this.client.get()
                          .uri("{airportCode}", airportCode)
                          .retrieve()
                          .body(new ParameterizedTypeReference<List<Accommodation>>() {
                          });
    }

}
