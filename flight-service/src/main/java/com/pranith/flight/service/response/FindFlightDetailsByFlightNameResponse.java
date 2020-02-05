package com.pranith.flight.service.response;

import com.pranith.flight.service.model.Flight;
import com.pranith.flight.service.model.FlightDetails;

public class FindFlightDetailsByFlightNameResponse {
    private final Flight flight;
    private final FlightDetails flightDetails;

    private FindFlightDetailsByFlightNameResponse(Builder builder) {
        flight = builder.flight;
        flightDetails = builder.flightDetails;
    }

    /**
     * {@code FindFlightDetailsByFlightNameResponse} builder static inner class.
     */
    public static final class Builder {
        private Flight flight;
        private FlightDetails flightDetails;

        public Builder() {
        }

        /**
         * Creates a new Builder.
         *
         * @return Non-null Builder.
         */
        public static Builder create() {
            return new Builder();
        }

        /**
         * Sets the {@code flight} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flight the {@code flight} to set
         * @return a reference to this Builder
         */
        public Builder flight(Flight flight) {
            this.flight = flight;
            return this;
        }

        /**
         * Sets the {@code flightDetails} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flightDetails the {@code flightDetails} to set
         * @return a reference to this Builder
         */
        public Builder flightDetails(FlightDetails flightDetails) {
            this.flightDetails = flightDetails;
            return this;
        }

        /**
         * Sets the {@code flightDetails} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flightDetails the {@code flightDetails} to set
         * @return a reference to this Builder
         */
        public Builder withFindFlightDetailsByFlightNameResponse (
                @SuppressWarnings("hiding") final FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse) {
            this.flight = flight;
            this.flightDetails = flightDetails;
            return this;
        }

        /**
         * Returns a {@code FindFlightDetailsByFlightNameResponse} built from the parameters previously set.
         *
         * @return a {@code FindFlightDetailsByFlightNameResponse} built with parameters of this {@code FindFlightDetailsByFlightNameResponse.Builder}
         */
        public FindFlightDetailsByFlightNameResponse build() {
            return new FindFlightDetailsByFlightNameResponse(this);
        }
    }
}
