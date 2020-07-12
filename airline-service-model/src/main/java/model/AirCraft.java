package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirCraft {
    private final int aircraftID;
    private final String aircraftName;
    private final String aircraftNumber;
    private final int capacity;
    private final String mfdBy;
    private final long mfdOn;
}