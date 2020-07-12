package criteria;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindFlightDetailsByFlightNameCriteria {
    private final String aircraftName;
}
