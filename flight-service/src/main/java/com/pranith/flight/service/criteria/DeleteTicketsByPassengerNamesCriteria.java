package com.pranith.flight.service.criteria;

import java.util.Set;

public class DeleteTicketsByPassengerNamesCriteria {
    private final Set<String> passengerSet;

    private DeleteTicketsByPassengerNamesCriteria(Builder builder) {
        passengerSet = builder.passengerSet;
    }

    /**
     * {@code DeleteTicketsByPassengerNamesCriteria} builder static inner class.
     */
    public static final class Builder {
        private Set<String> passengerSet;

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
         * Sets the {@code passengerSet} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param passengerSet the {@code passengerSet} to set
         * @return a reference to this Builder
         */
        public Builder passengerSet(Set<String> passengerSet) {
            this.passengerSet = passengerSet;
            return this;
        }

        /**
         * Returns a {@code DeleteTicketsByPassengerNamesCriteria} built from the parameters previously set.
         *
         * @return a {@code DeleteTicketsByPassengerNamesCriteria} built with parameters of this {@code DeleteTicketsByPassengerNamesCriteria.Builder}
         */
        public DeleteTicketsByPassengerNamesCriteria build() {
            return new DeleteTicketsByPassengerNamesCriteria(this);
        }
    }
}
