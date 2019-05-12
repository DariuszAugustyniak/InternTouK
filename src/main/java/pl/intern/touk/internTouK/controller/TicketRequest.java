package pl.intern.touk.internTouK.controller;

import pl.intern.touk.internTouK.validator.NameConstraint;
import pl.intern.touk.internTouK.validator.SeatConstraint;
import pl.intern.touk.internTouK.validator.SurNameConstraint;

public class TicketRequest {
    @NameConstraint
    String name;
    @SurNameConstraint
    String surname;
    String type;
    @SeatConstraint
    SeatRequest seatRequest;

    public SeatRequest getSeatRequest() {
        return seatRequest;
    }

    public void setSeatRequest(SeatRequest seatRequest) {
        this.seatRequest = seatRequest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
