package criteria;

import java.util.Set;

public class BookTicketsByPassengerNamesCriteria {

    private final Set<String> passengerSet;

    private BookTicketsByPassengerNamesCriteria(Builder builder) {
        passengerSet = builder.passengerSet;
    }

    /**
     * {@code BookTicketsByPassengerNamesCriteria} builder static inner class.
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
         * Returns a {@code BookTicketsByPassengerNamesCriteria} built from the parameters previously set.
         *
         * @return a {@code BookTicketsByPassengerNamesCriteria} built with parameters of this {@code BookTicketsByPassengerNamesCriteria.Builder}
         */
        public BookTicketsByPassengerNamesCriteria build() {
            return new BookTicketsByPassengerNamesCriteria(this);
        }
    }
}
