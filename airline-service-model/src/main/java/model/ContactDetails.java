package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDetails {
    private final int contactDetailsID;
    private final String email;
    private final String cell;
    private final String street;
    private final int stateID;
}
