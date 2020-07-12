package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Charge {
    private final int chargeID;
    private final String title;
    private final int amount;
    private final String description;
}
