package pl.intern.touk.InternTouK.model;

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
    @JoinColumn(name = "Cinema_id")
    private Cinema cinema;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "screeningRoom")
    private List<RowSeats> seats;
    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        ScreeningRoom screeningRoom =(ScreeningRoom) super.clone();
        List<RowSeats> newseats = new ArrayList<>();
        for (RowSeats rowSeat :seats) {
            RowSeats rowSeats = new RowSeats();
            for (Seat seat: rowSeat.getRow()) {
                rowSeats.getRow().add((Seat)seat.clone());
            }
            newseats.add(rowSeats);
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
