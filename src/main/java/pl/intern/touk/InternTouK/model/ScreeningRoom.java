package pl.intern.touk.InternTouK.model;

import java.util.Collection;

public class ScreeningRoom {

    private Collection<Seat> seats;
    private String name;

    public Collection<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Collection<Seat> seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
