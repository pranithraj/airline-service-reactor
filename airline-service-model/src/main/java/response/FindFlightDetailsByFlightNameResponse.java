package response;

import lombok.Builder;
import lombok.Data;
import model.AirCraft;
import model.AirFare;

@Data
@Builder
public class FindFlightDetailsByFlightNameResponse {
    private final AirCraft airCraft;
//    private final AirFare airFare;
}
