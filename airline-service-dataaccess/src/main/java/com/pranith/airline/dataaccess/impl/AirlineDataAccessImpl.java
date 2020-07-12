package com.pranith.airline.dataaccess.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pranith.airline.MySQLConnector;
import com.pranith.airline.dataaccess.AirlineDataAccess;

import model.AirCraft;

public class AirlineDataAccessImpl implements AirlineDataAccess {

    private final String GET_FLIGHT_DETAILS_BY_FLIGHT_NAME_QUERY = "SELECT * FROM AirCrafts WHERE AcName LIKE ?";

    private final Connection conn = MySQLConnector.getConnection();


    @Override
    public List<AirCraft> findAircraftDetailsByAircraftName(String name) throws Exception {
        final List<AirCraft> result = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(GET_FLIGHT_DETAILS_BY_FLIGHT_NAME_QUERY);
            pstmt.setString(1, "%"+ name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                AirCraft airCraft = AirCraft.builder().aircraftID(rs.getInt(1)).aircraftNumber(rs.getString(2)).capacity(rs.getInt(3))
                        .mfdBy(rs.getString(4)).mfdOn(rs.getLong(5)).aircraftName(rs.getString(6)).build();
                result.add(airCraft);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
