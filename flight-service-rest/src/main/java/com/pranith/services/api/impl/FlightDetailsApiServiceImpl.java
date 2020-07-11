package com.pranith.services.api.impl;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pranith.flight.service.FindFlightDetailsByFlightNameManager;
import com.pranith.flight.service.criteria.FindFlightDetailsByFlightNameCriteria;
import com.pranith.flight.service.ml.guice.FlightServiceModule;
import com.pranith.flight.service.response.FindFlightDetailsByFlightNameResponse;
import com.pranith.services.api.FlightDetailsApiService;
import com.pranith.services.gen.json.GetFlightDetails;

public class FlightDetailsApiServiceImpl extends FlightDetailsApiService {
    @Override
    public Response getFlightDetailsByFlightName(String flightName) throws NotFoundException {
        //Build the criteria
        FindFlightDetailsByFlightNameCriteria findFlightDetailsByFlightNameCriteria = FindFlightDetailsByFlightNameCriteria
                .Builder.create().withFlightName(flightName).build();

        //Retrieve the response
        Injector injector = Guice.createInjector(new FlightServiceModule());
        FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse = injector.getInstance(FindFlightDetailsByFlightNameManager.class).
                findFlightDetailsByFlightNameResponse(findFlightDetailsByFlightNameCriteria);

        //Translate the ml response to REST response
        GetFlightDetails getFlightDetails =

        //Return REST response


        return null;
    }
}
