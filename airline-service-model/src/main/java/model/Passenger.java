package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Passenger {
    private final int passengerID;
    private final String name;
    private final String address;
    private final int age;
    private final String nationality;
    private final int contactDetailsID;
}
