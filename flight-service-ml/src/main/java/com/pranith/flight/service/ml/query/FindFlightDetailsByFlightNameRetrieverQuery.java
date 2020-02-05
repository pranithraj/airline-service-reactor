package com.pranith.flight.service.ml.query;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;


import java.sql.Connection;

import javax.annotation.Nonnull;

public class FindFlightDetailsByFlightNameRetrieverQuery {

    private final Connection connection;
    private final String flightName;


    @AssistedInject
    FindFlightDetailsByFlightNameRetrieverQuery(@Assisted final Connection connection, @Assisted final String flightName) {
        if (connection == null) {
            throw new NullPointerException("SQL Connection is null");
        }
        this.connection = connection;
        this.flightName = flightName;
    }

    /**
     * Factory for creating an {@link FindFlightDetailsByFlightNameRetrieverQuery}.
     */
    public interface Factory
    {
        /**
         * Creates an instance of {@link FindFlightDetailsByFlightNameRetrieverQuery}.
         *
         * @param connection   {@link Connection} SQL Connection. This cannot be null.
         * @param flightName     flight name used to retrieve the corresponding flight details. This cannot be null.
         * @return A non-null {@link FindFlightDetailsByFlightNameRetrieverQuery}.
         */
        @Nonnull
        FindFlightDetailsByFlightNameRetrieverQuery create(Connection connection, String flightName);
    }

}
