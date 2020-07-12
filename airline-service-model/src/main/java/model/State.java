package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class State {
    private final int stateID;
    private final String stateName;
    private final int countryID;
}
