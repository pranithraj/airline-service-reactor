package com.pranith.services.factories;

import com.pranith.services.api.FlightDetailsApiService;
import com.pranith.services.api.impl.FlightDetailsApiServiceImpl;

public class FlightDetailsApiServiceFactory {
    private final static FlightDetailsApiService service = new FlightDetailsApiServiceImpl();

    public static FlightDetailsApiService getFlightDetailsApi() {
        return service;
    }
}
