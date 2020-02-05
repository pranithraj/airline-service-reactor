package com.pranith.services.api.impl;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;

import com.pranith.flight.service.FindFlightDetailsByFlightNameManager;
import com.pranith.flight.service.criteria.FindFlightDetailsByFlightNameCriteria;
import com.pranith.flight.service.response.FindFlightDetailsByFlightNameResponse;
import com.pranith.services.api.FlightDetailsApiService;

public class FlightDetailsApiServiceImpl implements FlightDetailsApiService {
    @Override
    public Response getFlightDetailsByFlightName(String flightName) throws NotFoundException {
        //Build the criteria
        FindFlightDetailsByFlightNameCriteria findFlightDetailsByFlightNameCriteria = FindFlightDetailsByFlightNameCriteria
                .Builder.create().withFlightName(flightName).build();

        //Retrieve the response
        FindFlightDetailsByFlightNameManager findFlightDetailsByFlightNameManager = null;
        FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse = findFlightDetailsByFlightNameManager
                .findFlightDetailsByFlightNameResponse(findFlightDetailsByFlightNameCriteria);

        //Translate the ml response to REST response

        //Return REST response


        return null;
    }
}
