package com.pranith.airline.dataaccess;

import java.util.List;

import model.AirCraft;

public interface AirlineDataAccess {
    List<AirCraft> findAircraftDetailsByAircraftName(String name) throws Exception;

}
