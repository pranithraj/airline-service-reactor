package com.pranith.flight.service.model;

import java.sql.Date;

public class Ticket {
    private final String ticketId;
    private final String profileId;
    private final String flightId;
    private final Date travelDateTime;

    private Ticket(Builder builder) {
        ticketId = builder.ticketId;
        profileId = builder.profileId;
        flightId = builder.flightId;
        travelDateTime = builder.travelDateTime;
    }

    /**
     * {@code Ticket} builder static inner class.
     */
    public static final class Builder {
        private String ticketId;
        private String profileId;
        private String flightId;
        private Date travelDateTime;

        public Builder() {
        }

        /**
         * Sets the {@code ticketId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param ticketId the {@code ticketId} to set
         * @return a reference to this Builder
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        /**
         * Sets the {@code profileId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param profileId the {@code profileId} to set
         * @return a reference to this Builder
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            return this;
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
         * Sets the {@code travelDateTime} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param travelDateTime the {@code travelDateTime} to set
         * @return a reference to this Builder
         */
        public Builder travelDateTime(Date travelDateTime) {
            this.travelDateTime = travelDateTime;
            return this;
        }

        /**
         * Returns a {@code Ticket} built from the parameters previously set.
         *
         * @return a {@code Ticket} built with parameters of this {@code Ticket.Builder}
         */
        public Ticket build() {
            return new Ticket(this);
        }
    }
}
