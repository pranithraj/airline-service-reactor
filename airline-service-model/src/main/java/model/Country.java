package model;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Country {
    private final int countryID;
    private final String countryName;
}
