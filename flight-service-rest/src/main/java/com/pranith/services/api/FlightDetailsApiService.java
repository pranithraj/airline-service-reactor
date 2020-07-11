package com.pranith.services.api;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

public abstract class FlightDetailsApiService {
    public abstract Response getFlightDetailsByFlightName(String flightName) throws NotFoundException;
}
