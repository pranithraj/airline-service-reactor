package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {
    private final int transactionID;
    private final long bookingDateTime;
    private final long departureDateTime;
    private final int passengerID;
    private final int flightScheduleID;
    private final Status status;
    private final int chargeID;
}
