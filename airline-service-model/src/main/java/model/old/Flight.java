package model.old;

import java.sql.Date;

public class Flight {
    private final String flightId;
    private final String airlineId;
    private final String fromLocation;
    private final String toLocation;
    private final Date departureTime;
    private final Date arrivalTime;
    private final FlightDetails flightDetails;

    private Flight(Builder builder) {
        flightId = builder.flightId;
        airlineId = builder.airlineId;
        fromLocation = builder.fromLocation;
        toLocation = builder.toLocation;
        departureTime = builder.departureTime;
        arrivalTime = builder.arrivalTime;
        flightDetails = builder.flightDetails;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    /**
     * {@code Flight} builder static inner class.
     */
    public static final class Builder {
        private String flightId;
        private String airlineId;
        private String fromLocation;
        private String toLocation;
        private Date departureTime;
        private Date arrivalTime;
        private FlightDetails flightDetails;

        public Builder() {
        }

        /**
         * Sets the {@code flightId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flightId the {@code flightId} to set
         * @return a reference to this Builder
         */
        public Builder flightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        /**
         * Sets the {@code airlineId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param airlineId the {@code airlineId} to set
         * @return a reference to this Builder
         */
        public Builder airlineId(String airlineId) {
            this.airlineId = airlineId;
            return this;
        }

        /**
         * Sets the {@code fromLocation} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param fromLocation the {@code fromLocation} to set
         * @return a reference to this Builder
         */
        public Builder fromLocation(String fromLocation) {
            this.fromLocation = fromLocation;
            return this;
        }

        /**
         * Sets the {@code toLocation} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param toLocation the {@code toLocation} to set
         * @return a reference to this Builder
         */
        public Builder toLocation(String toLocation) {
            this.toLocation = toLocation;
            return this;
        }

        /**
         * Sets the {@code departureTime} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param departureTime the {@code departureTime} to set
         * @return a reference to this Builder
         */
        public Builder departureTime(Date departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        /**
         * Sets the {@code arrivalTime} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param arrivalTime the {@code arrivalTime} to set
         * @return a reference to this Builder
         */
        public Builder arrivalTime(Date arrivalTime) {
            this.arrivalTime = arrivalTime;
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
         * Returns a {@code Flight} built from the parameters previously set.
         *
         * @return a {@code Flight} built with parameters of this {@code Flight.Builder}
         */
        public Flight build() {
            return new Flight(this);
        }
    }
}
