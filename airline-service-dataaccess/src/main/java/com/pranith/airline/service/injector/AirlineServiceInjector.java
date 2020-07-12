package com.pranith.airline.service.injector;

import com.google.inject.AbstractModule;
import com.pranith.airline.dataaccess.AirlineDataAccess;
import com.pranith.airline.dataaccess.impl.AirlineDataAccessImpl;

public class AirlineServiceInjector extends AbstractModule {
    @Override
    public void configure() {
        bind(AirlineDataAccess.class).to(AirlineDataAccessImpl.class);
    }
}
