package com.pranith.flight.service.model;

public class Passenger {

    private final String passengerId;
    private final String firstName;
    private final String lastName;
    private final String contactNumber;
    private final String mailId;

    private Passenger(Builder builder) {
        passengerId = builder.passengerId;
        firstName = builder.firstName;
        lastName = builder.lastName;
        contactNumber = builder.contactNumber;
        mailId = builder.mailId;
    }

    /**
     * {@code Passenger} builder static inner class.
     */
    public static final class Builder {
        private String passengerId;
        private String firstName;
        private String lastName;
        private String contactNumber;
        private String mailId;

        public Builder() {
        }

        /**
         * Sets the {@code passengerId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param passengerId the {@code passengerId} to set
         * @return a reference to this Builder
         */
        public Builder passengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }

        /**
         * Sets the {@code firstName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param firstName the {@code firstName} to set
         * @return a reference to this Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the {@code lastName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param lastName the {@code lastName} to set
         * @return a reference to this Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the {@code contactNumber} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param contactNumber the {@code contactNumber} to set
         * @return a reference to this Builder
         */
        public Builder contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        /**
         * Sets the {@code mailId} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param mailId the {@code mailId} to set
         * @return a reference to this Builder
         */
        public Builder mailId(String mailId) {
            this.mailId = mailId;
            return this;
        }

        /**
         * Returns a {@code Passenger} built from the parameters previously set.
         *
         * @return a {@code Passenger} built with parameters of this {@code Passenger.Builder}
         */
        public Passenger build() {
            return new Passenger(this);
        }
    }
}
