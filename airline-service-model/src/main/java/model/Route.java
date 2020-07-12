package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Route {
    private final int routeID;
    private final String airport;
    private final String destination;
    private final String routeCode;
}
