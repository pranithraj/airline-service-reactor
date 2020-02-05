package com.pranith.flight.service.ml;

import java.sql.Connection;

import com.google.inject.Inject;
import com.pranith.flight.service.FindFlightDetailsByFlightNameManager;
import com.pranith.flight.service.criteria.FindFlightDetailsByFlightNameCriteria;
import com.pranith.flight.service.ml.query.FindFlightDetailsByFlightNameRetrieverQuery;
import com.pranith.flight.service.response.FindFlightDetailsByFlightNameResponse;

import javax.annotation.Nonnull;
import javax.transaction.TransactionManager;

public class FindFlightDetailsByFlightNameManagerImpl implements FindFlightDetailsByFlightNameManager {
    private final FindFlightDetailsByFlightNameRetrieverQuery.Factory findFlightDetailsByFlightNameRetrieverQueryFactory;


    @Inject FindFlightDetailsByFlightNameManagerImpl(final FindFlightDetailsByFlightNameRetrieverQuery.Factory findFlightDetailsByFlightNameRetrieverQueryFactory)
    {
        this.findFlightDetailsByFlightNameRetrieverQueryFactory = findFlightDetailsByFlightNameRetrieverQueryFactory;
    }

    @Nonnull
    private FindFlightDetailsByFlightNameRetrieverQuery createFlightDetailsQueryImpl(@Nonnull final Connection connection,
            @Nonnull final FindFlightDetailsByFlightNameCriteria criteria)
    {
        return findFlightDetailsByFlightNameRetrieverQueryFactory.create(connection, criteria.getFlightName());
    }


    @Override
    public FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse(FindFlightDetailsByFlightNameCriteria findFlightDetailsByFlightNameCriteria) {
        //Verifier.verifyNotNull(criteria, " criteria:null");
        final FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameQueryResponse = new Thread() {
            public void run() {
                /* block of code which need to execute via thread */
                FindFlightDetailsByFlightNameResponse findFlightDetailsByFlightNameResponse;
            }
            return createFlightDetailsQueryImpl(connection, criteria).execute();
        }.start();

        return FindFlightDetailsByFlightNameResponse.Builder.create().withFindFlightDetailsByFlightNameResponse(findFlightDetailsByFlightNameQueryResponse).build();
    }
}
