package pl.intern.touk.internTouK.model;

import java.io.Serializable;

public enum TicketType implements Serializable {
    ADULT,
    STUDENT,
    CHILD;

    public String getType() {
        return this.name();
    }
}
