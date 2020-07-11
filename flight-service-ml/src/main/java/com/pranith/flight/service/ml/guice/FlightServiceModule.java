package com.pranith.flight.service.ml.guice;

import com.google.inject.AbstractModule;
import com.google.inject.PrivateModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.pranith.flight.service.FindFlightDetailsByFlightNameManager;
import com.pranith.flight.service.ml.FindFlightDetailsByFlightNameManagerImpl;
import com.pranith.flight.service.ml.query.FindFlightDetailsByFlightNameRetrieverQuery;

public class FlightServiceModule extends AbstractModule {
    @Override protected void configure() {
//        install(new FactoryModuleBuilder().build(FindFlightDetailsByFlightNameRetrieverQuery.Factory.class));
        bind(FindFlightDetailsByFlightNameManager.class).to(FindFlightDetailsByFlightNameManagerImpl.class);
//        expose(FindFlightDetailsByFlightNameManager.class);
    }
}
