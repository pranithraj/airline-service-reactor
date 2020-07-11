package com.pranith.services.api;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

public interface FlightDetailsApiService {
    public abstract Response getFlightDetailsByFlightName(String flightName) throws NotFoundException;
}
