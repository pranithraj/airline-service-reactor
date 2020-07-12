package com.pranith.airline.service;

import java.util.List;

import com.google.inject.Inject;
import com.pranith.airline.dataaccess.AirlineDataAccess;

import model.AirCraft;

public class AirlineService {
    @Inject
    AirlineDataAccess dataAccess;

    @Inject
    public void setDataAccess(AirlineDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public List<AirCraft> findAircraftDetailsByAircraftName(String name) throws Exception {
        return dataAccess.findAircraftDetailsByAircraftName(name);
    }

}
