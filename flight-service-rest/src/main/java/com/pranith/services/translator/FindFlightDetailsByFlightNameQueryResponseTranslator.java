package com.pranith.services.translator;

import java.util.List;

import javax.annotation.Nonnull;

import com.pranith.flight.service.model.Flight;
import com.pranith.flight.service.model.FlightDetails;
import com.pranith.flight.service.response.FindFlightDetailsByFlightNameResponse;
import com.pranith.services.gen.json.GetFlightDetails;

public class FindFlightDetailsByFlightNameQueryResponseTranslator {
    @Nonnull public static GetFlightDetails translateFlightDetails(final FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse) {

        FlightDetails flightDetails = findFlightDetailsByFlightNameResponse.getFlightDetails();
        Flight flight = findFlightDetailsByFlightNameResponse.getFlight();

        GetFlightDetails translatedFlightDetails = createFlightDetails(flight, flightDetails);

        return translatedFlightDetails;
    }

    private static GetFlightDetails createFlightDetails(Flight flight, FlightDetails flightDetails) {
        final GetFlightDetails translatedSummary = new GetFlightDetails();

        translatedSummary.setFlightId(flightDetails.getFlightId());
        translatedSummary.setAirlineId(Integer.parseInt(flight.getAirlineId()));
        translatedSummary.setFromLocation(flight.getFromLocation());
        translatedSummary.setToLocation(flight.getToLocation());
        translatedSummary.setDepartureTime(flight.getDepartureTime());
        translatedSummary.setArrivalTime(flight.getArrivalTime());
        translatedSummary.setTicketFare(flightDetails.getTicketFare());
        translatedSummary.setAvailableSeats(flightDetails.getAvailableSeats());
        translatedSummary.setFlyingDates(flightDetails.getFlyingDates());
        translatedSummary.setStatus(flightDetails.getStatus());

        return translatedSummary;
    }
}
