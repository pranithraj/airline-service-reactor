package com.pranith.flight.service.criteria;

public class FindFlightDetailsByFlightNameCriteria {

    public String getFlightName() {
        return flightName;
    }

    private final String flightName;

    private FindFlightDetailsByFlightNameCriteria(Builder builder) {
        flightName = builder.flightName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * {@code FindFlightDetailsByFlightNameCriteria} builder static inner class.
     */
    @SuppressWarnings("PMD.AvoidFieldNameMatchingMethodName")
    public static final class Builder {
        private String flightName;

        private Builder() {
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
         * Sets the {@code flightName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param flightName the {@code flightName} to set
         * @return a reference to this Builder
         */
        public Builder withFlightName(String flightName) {
            this.flightName = flightName;
            return this;
        }

        /**
         * Returns a {@code FindFlightDetailsByFlightNameCriteria} built from the parameters previously set.
         *
         * @return a {@code FindFlightDetailsByFlightNameCriteria} built with parameters of this {@code FindFlightDetailsByFlightNameCriteria.Builder}
         */
        public FindFlightDetailsByFlightNameCriteria build() {
            return new FindFlightDetailsByFlightNameCriteria(this);
        }
    }
}
