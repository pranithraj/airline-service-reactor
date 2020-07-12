package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirFare {
    private final int airfareID;
    private final int routeID;
    private final long fare;
    private final int fuelSurcharge;
}
