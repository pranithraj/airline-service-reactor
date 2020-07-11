package com.pranith.services.gen.json;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "flightId",
        "airlineId",
        "fromLocation",
        "toLocation",
        "departureTime",
        "arrivalTime",
        "ticketFare",
        "availableSeats",
        "flyingDates",
        "status"
})
public class GetFlightDetails {

    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("airlineId")
    private Integer airlineId;
    @JsonProperty("fromLocation")
    private String fromLocation;
    @JsonProperty("toLocation")
    private String toLocation;
    @JsonProperty("departureTime")
    private Object departureTime;
    @JsonProperty("arrivalTime")
    private Object arrivalTime;
    @JsonProperty("ticketFare")
    private String ticketFare;
    @JsonProperty("availableSeats")
    private Integer availableSeats;
    @JsonProperty("flyingDates")
    private List<Date> flyingDates;
    @JsonProperty("status")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @JsonProperty("airlineId")
    public Integer getAirlineId() {
        return airlineId;
    }

    @JsonProperty("airlineId")
    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    @JsonProperty("fromLocation")
    public String getFromLocation() {
        return fromLocation;
    }

    @JsonProperty("fromLocation")
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    @JsonProperty("toLocation")
    public String getToLocation() {
        return toLocation;
    }

    @JsonProperty("toLocation")
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    @JsonProperty("departureTime")
    public Object getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(Object departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalTime")
    public Object getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(Object arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("ticketFare")
    public String getTicketFare() {
        return ticketFare;
    }

    @JsonProperty("ticketFare")
    public void setTicketFare(String ticketFare) {
        this.ticketFare = ticketFare;
    }

    @JsonProperty("availableSeats")
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    @JsonProperty("availableSeats")
    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @JsonProperty("flyingDates")
    public List<Date> getFlyingDates() {
        return flyingDates;
    }

    @JsonProperty("flyingDates")
    public void setFlyingDates(List<Date> flyingDates) {
        this.flyingDates = flyingDates;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightId", flightId).append("airlineId", airlineId).append("fromLocation", fromLocation).append("toLocation", toLocation).append("departureTime", departureTime).append("arrivalTime", arrivalTime).append("ticketFare", ticketFare).append("availableSeats", availableSeats).append("flyingDates", flyingDates).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(departureTime).append(arrivalTime).append(availableSeats).append(flightId).append(fromLocation).append(additionalProperties).append(toLocation).append(flyingDates).append(airlineId).append(ticketFare).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetFlightDetails) == false) {
            return false;
        }
        GetFlightDetails rhs = ((GetFlightDetails) other);
        return new EqualsBuilder().append(departureTime, rhs.departureTime).append(arrivalTime, rhs.arrivalTime).append(availableSeats, rhs.availableSeats).append(flightId, rhs.flightId).append(fromLocation, rhs.fromLocation).append(additionalProperties, rhs.additionalProperties).append(toLocation, rhs.toLocation).append(flyingDates, rhs.flyingDates).append(airlineId, rhs.airlineId).append(ticketFare, rhs.ticketFare).append(status, rhs.status).isEquals();
    }

    public enum Status {

        DEPARTED("0"),
        REACHED("1"),
        ARRIVED("2");
        private final String value;
        private final static Map<String, GetFlightDetails.Status> CONSTANTS = new HashMap<String, GetFlightDetails.Status>();

        static {
            for (GetFlightDetails.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static GetFlightDetails.Status fromValue(String value) {
            GetFlightDetails.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
