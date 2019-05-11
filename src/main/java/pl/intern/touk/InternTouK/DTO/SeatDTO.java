package pl.intern.touk.InternTouK.DTO;

import pl.intern.touk.InternTouK.model.SeatState;
import pl.intern.touk.InternTouK.model.TicketType;

public class SeatDTO {
    private SeatState seatState;
    private TicketType type;
    private Double price;
    private String name;
    private String surname;

    public SeatState getSeatState() {
        return seatState;
    }

    public void setSeatState(SeatState seatState) {
        this.seatState = seatState;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
}
