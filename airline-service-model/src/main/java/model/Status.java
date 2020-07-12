package model;

import java.util.HashMap;
import java.util.Map;

public enum Status {
    UNKNOWN(0),
    RESERVATION(1),
    CANCELLATION(2);

    private static Map<Integer, Status> STATUS_MAP;

    static {
        STATUS_MAP = new HashMap<>();
        for (final Status status : values()) {
            STATUS_MAP.put(status.getStatusID(), status);
        }
    }

    private final int statusID;

    public int getStatusID() {
        return statusID;
    }

    Status(final int statusID) {
        this.statusID = statusID;
    }

    public static Status getStatusByID(final int statusID) {
        return STATUS_MAP.get(statusID) == null ? UNKNOWN : STATUS_MAP.get(statusID);
    }
}
