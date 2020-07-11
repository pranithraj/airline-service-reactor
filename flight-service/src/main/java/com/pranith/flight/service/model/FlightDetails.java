package com.pranith.flight.service.model;

import com.pranith.flight.service.type.Status;

import java.sql.Date;
import java.util.List;

public class FlightDetails {
    private final String flightId;
    private final String ticketFare;
    private final int availableSeats;
    private final List<Date> flyingDates;
    private final Status status;

    private FlightDetails(Builder builder) {
        flightId = builder.flightId;
        ticketFare = builder.ticketFare;
        availableSeats = builder.availableSeats;
        flyingDates = builder.flyingDates;
        status = builder.status;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getTicketFare() {
        return ticketFare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public List<Date> getFlyingDates() {
        return flyingDates;
    }

    public Status getStatus() {
        return status;
    }

    /**
     * {@code FlightDetails} builder static inner class.
     */
    public static final class Builder {
        private String flightId;
        private String ticketFare;
        private int availableSeats;
        private List<Date> flyingDates;
        private Status status;

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
         * Sets the {@code ticketFare} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param ticketFare the {@code ticketFare} to set
         * @return a reference to this Builder
         */
        public Builder ticketFare(String ticketFare) {
            this.ticketFare = ticketFare;
            return this;
        }

        /**
         * Sets the {@code availableSeats} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param availableSeats the {@code availableSeats} to set
         * @return a reference to this Builder
         */
        public Builder availableSeats(int availableSeats) {
            this.availableSeats = availableSeats;
            return this;
        }

        /**
         * Sets the {@code flyingDates} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flyingDates the {@code flyingDates} to set
         * @return a reference to this Builder
         */
        public Builder flyingDates(List<Date> flyingDates) {
            this.flyingDates = flyingDates;
            return this;
        }

        /**
         * Sets the {@code status} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param status the {@code status} to set
         * @return a reference to this Builder
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Returns a {@code FlightDetails} built from the parameters previously set.
         *
         * @return a {@code FlightDetails} built with parameters of this {@code FlightDetails.Builder}
         */
        public FlightDetails build() {
            return new FlightDetails(this);
        }
    }
}
