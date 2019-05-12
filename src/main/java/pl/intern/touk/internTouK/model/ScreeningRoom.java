package pl.intern.touk.internTouK.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
public class ScreeningRoom implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "CINEMA_ID")
    private Cinema cinema;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "screeningRoom")
    private List<RowSeats> seats;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        ScreeningRoom screeningRoom = (ScreeningRoom) super.clone();
        List<RowSeats> newseats = new ArrayList<>();
        for (RowSeats oldRowSeat : seats) {
            RowSeats newRow = new RowSeats();
            newRow.setScreeningRoom(screeningRoom);
            newRow.setRow(new ArrayList<>());
            for (Seat seat : oldRowSeat.getRow()) {
                Seat newSeat = (Seat) seat.clone();
                newSeat.setRowSeats(newRow);
                newRow.getRow().add(newSeat);
            }
            newseats.add(newRow);
        }
        screeningRoom.setSeats(newseats);
        screeningRoom.setCinema(this.getCinema());
        return screeningRoom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<RowSeats> getSeats() {
        return seats;
    }

    public void setSeats(List<RowSeats> seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
