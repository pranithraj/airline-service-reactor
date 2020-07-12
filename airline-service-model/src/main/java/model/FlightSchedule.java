package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightSchedule {
    private final int flightScheduleID;
    private final long departureDateTime;
    private final long arrivalDateTime;
    private final int aircraftID;
    private final int airfareID;
}
